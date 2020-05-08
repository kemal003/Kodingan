package Hackerrank;
import java.util.Scanner;
public class JarakPersegi {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        long p, x, y; 
        //Jarak diisi default = 0
        long jarak=0;
        p = in.nextLong(); 
        x = in.nextLong(); 
        y = in.nextLong();
        //Jika titik X di sebelah kanan Y maka: 
        if (x>y){jarak = x - (y+p);}
        //Jika titik Y di sebelah kanan X maka:
        else if (y>x){jarak = y - (x+p);}
        /*Jika titik X sama dengan titik Y atau persegi 1
        bertabrakan dengan persegi 2*/
        if (x==y || jarak<0){System.out.println("0");}
        //Jika persegi tidak bertabrakan dan memenuhi syarat2 diatas
        else if (jarak>0){System.out.println(jarak);}
    }
}

