import java.util.Scanner;

public class Mengeja {
    public static void main (String[] Args){
        Scanner ss = new Scanner(System.in);
        System.out.println("Selamat Datang :D");
        System.out.println("Anda sedang menggunakan program untuk membaca angka yang anda masukkan");
        System.out.println("Menjadi Kalimat yang runtut untuk dibaca");
        System.out.println("Silahkan gunakan menurut prosedur yang tertera terimakasih ");
        // Deklarasi
        int angka, ratusan, puluhan, satuan;
        System.out.print("Masukkan Angka sesuka Anda < 1000 : ");
        angka = ss.nextInt();
        System.out.println("Jadi Angka Anda "+angka);
        // Proses
        ratusan = angka/100;
        puluhan = (angka%100)/10;
        satuan = angka%10;
        // Penyeleksi Kondisi
        if (angka == 0)
            System.out.print("Nol ");
        else if (angka > 999)
            System.out.print("Angka anda terlalu tinggi ");
        switch (ratusan){
            case 1: System.out.print("Seratus "); break;
            case 2: System.out.print("Dua Ratus "); break;
            case 3: System.out.print("Tiga Ratus "); break;
            case 4: System.out.print("Empat Ratus "); break;
            case 5: System.out.print("Lima Ratus "); break;
            case 6: System.out.print("Enam Ratus "); break;
            case 7: System.out.print("Tujuh Ratus "); break;
            case 8: System.out.print("Delapan Ratus "); break;
            case 9: System.out.print("Sembilan Ratus "); break;}

        if (puluhan == 1)
            switch (satuan){
                case 0: System.out.print("Sepuluh "); break;
                case 1: System.out.print("Sebelas "); break;
                case 2: System.out.print("Dua Belas "); break;
                case 3: System.out.print("Tiga Belas "); break;
                case 4: System.out.print("Empat Belas "); break;
                case 5: System.out.print("Lima Belas "); break;
                case 6: System.out.print("Enam Belas "); break;
                case 7: System.out.print("Tujuh Belas "); break;
                case 8: System.out.print("Delapan Belas "); break;
                case 9: System.out.print("Sembilan Belas "); break;}
        else
            switch (puluhan){
                case 2: System.out.print("Dua Puluh "); break;
                case 3: System.out.print("Tiga Puluh "); break;
                case 4: System.out.print("Empat Puluh "); break;
                case 5: System.out.print("Lima Puluh "); break;
                case 6: System.out.print("Enam Puluh "); break;
                case 7: System.out.print("Tujuh Puluh "); break;
                case 8: System.out.print("Delapan Puluh "); break;
                case 9: System.out.print("Sembilan Puluh "); break;}
        if (puluhan != 1)
            switch (satuan){
                case 1: System.out.print("Satu "); break;
                case 2: System.out.print("Dua "); break;
                case 3: System.out.print("Tiga "); break;
                case 4: System.out.print("Empat "); break;
                case 5: System.out.print("Lima "); break;
                case 6: System.out.print("Enam "); break;
                case 7: System.out.print("Tujuh "); break;
                case 8: System.out.print("Delapan "); break;
                case 9: System.out.print("Sembilan "); break;
        }
    }
}