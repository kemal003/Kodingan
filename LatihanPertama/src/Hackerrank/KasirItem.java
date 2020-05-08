package Hackerrank;
import java.util.Scanner;
public class KasirItem {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        String nama;
        int diskon, pajak, hdiskon;
        int jumlah, harga, total1, total2;
        nama = in.nextLine();
        harga = in.nextInt();
        jumlah = in.nextInt();
        diskon = (int) (harga*20/100);
        hdiskon = (int) (harga - diskon);
        System.out.println("<<Kasir AD>>");
        System.out.println("Nama Item\t\t: " + nama);
        System.out.println("Harga\t\t\t: Rp." + harga);
        System.out.println("Jumlah Item\t\t: " + jumlah + '\n');
        //Penghitungan diskon
        total1 = (int) (jumlah*hdiskon);
        System.out.println("Diskon 20%\t\t: -Rp." + diskon);
        System.out.println("Total Harga\t\t: Rp." + total1 + '\n');
        //Penghitungan pajak
        pajak = (int) (0.01 * total1);
        System.out.println("Pajak 1%\t\t: +Rp." + pajak);
        total2 = (int) (pajak + total1);
        System.out.println("Total Harga\t\t: Rp." + total2 + '\n');
        //Output total akhir
        System.out.println("Total harga yang anda bayar sebesar " + total2 + " Rupiah");
    }
}
