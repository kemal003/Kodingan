package AnuOjol;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AnuOjol {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Pesanan pesanan = new Pesanan();
        boolean lagiMilih=false;
        pesanan.tambahPengemudi(new PengemudiMobil("Abu", "AG 1238 YAX", 5.0, 12.0));
        pesanan.tambahPengemudi(new PengemudiMobil("Budi", "AG 9813 ZJ", 8.0, 9.0));
        pesanan.tambahPengemudi(new PengemudiMotor("Charlie", "AG 1279 RX", 9.0, 4.0));
        pesanan.tambahPengemudi(new PengemudiMotor("Delta", "AG 3465 SW", 3.0, 3.0));
        pesanan.tambahPengemudi(new PengemudiMotor("Zelda", "AG 6248 TR", 2.0, 2.0));
        pesanan.tambahPengemudi(new PengemudiMobilLarge("Eko", "N 8653 ABT", 5.5, 10.0));
        pesanan.tambahPengemudi(new PengemudiMobilLarge("Farhan", "N 4183 BRT", 9.5, 6.0));

        System.out.println("-----SELAMAT DATANG DI ANUOJOL------");
        System.out.print("Silahkan masukkan nama anda: "); String nama = inp.nextLine();
        pesanan.getPenumpang().setNama(nama);
        System.out.println("Hai, " + nama + "!");
        while (!pesanan.isSudahMemesan()) {
            try {
                lagiMilih = false;
                System.out.println("---MENU ANUOJOL---");
                System.out.println("1. Pilih titik jemput");
                System.out.println("2. Pilih titik tujuan");
                System.out.println("3. TopUp OPO");
                System.out.println("4. Buat Pesanan");
                System.out.print("Pilihan: ");
                int input = inp.nextInt();
                switch (input) {
                    case 1: {
                        System.out.println("Masukkan titik jemput! ");
                        System.out.print("X : ");
                        double xJemput = inp.nextDouble();
                        System.out.print("Y : ");
                        double yJemput = inp.nextDouble();
                        pesanan.getPenumpang().setJemput(xJemput, yJemput);
                        break;
                    }
                    case 2: {
                        System.out.println("Masukkan titik tujuan! ");
                        System.out.print("X : ");
                        double xTujuan = inp.nextDouble();
                        System.out.print("Y : ");
                        double yTujuan = inp.nextDouble();
                        pesanan.getPenumpang().setTujuan(xTujuan, yTujuan);
                        break;
                    }
                    case 3: {
                        System.out.println("--MENU TOPUP OPO--");
                        System.out.print("Silahkan masukkan nominal TopUp: Rp. ");
                        int topUP = inp.nextInt();
                        pesanan.getPenumpang().getOpo().tambahSaldo(topUP);
                        break;
                    }
                    case 4: {
                        lagiMilih = true;
                        System.out.println("--Moda yang tersedia--");
                        System.out.println("1. Motor");
                        System.out.println("2. Mobil");
                        System.out.println("3. Mobil (Large)");
                        System.out.print("Pilihan: "); int pilihan = inp.nextInt();
                        switch (pilihan){
                            case 1: {
                                pesanan.setPengemudiFix("Motor");
                                pesanan.startChecking();
//                                if (pesanan.isLokasiAda()){
//                                    if (pesanan.isSaldoMemenuhi()){
//                                        System.out.println("List pengemudi terdekat:");
//                                        System.out.println("========================");
//                                        for (int i = 0 ; i < pesanan.getPengemudiFix().size() ; i++) {
//                                            System.out.println(pesanan.getPengemudiFix().get(i));
//                                        }
//                                        pesanan.getPenumpang().getOpo().bayarOngkos(pesanan.getBayar());
//                                        System.out.println("Pesanan berhasil dibuat!");
//                                        pesanan.setSudahMemesan(true);
//                                        break;
//                                    }
//                                    else {
//                                        System.out.println("Maaf, saldo anda kurang. Silahkan top up");
//                                        System.out.printf("Kekurangan saldo sebesar: Rp. %,d\n", Math.abs(pesanan.getBayar()-pesanan.getPenumpang().getOpo().getIsiSaldo()));
//                                        System.out.println("TopUp atau Kembali ke Menu?");
//                                        System.out.print("(TopUp / Menu) : "); inp.nextLine();
//                                        String pilihanMenu = inp.nextLine();
//                                        if (pilihanMenu.equalsIgnoreCase("TOPUP")) {
//                                            while (!pesanan.isSaldoMemenuhi()){
//                                                System.out.println("===============");
//                                                System.out.printf("Masih kekurangan saldo sebesar: Rp. %,d\n", Math.abs(pesanan.getBayar()-pesanan.getPenumpang().getOpo().getIsiSaldo()));
//                                                System.out.print("Silahkan masukkan nominal TopUp: Rp. "); int topUp = inp.nextInt();
//                                                pesanan.getPenumpang().getOpo().tambahSaldo(topUp);
//                                                if (pesanan.isSaldoMemenuhi()) {
//                                                    pesanan.getPenumpang().getOpo().bayarOngkos(pesanan.getBayar());
//                                                    System.out.println("Pesanan berhasil dibuat!");
//                                                    pesanan.setSudahMemesan(true);
//                                                    break;
//                                                }
//                                                else {
//                                                    System.out.println("Saldo masih kurang. Lanjut TopUp?");
//                                                    System.out.print("(TopUp / Menu) : "); inp.nextLine();
//                                                    pilihanMenu = inp.nextLine();
//                                                    if (pilihanMenu.equalsIgnoreCase("Menu")) break;
//                                                }
//                                            }
//                                        }
//                                        else break;
//                                    }
//                                }
//                                else {
//                                    System.out.println("Maaf, lokasi belum lengkap");
//                                    break;
//                                }
                                break;
                            }
                            case 2: {
                                pesanan.setPengemudiFix("Mobil");
                                System.out.println("List pengemudi terdekat:");
                                System.out.println("========================");
                                for (int i = pesanan.getPengemudiFix().size()-1; i >= 0; i--) {
                                    System.out.println(pesanan.getPengemudiFix().get(i));
                                }

                            } break;
                            case 3: {

                            } break;
                            default:
                                System.out.println("Maaf, transportasi tidak tersedia");
                                break;
                        }
                    }
                    default: {
                        if (!lagiMilih) System.out.println("Maaf, menu tidak tersedia");
                    }
                }
            } catch (InputMismatchException inputX){
                System.err.println("Maaf, inputan tidak sesuai");
                inp.next();
            }
        }
    }
}
