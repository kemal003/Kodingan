import java.util.Scanner;
public class Nomor2 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int bulan, tahun, jh;
        String namabulan;
        System.out.println("PENGHITUNG HARI");
        System.out.println("======================");
        System.out.print("Masukkan bulan: "); bulan = in.nextInt();
        System.out.print("Masukkan tahun: "); tahun = in.nextInt();
        switch (bulan){
            case 0 : System.out.println("Bulan 0 tidak ada"); return;
            case 2 : namabulan = "Februari"; if (tahun%4==0){jh = 29;} else jh = 28; break;
            case 1 : namabulan = "Januari"; jh = 31; break;
            case 3 : namabulan = "Maret"; jh = 31; break;
            case 5 : namabulan = "Mei"; jh = 31; break;
            case 7 : namabulan = "Juli"; jh = 31; break;
            case 8 : namabulan = "Agustus"; jh = 31; break;
            case 10: namabulan = "Oktober"; jh = 31; break;
            case 12: namabulan = "Desember"; jh = 31; break;
            case 4 : namabulan = "April"; jh = 30; break;
            case 6 : namabulan = "Juni"; jh = 30; break;
            case 9 : namabulan = "September"; jh = 30; break; 
            case 11: namabulan = "November"; jh = 30; break;
            default: System.out.println("Maaf bulan hanya sampai 12"); return;}
        System.out.println("Bulan yang dimasukkan adalah " + namabulan + " pada tahun " + tahun + " memiliki " + jh + " hari");
    }
}
