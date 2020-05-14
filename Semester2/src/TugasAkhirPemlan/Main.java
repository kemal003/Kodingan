package TugasAkhirPemlan;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sos = new Scanner(System.in);
        int pilihan;
        String nama;
        int umur;
        boolean lanjut=true;
        ArrayList<PenerimaanPegawaiKeefci> pegawaiBaru = new ArrayList<>();

        System.out.println(PenerimaanPegawaiKeefci.getRestaurant());
        System.out.println("Selamat datang di perekrutan");
        System.out.println("-------------------------------------------");
        System.out.print("Masukkan nama anda : "); nama = sos.nextLine();
        System.out.print("Masukkan umur anda : "); umur = sos.nextInt();
        sos.nextLine();
        System.out.println("Masukkan jenis kelamin anda ?");
        System.out.println("1. laki-laki");
        System.out.println("2. perempuan");
        System.out.print("Pilihan: "); pilihan = sos.nextInt();
        if (pilihan == 1) pegawaiBaru.add(new PegawaiPria(nama, true, umur));
        else pegawaiBaru.add(new PegawaiWanita(nama, false, umur));

        System.out.println("Adakah pegawai lain yang ingin ditambahkan?");
        System.out.println("Ya / Tidak : "); String option = sos.nextLine();
        if (option.equalsIgnoreCase("Ya")) lanjut = true;
        else lanjut = false;
        while (lanjut) {
            System.out.print("Masukkan nama anda : "); nama = sos.nextLine();
            System.out.print("Masukkan umur anda : "); umur = sos.nextInt();
            sos.nextLine();
            System.out.println("Masukkan jenis kelamin anda ?");
            System.out.println("1. laki-laki");
            System.out.println("2. perempuan");
            System.out.print("Pilihan: "); pilihan = sos.nextInt();
            if (pilihan == 1) pegawaiBaru.add(new PegawaiPria(nama, true, umur));
            else pegawaiBaru.add(new PegawaiWanita(nama, false, umur));
            System.out.println("Adakah pegawai lain yang ingin ditambahkan?");
            System.out.println("Ya / Tidak : "); option = sos.nextLine();
            if (option.equalsIgnoreCase("Ya")) lanjut = true;
            else lanjut = false;
        }
        System.out.println("LIST PEGAWAI BARU");
        for (int i = 0; i < pegawaiBaru.size(); i++) {
            System.out.println(pegawaiBaru.get(i));
            System.out.println();
        }
    }
}
