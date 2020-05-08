package Hackerrank;
import java.util.*;
public class LatihanUAP {
	public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        String angka = inp.nextLine();
        int bil1 = inp.nextInt();
        int bil2 = inp.nextInt();
        if (angka.length()<3) System.out.println("Panjang inputan adalah " + angka.length());
        else {
            String x = angka.substring(bil1, (bil1+1));
            String y = angka.substring(bil2, (bil2+1));
            int a = Integer.parseInt(x);
            int b = Integer.parseInt(y);
            System.out.printf("%d + %d = %d\n", a, b, a+b);
        }
    }
}