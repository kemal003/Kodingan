import java.io.*;
import java.util.*;

public class For {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner inp = new Scanner(System.in);
        long x;
        long xmax=0, xmin=0;
        long n = inp.nextLong();
        for (int i=0; i<=n; i++){
            x = inp.nextLong();
            if (xmax>x){
                xmax=x;
                }
            if (xmin<x){
                xmin=x;
            }
        }
        System.out.printf("%d %d", xmin, xmax);
    }
}