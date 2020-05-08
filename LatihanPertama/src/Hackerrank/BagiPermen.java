package Hackerrank;
import java.util.Scanner;
public class BagiPermen {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        long n, i, j;
        long permen1, permen2, sisa1, sisa2;
        n = in.nextLong();
        i = in.nextLong();
        j = in.nextLong();
        //Permen pada sesi 1
        permen1 = (n/2)/i;
        //Sisa permen pada sesi 1
        sisa1 = (n/2)%i;
        System.out.println("setiap anak sesi 1 dapat " + permen1 + " permen");
        //Permen pada sesi 2 ditambahkan dengan sisa dari sesi 1
        permen2 = ((n/2)+sisa1)/j;
        //Sisa permen pada sesi 2
        sisa2 = ((n/2)+sisa1)%j;
        System.out.println("setiap anak sesi 2 dapat " + permen2 + " permen");
        System.out.println("sisa permen adalah " + sisa2);
    }
}
