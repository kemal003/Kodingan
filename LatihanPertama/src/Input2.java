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

public class Input2 {
    public static void main(String [] args){
        Scanner masuk = new Scanner (System.in);
        char a, b, c, d, e;
        a = masuk.next().charAt(0);
        b = masuk.next().charAt(0);
        c = masuk.next().charAt(0);
        d = masuk.next().charAt(0);
        e = masuk.next().charAt(0);
        System.out.printf("%c%c%c%c%c\n", e,c,b,d,a);
        
    }
}
