import java.util.Scanner;

public class Pencoba {
    public static void main(String args[] ){
        // Masukkan kode kalian di bawah komentar ini
        Scanner masuk = new Scanner (System.in);
        int umur;
        String nama;
        String alamat;
        String blank;
        System.out.println("Berapa umurnya? ");
            umur = masuk.nextInt();
        System.out.println("Siapa namanya? ");
            blank = masuk.nextLine();
            nama = masuk.nextLine();
        System.out.println("Alamatnya? ");
            alamat = masuk.nextLine();
        System.out.println(umur);
        System.out.println(nama);
        System.out.println(alamat);
        System.out.println("");
    }
}