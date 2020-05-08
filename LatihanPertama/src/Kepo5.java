import java.io.*;
import java.util.*;

public class Kepo5 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        long a = input.nextLong();
        long b = input.nextLong();
        long c = input.nextLong();
        long d = input.nextLong();
        long p = input.nextLong();
        long q = input.nextLong();
        long r = input.nextLong();
        long s = input.nextLong();
        //KEMUNGKINAN 1
        if(d>=b&&c>=a){
            if(((s>b&&s<d)||(q>b&&q<d))&&((r>a&&r<c)||(p>a&&p<c)))
                {System.out.println("Saling Berpotongan");}
            else System.out.println("Tidak Berpotongan");
        }
        //KEMUNGKINAN 2
        else if(d<=b&&c<=a){
            if(((s<b&&s>d)||(q<b&&q>d))&&((r<a&&r>c)||(p<a&&p>c)))
                {System.out.println("Saling Berpotongan");}
            else System.out.println("Tidak Berpotongan");
        }
        //KEMUNGKINAN 3
        else if(d<=b&&c>=a){
            if(((s<b&&s>d)||(q<b&&q>d))&&((r>a&&r<c)||(p>a&&p<c)))
                {System.out.println("Saling Berpotongan");}
            else System.out.println("Tidak Berpotongan");
        }
        //KEMUNGKINAN 4
        else if(d>=b&&c<=a){
            if(((s>b&&s<d)||(q>b&&q<d))&&((r<a&&r>c)||(p<a&&p>c)))
                {System.out.println("Saling Berpotongan");}
            else System.out.println("Tidak Berpotongan");
        }
        else System.out.println("Tidak Berpotongan");
    }
}