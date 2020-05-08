package UAP;
import java.util.*;
public class UAP1 {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        int min=0, min2=0, x;
        int banyak = inp.nextInt();
        int[] arr = new int[banyak];
        for (int i = 0; i < banyak; i++) {
            arr[0] = inp.nextInt();
        }
        for (int i = 0; i < banyak; i++) {
            if (i==0) min=arr[i];
            x=arr[i];
            if (min>arr[i]) min=arr[i];
            if (min2<x && min2>min) min2=arr[i];
        }
        System.out.println((min2-min));
    }
}
