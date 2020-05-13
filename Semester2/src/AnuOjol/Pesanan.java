package AnuOjol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Pesanan implements Pembayaran{
    private ArrayList<Pengemudi> listPengemudi;
    private ArrayList<Pengemudi> pengemudiFix;
    private Penumpang penumpang;
    private boolean sudahMemesan=false;

    public Pesanan() {
        listPengemudi = new ArrayList<>();
        pengemudiFix = new ArrayList<>();
        penumpang = new Penumpang();
    }

    public void tambahPengemudi(Pengemudi pengemudiBaru){
        listPengemudi.add(pengemudiBaru);
    }

    public ArrayList getListPengemudi() {
        return listPengemudi;
    }

    public Penumpang getPenumpang() {
        return penumpang;
    }

    public ArrayList getPengemudiFix() {
        return pengemudiFix;
    }

    public void setPengemudiFix(String pilihan) {
        ArrayList<Pengemudi> pengemudiFix = new ArrayList<>();
        for (int i = 0; i < listPengemudi.size(); i++) {
            if (listPengemudi.get(i).getTipe().equalsIgnoreCase(pilihan)) {
                pengemudiFix.add(listPengemudi.get(i));
            }
        }
        for (int i = 0; i < pengemudiFix.size(); i++) {
            pengemudiFix.get(i).setJarakKePenumpang(penumpang.getxJemput(), penumpang.getyJemput());
        }
        Collections.sort(pengemudiFix);
        this.pengemudiFix = pengemudiFix;
    }

    @Override
    public int getBayar() {
        return (int) Math.round(penumpang.getJarak()) * pengemudiFix.get(0).getBayar();
    }

    public boolean isSaldoMemenuhi() {
        if (penumpang.getOpo().getIsiSaldo()>=getBayar()) return true;
        else return false;
    }

    public boolean isLokasiAda() {
        if (penumpang.getxJemput()!=0 && penumpang.getyJemput()!=0){
            if (penumpang.getxTujuan()!=0 && penumpang.getyTujuan()!=0){
                return true;
            }
            else return false;
        }
        else return false;
    }

    public boolean isSudahMemesan() {
        return sudahMemesan;
    }

    public void setSudahMemesan(boolean sudahMemesan) {
        this.sudahMemesan = sudahMemesan;
    }

    public void startChecking() {
        Scanner inp = new Scanner(System.in);
        if (isLokasiAda()){
            if (isSaldoMemenuhi()){
                System.out.println("List pengemudi terdekat:");
                System.out.println("========================");
                for (int i = 0 ; i < getPengemudiFix().size() ; i++) {
                    System.out.println(getPengemudiFix().get(i));
                }
                getPenumpang().getOpo().bayarOngkos(getBayar());
                System.out.println("Pesanan berhasil dibuat!");
                setSudahMemesan(true);
            }
            else {
                System.out.println("Maaf, saldo anda kurang. Silahkan top up");
                System.out.printf("Kekurangan saldo sebesar: Rp. %,d\n", Math.abs(getBayar()-getPenumpang().getOpo().getIsiSaldo()));
                System.out.println("TopUp atau Kembali ke Menu?");
                System.out.print("(TopUp / Menu) : ");
                String pilihanMenu = inp.nextLine();
                if (pilihanMenu.equalsIgnoreCase("TOPUP")) {
                    boolean pertama=true;
                    while (!isSaldoMemenuhi()){
                        if (!pertama) {
                            System.out.println("Saldo masih kurang. Lanjut TopUp?");
                            System.out.print("(TopUp / Menu) : "); inp.nextLine();
                            pilihanMenu = inp.nextLine();
                            if (pilihanMenu.equalsIgnoreCase("Menu")) break;
                        }
                        pertama=false;
                        System.out.println("===============");
                        System.out.printf("Masih kekurangan saldo sebesar: Rp. %,d\n", Math.abs(getBayar()-getPenumpang().getOpo().getIsiSaldo()));
                        System.out.print("Silahkan masukkan nominal TopUp: Rp. "); int topUp = inp.nextInt();
                        getPenumpang().getOpo().tambahSaldo(topUp);
                        if (isSaldoMemenuhi()) {
                            getPenumpang().getOpo().bayarOngkos(getBayar());
                            System.out.println("Pesanan berhasil dibuat!");
                            setSudahMemesan(true);
                            break;
                        }
                        else {
                            System.out.println("Saldo masih kurang. Lanjut TopUp?");
                            System.out.print("(TopUp / Menu) : "); inp.nextLine();
                            pilihanMenu = inp.nextLine();
                            if (pilihanMenu.equalsIgnoreCase("Menu")) break;
                        }
                    }
                }
            }
        }
        else {
            System.out.println("Maaf, lokasi belum lengkap");
        }
    }
}
