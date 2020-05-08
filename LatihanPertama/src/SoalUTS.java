import java.io.*;
import java.util.*;

public class SoalUTS {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner inp = new Scanner(System.in);
        int suhu = inp.nextInt();
        int pilihan = inp.nextInt();
        double konv = 0;
        switch (pilihan){
            case 1: konv = (double) (suhu*4)/5; break;
            case 2: konv = (double) (suhu+273); break;
            case 3: konv = (double) (suhu*9)/5+32; break;
        }
        System.out.println(konv);
    }
}