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

public class Testing {
    public static void main(String [] args){
        Scanner masuk = new Scanner(System.in);
        int x, y, tambah, kurang, kali;
        double bagi;
        System.out.print("Masukkan bilangan x : ");
        x = masuk.nextInt();
        System.out.print("Masukkan bilangan x : ");
        y = masuk.nextInt();
        System.out.println("x = " + x + " y = " + y);
        tambah = x + y;
        kurang = x - y;
        kali = x * y;
        bagi = x / y;
        System.out.println("Maka :");
        System.out.printf("x + y = %8d\n", tambah);
        System.out.printf("x - y = %8d\n", kurang);
        System.out.printf("x * y = %8d\n", kali);
        System.out.printf("x / y = %8.2f\n", bagi);
        
    }
}
