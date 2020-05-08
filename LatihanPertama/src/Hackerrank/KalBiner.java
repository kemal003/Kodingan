package Hackerrank;

import java.util.*;
public class KalBiner {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner inp = new Scanner(System.in);
        String bin = inp.nextLine();
        int a = inp.nextInt();
        int b = inp.nextInt();
        String xbin = bin.substring(a,(b+1));
        long hasil = new Scanner(xbin).nextLong(2);
        if (bin.charAt(0)=='1') System.out.print("-");
        System.out.println(hasil);
    }
}
