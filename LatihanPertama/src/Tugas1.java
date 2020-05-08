/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Tugas1 {
    public static void main(String [] args){
        String a1 = "a";
        String b2 = "b";
        String t = "a + b";
        double a = 15.25;
        double b = 27.6523;
        double total = a + b;
        System.out.println("a : " + a + "\nb : " + b);
        System.out.printf("Jika a = " + "%-5.3f" + " dan b = " + "%-5.5f\n\n", a, b);
        System.out.println("maka :");
        System.out.printf("%-6s" + " = " + "%6.5f\n", a1, a);
        System.out.printf("%-6s" + " = " + "%6.5f\n", b2, b);
        System.out.print("----------------- +\n");
        System.out.printf("%-6s" + " = " + "%6.5f\n", t, total);
     }
}
