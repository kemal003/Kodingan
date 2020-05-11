package Ojol;
import Ojol.JenisModa.Moda;
import Ojol.JenisModa.SepedaMotor;

import java.io.*;
import java.util.*;

public class MainOjol {
    public static void main(String[] args) throws IOException {
        File filePengemudi = new File("//home//kemalabd//Documents//Pengemudi.txt");
        String[] listData = new String[9];
        BufferedReader reader = new BufferedReader(new FileReader(filePengemudi));
        String data;
        for (int i = 0; (data = reader.readLine()) != null; i++) {
            listData[i] = data;
            System.out.println(listData[5]);
        }

        Scanner inp = new Scanner(System.in);
        String resultSementara="";
        String result="";
        Penumpang penumpang = new Penumpang();
        Pemesanan pemesanan = new Pemesanan();
        String line="UWAW";
        while (!(line.isEmpty())){
            line = inp.nextLine();
            if (line.contains("ANTAR")) {
                penumpang = new Penumpang(line.substring(6));
                resultSementara+="CALON_PENUMPANG " + line + '\n';
            }
            else if (line.contains("TOPUP")){
                penumpang.geteDompet().topUp(Double.parseDouble(line.substring(6)));
                resultSementara+=String.format("TOTAL_SALDO %.1f\n", penumpang.geteDompet().getSaldo());
            }
            else if (line.contains("SETLOKASI JEMPUT")){
                String angka = line.substring(17);
//                System.out.println(angka);
                double xJemput=0;
                double yJemput=0;
                for (int i = 0; i < angka.length(); i++) {
                    if (angka.startsWith(" ", i)){
                        xJemput = Double.parseDouble(angka.substring(0,i));
                        yJemput = Double.parseDouble(angka.substring(i+1));
                    }
                }
//                System.out.println("TEST " + xJemput + " " + yJemput);
                penumpang.getLokasi().setJemput(xJemput, yJemput);
            }
            else if (line.contains("SETLOKASI TUJUAN")){
                String angka = line.substring(17);
//                System.out.println(angka);
                double xAntar=0;
                double yAntar=0;
                for (int i = 0; i < angka.length(); i++) {
                    if (angka.startsWith(" ", i)){
                        xAntar = Double.parseDouble(angka.substring(0,i));
                        yAntar = Double.parseDouble(angka.substring(i+1));
                    }
                }
//                System.out.println("TEST " + xAntar + " " + yAntar);
                penumpang.getLokasi().setAntar(xAntar, yAntar);
            }
            else if (line.contains("PESAN")){
                String jenisModa = line.substring(6);
                pemesanan = new Pemesanan(penumpang);
                Moda moda = Moda.valueOf(jenisModa);
                if (pemesanan.getPenumpang().getLokasi().isAntarMissing()) {
                    resultSementara+=String.format("PESANAN %s %s GAGAL LOKASI TUJUAN TIDAK ADA\n",
                            jenisModa, pemesanan.getPenumpang().getNama());
                }
                if (pemesanan.getPenumpang().getLokasi().isJemputMissing()){
                    resultSementara+=String.format("PESANAN %s %s GAGAL LOKASI JEMPUT TIDAK ADA\n",
                            jenisModa, pemesanan.getPenumpang().getNama());
                }
                if (pemesanan.getPenumpang().getLokasi().isLokasiMemenuhi()){
                    if (pemesanan.isPengemudiAda(moda)) {
                        if (pemesanan.getPenumpang().geteDompet().isSaldoMemenuhi(pemesanan.getOngkos()) && pemesanan.getPenumpang().getLokasi().isLokasiMemenuhi()){
                            resultSementara+=String.format("PESANAN %s %s BERHASIL\n", pemesanan.getPenumpang().getNama(), jenisModa);
                            pemesanan.setSudahMemesan(true);
                        }
                        else {
                            resultSementara+=String.format("PESANAN %s %s GAGAL SALDO KURANG %.1f\n", jenisModa,
                                pemesanan.getPenumpang().getNama(), pemesanan.getBayar());
                        }
                    }
                    else {
                        System.out.println(pemesanan.isPengemudiAda(moda));
                        resultSementara+=String.format("PESANAN %s %s GAGAL PENGEMUDI TIDAK TERSEDIA\n",
                            jenisModa, pemesanan.getPenumpang().getNama());
                    }
                }
            }
            if (line.contains("STATUS")) {
                result += resultSementara + pemesanan;
                resultSementara = "";
            }
        }
        System.out.println(result);
    }
}
