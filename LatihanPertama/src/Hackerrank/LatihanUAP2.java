package Hackerrank;
import java.util.*;
public class LatihanUAP2 {
	/* JANGAN DIUBAH !!!. Cek kalau ada kesalahan sintaks mulai dari sini sampai... */
    public static void main(String[] args) {
        Scanner in2 = new Scanner(System.in);
      	String angka = in2.nextLine();
        int hasil = 0;
      	
    	/* ... sini. Usahakan tidak langsung lihat IDE */  
      
      	// Algoritma kalian di bawah ini.
        if (angka.length()<4) 
            System.out.println("Error, input tidak valid. Panjang inputan hanya " + angka.length());
        else {
            for (int i = 0; i < angka.length(); i++) {
                int x = Integer.parseInt(angka.substring(i,(i+1)));
                hasil+=x;    
            }    
            System.out.println(hasil);
        }
    }
}