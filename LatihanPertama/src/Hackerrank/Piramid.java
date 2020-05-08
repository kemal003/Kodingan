package Hackerrank;
import java.util.*;
public class Piramid {
public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        for (int i=1;i<=x;i++){
            for(int j=x-1;j>=i;j--)
                System.out.print(" ");
            for(int k=1;k<=i;k++)
                System.out.print("* ");
            System.out.println();
        }
    }
}