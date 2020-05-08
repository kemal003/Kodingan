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

public class GanjilGenap {
    private static final Scanner input = new Scanner (System.in);
    public static void main(String[] a){
        int bilangan;
        System.out.println("Berapa bilangannya?");
        bilangan = input.nextInt();
        if (bilangan % 2 == 0) {System.out.println("Ini genap");}
        else {System.out.println("Ini ganjil");}
        
        }
    }
    
