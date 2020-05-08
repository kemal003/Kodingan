import java.util.Scanner;
public class Calculator {
    public static void main(String [] args){
        Scanner in = new Scanner (System.in);
        int desimal;
        int oktal;
        int heksa;
        int jawab1;
        int jawab2;
        System.out.println("Pilih 1 - 3 tipe bilangan yang akan dihitung!");
        System.out.println("1. Oktal");
        System.out.println("2. Desimal");
        System.out.println("3. Heksadesimal");
        System.out.print("Pilihan -> ");
        jawab1 = in.nextInt();
        if (jawab1==1){
            System.out.print("Masukkan bilangan oktal : ");             
            oktal = in.nextInt(8);
            System.out.println("==============================");
            System.out.println("Akan diubah ke bilangan apa?");
            System.out.println("1. Desimal");
            System.out.println("2. Heksadesimal");
            System.out.print("Pilihan -> ");
            jawab2 = in.nextInt();
            if (jawab2==1){
                System.out.printf("Maka bilangan tersebut dalam desimal adalah : %-6d\n", oktal);
                }
            else System.out.printf("Maka bilangan tersebut dalam heksadesimal adalah : %-6X\n", oktal);
            }
        if (jawab1==2){
            System.out.print("Masukkan bilangan desimal : ");
            desimal = in.nextInt();
            System.out.println("==============================");
            System.out.println("Akan diubah ke bilangan apa?");
            System.out.println("1. Oktal");
            System.out.println("2. Heksadesimal");
            System.out.print("Pilihan -> ");
            jawab2 = in.nextInt();
            if (jawab2==1){
                System.out.printf("Maka bilangan tersebut dalam oktal adalah : %-6o\n", desimal);
                }
            else System.out.printf("Maka bilangan tersebut dalam heksadesimal adalah : %-6X\n", desimal);
            }
        if (jawab1==3){
            System.out.print("Masukkan bilangan heksadesimal : ");
            heksa = in.nextInt(16);
            System.out.println("==============================");
            System.out.println("Akan diubah ke bilangan apa?");
            System.out.println("1. Oktal");
            System.out.println("2. Desimal");
            System.out.print("Pilihan -> ");
            jawab2 = in.nextInt();
            if (jawab2==1){
                System.out.printf("Maka bilangan tersebut dalam oktal adalah : %-6o\n", heksa);
                }
            else System.out.printf("Maka bilangan tersebut dalam desimal adalah : %-6d\n", heksa);
            }
        }   
    }
