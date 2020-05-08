import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int p, x, y;
        p = in.nextInt(); x = in.nextInt(); y = in.nextInt();
        int panjang1, jarak;
        if (x<y) {panjang1 = x+p;}
        else panjang1 = y+p;
        if (y>panjang1){jarak = y - panjang1;}
        else jarak = panjang1-y;
        if (x==y){jarak=0;}
        System.out.println(jarak);
    }
}