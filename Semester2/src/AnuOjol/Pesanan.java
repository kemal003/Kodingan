package AnuOjol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class Pesanan implements Pembayaran{
    private ArrayList<Pengemudi> listPengemudi;
    private ArrayList<Pengemudi> pengemudiFix;
    private Penumpang penumpang;
    private boolean sudahMemesan=false;
    private boolean pengemudiKosong=true;

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

    public boolean isPengemudiKosong() {
        return pengemudiKosong;
    }

    public void setPengemudiFix(String pilihan) {
        ArrayList<Pengemudi> pengemudiFix = new ArrayList<>();
        for (int i = 0; i < listPengemudi.size(); i++) {
            if (listPengemudi.get(i).getTipe().equalsIgnoreCase(pilihan)) {
                pengemudiFix.add(listPengemudi.get(i));
                pengemudiKosong=false;
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

    public boolean isLokasiMasukAkal() {
        if (penumpang.getJarak()!=0) return true;
        else return false;
    }

    public void startChecking() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        if (isLokasiAda()){
            System.out.printf("Total Ongkos: Rp. %,d\n", getBayar());
            if (isSaldoMemenuhi()){
                if (isLokasiMasukAkal()) {
                    System.out.println("KONFIRMASI PEMBAYARAN");
                    System.out.printf("Tipe Pesanan: %s\n", pengemudiFix.get(0).getTipe());
                    System.out.printf("Titik jemput: (%.1f ; %.1f)\n", penumpang.getxJemput(), penumpang.getyJemput());
                    System.out.printf("Titik tujuan: (%.1f ; %.1f)\n", penumpang.getyTujuan(), penumpang.getyTujuan());
                    System.out.printf("Jarak: %.1f\n", penumpang.getJarak());
                    System.out.printf("Total bayar: Rp. %,d\n", getBayar());
                    System.out.println("Bayar atau kembali ke Menu?");
                    System.out.print("(Bayar / Menu) : ");
                    String pilihan = reader.readLine();
                    if (pilihan.equalsIgnoreCase("Bayar")) {
                        getPenumpang().getOpo().bayarOngkos(getBayar());
                        System.out.println("Pesanan berhasil dibuat!");
                        setSudahMemesan(true);
                    }
                }
                else {
                    System.out.println("Maaf, lokasi yang anda set sepertinya salah.");
                }
            }
            else {
                System.out.println("Maaf, saldo anda kurang. Silahkan top up.");
                System.out.printf("Kekurangan saldo sebesar: Rp. %,d\n", Math.abs(getBayar()-getPenumpang().getOpo().getIsiSaldo()));
                System.out.println("TopUp atau Kembali ke Menu?");
                System.out.print("(TopUp / Menu) : ");
                String pilihanMenu = reader.readLine();
                boolean pertama=true;
                if (pilihanMenu.equalsIgnoreCase("TOPUP")) {
                    while (!isSaldoMemenuhi()){
                        if (!pertama) {
                            System.out.println("Saldo masih kurang. Lanjut TopUp?");
                            System.out.print("(TopUp / Menu) : ");
                            pilihanMenu = reader.readLine();
                            if (!pilihanMenu.equalsIgnoreCase("TopUp")) break;
                        }
                        pertama=false;
                        System.out.println("===============");
                        System.out.printf("Masih kekurangan saldo sebesar: Rp. %,d\n", Math.abs(getBayar()-getPenumpang().getOpo().getIsiSaldo()));
                        System.out.print("Silahkan masukkan nominal TopUp: Rp. "); int topUp = Integer.parseInt(reader.readLine());
                        getPenumpang().getOpo().tambahSaldo(topUp);
                        if (isSaldoMemenuhi()) {
                            if (isLokasiMasukAkal()) {
                                System.out.println("=========================");
                                System.out.println("KONFIRMASI PEMBAYARAN");
                                System.out.printf("Tipe Pesanan: %s\n", pengemudiFix.get(0).getTipe());
                                System.out.printf("Titik jemput: (%.1f ; %.1f)\n", penumpang.getxJemput(), penumpang.getyJemput());
                                System.out.printf("Titik tujuan: (%.1f ; %.1f)\n", penumpang.getyTujuan(), penumpang.getyTujuan());
                                System.out.printf("Jarak: %.1f\n", penumpang.getJarak());
                                System.out.printf("Total bayar: Rp. %,d\n", getBayar());
                                System.out.println("Bayar atau kembali ke Menu?");
                                System.out.print("(Bayar / Menu) : ");
                                String pilihan = reader.readLine();
                                if (pilihan.equalsIgnoreCase("Bayar")) {
                                    getPenumpang().getOpo().bayarOngkos(getBayar());
                                    System.out.println("Pesanan berhasil dibuat!");
                                    setSudahMemesan(true);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        else {
            System.out.println("Maaf, lokasi belum lengkap.");
        }
    }

    @Override
    public String toString() {
        String result="";
        result+="===================\n";
        result+=String.format("Nama Pemesan: %s\n", penumpang.getNama());
        result+=String.format("Saldo Awal: Rp. %,d\n", penumpang.getOpo().getIsiSaldo()+getBayar());
        result+=String.format("Saldo Akhir: Rp. %,d\n", penumpang.getOpo().getIsiSaldo());
        result+="=======================\n";
        result+=String.format("Info Pengemudi: \n%s", pengemudiFix.get(0));
        result+="==========================\n";
        result+="Pengemudi terdekat lainnya: \n";
        for (int i = 1; i < pengemudiFix.size() && i < 3; i++) {
            result+=pengemudiFix.get(i);
            result+='\n';
        }
        return result;
    }
}