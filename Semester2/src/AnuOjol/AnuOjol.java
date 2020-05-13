package AnuOjol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnuOjol {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Pesanan pesanan = new Pesanan();
        pesanan.tambahPengemudi(new PengemudiMobil("Abu", "AG 1238 YAX", 5.0, 12.0));
        pesanan.tambahPengemudi(new PengemudiMobil("Budi", "AG 9813 ZJ", 8.0, 9.0));
        pesanan.tambahPengemudi(new PengemudiMotor("Charlie", "AG 1279 RX", 9.0, 4.0));
        pesanan.tambahPengemudi(new PengemudiMotor("Delta", "AG 3465 SW", 3.0, 3.0));
        pesanan.tambahPengemudi(new PengemudiMobilLarge("Eko", "N 8653 ABT", 5.5, 10.0));
        pesanan.tambahPengemudi(new PengemudiMobilLarge("Farhan", "N 4183 BRT", 9.5, 6.0));

        pesanan.tambahPengemudi(new PengemudiMotor("Kemal", "AG 9999 YAF", 10.0, 5.0));
        pesanan.tambahPengemudi(new PengemudiMotor("Iwang", "N 2532 RT", 3.0, 4.0));
        pesanan.tambahPengemudi(new PengemudiMobil("Adam", "L 8472 A", 5.0, 2.0));

        System.out.println("-----SELAMAT DATANG DI ANUOJOL------");
        System.out.println("Jumlah moda teregistrasi: ");
        System.out.println("Motor: " + PengemudiMotor.getJumlahModa());
        System.out.println("Mobil: " + PengemudiMobil.getJumlahModa());
        System.out.println("Mobil (Large): " + PengemudiMobilLarge.getJumlahModa());
        System.out.print("Silahkan masukkan nama anda: "); String nama = reader.readLine();
        pesanan.getPenumpang().setNama(nama);
        System.out.println("Hai, " + nama + "!");
        while (!pesanan.isSudahMemesan()) {
            try {
                System.out.println("---MENU ANUOJOL---");
                System.out.println("1. Pilih titik jemput");
                System.out.println("2. Pilih titik tujuan");
                System.out.println("3. TopUp OPO");
                System.out.println("4. Buat Pesanan");
                System.out.println("5. Cancel");
                System.out.printf("Saldo OPO Anda: Rp. %,d\n", pesanan.getPenumpang().getOpo().getIsiSaldo());
                System.out.print("Pilihan: ");
                int input = Integer.parseInt(reader.readLine());
                switch (input) {
                    case 1: {
                        System.out.println("Masukkan titik jemput! ");
                        System.out.print("X : ");
                        double xJemput = Double.parseDouble(reader.readLine());
                        System.out.print("Y : ");
                        double yJemput = Double.parseDouble(reader.readLine());
                        pesanan.getPenumpang().setJemput(xJemput, yJemput);
                        break;
                    }
                    case 2: {
                        System.out.println("Masukkan titik tujuan! ");
                        System.out.print("X : ");
                        double xTujuan = Double.parseDouble(reader.readLine());
                        System.out.print("Y : ");
                        double yTujuan = Double.parseDouble(reader.readLine());
                        pesanan.getPenumpang().setTujuan(xTujuan, yTujuan);
                        break;
                    }
                    case 3: {
                        System.out.println("--MENU TOPUP OPO--");
                        System.out.print("Silahkan masukkan nominal TopUp: Rp. ");
                        int topUP = Integer.parseInt(reader.readLine());
                        pesanan.getPenumpang().getOpo().tambahSaldo(topUP);
                        break;
                    }
                    case 4: {
                        System.out.println("--Moda yang tersedia--");
                        System.out.println("1. Motor");
                        System.out.println("2. Mobil");
                        System.out.println("3. Mobil (Large)");
                        System.out.print("Pilihan: "); int pilihan = Integer.parseInt(reader.readLine());
                        switch (pilihan){
                            case 1: {
                                pesanan.setPengemudiFix("Motor");
                                if (pesanan.isPengemudiKosong()) System.out.println("Maaf, moda ini sekarang belum tersedia.");
                                else pesanan.startChecking();
                                break;
                            }
                            case 2: {
                                pesanan.setPengemudiFix("Mobil");
                                if (pesanan.isPengemudiKosong()) System.out.println("Maaf, moda ini sekarang belum tersedia.");
                                else pesanan.startChecking();
                            } break;
                            case 3: {
                                pesanan.setPengemudiFix("Mobil (Large)");
                                if (pesanan.isPengemudiKosong()) System.out.println("Maaf, moda ini sekarang belum tersedia.");
                                else pesanan.startChecking();
                            } break;
                            default:
                                System.out.println("Maaf, transportasi tidak tersedia");
                                break;
                        }
                    } break;
                    case 5: {
                        System.out.println("--Terima kasih telah menggunakan jasa AnuOjol--");
                        return;
                    }
                    default: {
                        System.out.println("Maaf, menu tidak tersedia");
                    }
                }
            } catch (NumberFormatException inputX){
                System.err.println("Maaf, inputan tidak sesuai");
            }
        }
        System.out.print(pesanan);
        System.out.println("Pengemudi sedang menuju arah anda.");
        System.out.println("--Terima kasih telah menggunakan jasa AnuOjol--");
    }
}
