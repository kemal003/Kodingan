package Hackerrank;
import java.util.Scanner;
public class PembagianYangAdil {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int buah = in.nextInt();
        int anak = in.nextInt();
        int banak=0; int bortu=0; int sisa=0;
        //Jika anak kurang dari sama dengan 0 atau buah negatif
        if (anak<=0 || buah<0){System.out.print("Inputan tidak valid"); return;}
        //Jika buah kurang dari jumlah anak
        if (buah<anak){
            //Jika buah tidak bisa dibagi sama rata untuk ortu
            if (buah%2!=0){
                banak=0;
                bortu=0;
                sisa=buah;}
        }
        //Jika buah memenuhi jumlah anak
        if (buah>=anak){
            banak=buah/anak;
            //Jika sisa buah tidak bisa dibagi rata untuk ortu
            if ((buah%anak)%2!=0){
                bortu=0;
                sisa=buah%anak;}
            //Jika sisa buah bisa dibagi sama rata untuk ortu
            else if ((buah%anak)%2==0){
                bortu=(buah%anak)/2;
                sisa=0;}
        }
        System.out.println("Masing-masing anak mendapatkan " + banak + " buah");
        System.out.println("Masing-masing ayah dan ibu mendapatkan " + bortu + " buah");
        System.out.println("Masih ada " + sisa + " buah yang tidak dibagi");
    }
}
