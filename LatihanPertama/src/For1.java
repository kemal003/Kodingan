/*
TUGAS 1

Nama    : Muhammad Azwar Kemal Abdillah
NIM     : 195150207111007
ID HR   : kemal_003
Kelas   : TIF - A

*/

import java.util.Scanner;
public class For1 {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Silahkan masukkan panjang susunan angka: "); 
        int n = inp.nextInt();
        System.out.println("Maka susunan yang terbentuk adalah: ");
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(i);
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
