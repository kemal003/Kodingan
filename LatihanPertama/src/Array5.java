import java.io.*;
import java.util.*;

public class Array5 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int N = inp.nextInt();
        int[] arr = new int [N];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i==0) arr[i]=a;
            else arr[i]=arr[i-a]+b;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            sum+=arr[i];
        }
        System.out.println("");
    }
}