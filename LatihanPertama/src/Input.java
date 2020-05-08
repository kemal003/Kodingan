/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Input {
    public static void main(String [] args){
        Scanner masuk = new Scanner(System.in);
        String nama;
        String ktp;
        String alamat;
        String hp;
        String prodi; 
        String d = "DATA DIRI";
        System.out.println("Siapa namanya?");
        nama = masuk.nextLine();
        System.out.println("\nBerapa nomor KTP-nya?");
        ktp = masuk.nextLine();
        System.out.println("\nAlamatnya?");
        alamat = masuk.nextLine();
        System.out.println("\nBerapa nomor HP-nya?");
        hp = masuk.nextLine();
        System.out.println("\nProgram studi apa?");
        prodi = masuk.nextLine();
        System.out.println(" ");
        System.out.printf("%19s \n\n", d);
        System.out.printf("%-20s", "Nama");
        System.out.println(": " +nama);
        System.out.printf("%-20s", "No. KTP");
        System.out.println(": " +ktp);
        System.out.printf("%-20s", "Alamat");
        System.out.println(": " + alamat);
        System.out.printf("%-20s", "No. HP");
        System.out.println(": " + hp);
        System.out.printf("%-20s", "Program Studi");
        System.out.println(": " + prodi);
    }
    
}
