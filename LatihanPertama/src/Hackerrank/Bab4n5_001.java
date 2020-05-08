package Hackerrank;
import java.util.*;
public class Bab4n5_001 {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        String[][] tabel = new String[4][5];
        int mode = inp.nextInt();
        tabel[0][0]="Ekonomi";
        tabel[1][0]="Bisnis";
        tabel[2][0]="Eksekutif";
        tabel[3][0]="Pariwisata";
        tabel[0][1]="50000";
        tabel[1][1]="100000";
        tabel[2][1]="200000";
        tabel[3][1]="300000";
        tabel[0][2]="2";
        tabel[1][2]="5";
        tabel[2][2]="7";
        tabel[3][2]="10";
        tabel[0][3]="Tidak Ada";
        tabel[1][3]="Ada";
        tabel[2][3]="Ada";
        tabel[3][3]="Ada";
        tabel[0][4]="Tidak Ada";
        tabel[1][4]="Tidak Ada";
        tabel[2][4]="Tidak Ada";
        tabel[3][4]="Ada";
        switch (mode){
            case 1 :
                for (int i = 0; i < 4; i++){
                    for (int j = 0; j < 5; j++) {
                        if (j==0) System.out.printf("%s |", tabel[i][j]);
                        else System.out.printf(" %s |", tabel[i][j]);
                    } System.out.println("");
                }
                break;
            case 2 :
                for (int i = 0; i < 4; i++){
                    for (int j = 0; j < 2; j++) {
                        if (j==0) System.out.printf("%s |", tabel[i][j]);
                        else System.out.printf(" %s |", tabel[i][j]);
                    } System.out.println("");
                }
                break; 
            case 3 :
                for (int i = 0; i < 4; i++){
                    for (int j = 0; j < 5; j++) {
                        if (j==0) System.out.printf("%s |", tabel[i][j]);
                        if (j==4) System.out.printf(" %s |", tabel[i][j]);
                    } System.out.println("");
                }
                break;
            default : System.out.println("Inputan tidak valid");
            
        }
    
    }
}
