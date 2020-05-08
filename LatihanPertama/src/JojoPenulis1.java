import java.io.*;
import java.util.*;

public class JojoPenulis1{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner inp = new Scanner(System.in);
        String kalimat1 = inp.nextLine();
        String kalimat2 = inp.nextLine();
        if (kalimat1.length()>20 || kalimat2.length()>20){
            System.out.println("ERROR");}
        else if (kalimat1.length() == kalimat2.length()){
            System.out.println("SAMA");}    
        else  if (kalimat1.length()>kalimat2.length()){
            int a = kalimat1.length();
            switch (a) {
                    case 1 : System.out.printf("%s\n%1s\n", kalimat1, kalimat2); break;
                    case 2 : System.out.printf("%s\n%2s\n", kalimat1, kalimat2); break;
                    case 3 : System.out.printf("%s\n%3s\n", kalimat1, kalimat2); break;
                    case 4 : System.out.printf("%s\n%4s\n", kalimat1, kalimat2); break;
                    case 5 : System.out.printf("%s\n%5s\n", kalimat1, kalimat2); break;
                    case 6 : System.out.printf("%s\n%6s\n", kalimat1, kalimat2); break;
                    case 7 : System.out.printf("%s\n%7s\n", kalimat1, kalimat2); break;
                    case 8 : System.out.printf("%s\n%8s\n", kalimat1, kalimat2); break;
                    case 9 : System.out.printf("%s\n%9s\n", kalimat1, kalimat2); break;
                    case 10 : System.out.printf("%s\n%10s\n", kalimat1, kalimat2); break;
                    case 11 : System.out.printf("%s\n%11s\n", kalimat1, kalimat2); break;
                    case 12 : System.out.printf("%s\n%12s\n", kalimat1, kalimat2); break;
                    case 13 : System.out.printf("%s\n%13s\n", kalimat1, kalimat2); break;
                    case 14 : System.out.printf("%s\n%14s\n", kalimat1, kalimat2); break;
                    case 15 : System.out.printf("%s\n%15s\n", kalimat1, kalimat2); break;
                    case 16 : System.out.printf("%s\n%16s\n", kalimat1, kalimat2); break;
                    case 17 : System.out.printf("%s\n%17s\n", kalimat1, kalimat2); break;
                    case 18 : System.out.printf("%s\n%18s\n", kalimat1, kalimat2); break;
                    case 19 : System.out.printf("%s\n%19s\n", kalimat1, kalimat2); break;
                    case 20 : System.out.printf("%s\n%20s\n", kalimat1, kalimat2); break;
            }
        }
        else {
            int a = kalimat2.length();
            switch (a) {
                    case 1 : System.out.printf("%s\n%1s\n", kalimat2, kalimat1); break;
                    case 2 : System.out.printf("%s\n%2s\n", kalimat2, kalimat1); break;
                    case 3 : System.out.printf("%s\n%3s\n", kalimat2, kalimat1); break;
                    case 4 : System.out.printf("%s\n%4s\n", kalimat2, kalimat1); break;
                    case 5 : System.out.printf("%s\n%5s\n", kalimat2, kalimat1); break;
                    case 6 : System.out.printf("%s\n%6s\n", kalimat2, kalimat1); break;
                    case 7 : System.out.printf("%s\n%7s\n", kalimat2, kalimat1); break;
                    case 8 : System.out.printf("%s\n%8s\n", kalimat2, kalimat1); break;
                    case 9 : System.out.printf("%s\n%9s\n", kalimat2, kalimat1); break;
                    case 10 : System.out.printf("%s\n%10s\n", kalimat2, kalimat1); break;
                    case 11 : System.out.printf("%s\n%11s\n", kalimat2, kalimat1); break;
                    case 12 : System.out.printf("%s\n%12s\n", kalimat2, kalimat1); break;
                    case 13 : System.out.printf("%s\n%13s\n", kalimat2, kalimat1); break;
                    case 14 : System.out.printf("%s\n%14s\n", kalimat2, kalimat1); break;
                    case 15 : System.out.printf("%s\n%15s\n", kalimat2, kalimat1); break;
                    case 16 : System.out.printf("%s\n%16s\n", kalimat2, kalimat1); break;
                    case 17 : System.out.printf("%s\n%17s\n", kalimat2, kalimat1); break;
                    case 18 : System.out.printf("%s\n%18s\n", kalimat2, kalimat1); break;
                    case 19 : System.out.printf("%s\n%19s\n", kalimat2, kalimat1); break;
                    case 20 : System.out.printf("%s\n%20s\n", kalimat2, kalimat1); break;
            }
        }
    }
}