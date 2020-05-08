import java.util.Scanner;

public class CalculatorBiner {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int biner;
        int oktal;
        int heksa;
        int jawab;
        System.out.println("Silahkan memilih 1 - 3 untuk tipe bilangan yang akan diubah ke dalam desimal!");
        System.out.println("1. Biner");
        System.out.println("2. Oktal");
        System.out.println("3. Heksadesimal");
        System.out.print("Pilihan : ");
        jawab = in.nextInt();
        if (jawab == 1) {System.out.print("Masukkan bilangan biner : ");
                biner = in.nextInt(2);
            System.out.println("Maka bilangan tersebut dalam desimal adalah = " + biner);}
                else if (jawab == 2) {System.out.print("Masukkan bilangan oktal : ");
                oktal = in.nextInt(8);
            System.out.println("Maka bilangan tersebut dalam desimal adalah = " + oktal);}
                else if (jawab == 3) {System.out.print("Masukkan bilangan heksadesimal : ");
                heksa = in.nextInt(16);
            System.out.println("Maka bilangan tersebut dalam desimal adalah : " + heksa);}
        
    }
        }
        
