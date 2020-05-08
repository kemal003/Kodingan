import java.util.*;
public class Perkalian {
    public static void main(String[]args){
        System.out.printf("%90s\n", "TABEL PERKALIAN");
        System.out.print("|");
        for (int i = 1; i <= 9; i++){
            System.out.print("-------------------");
            if (i==9) System.out.println("-|");}
        System.out.printf("|%10d%17d%17d%17d%17d%17d%17d%17d%17d%17d%10s\n", 1,2,3,4,5,6,7,8,9,10,"|");
        System.out.print("|");
        for (int i = 1; i <= 9; i++){
            System.out.print("-------------------");
            if (i==9) System.out.println("-|");}
        for (int i = 1; i <= 10; i++){
            System.out.printf("|%2d. ", i);
            for (int j = 1; j <= 10; j++)
                System.out.printf("%2d %2s %2d = %3d | ", i, "x", j, i*j);
            System.out.println("");
        }
    }
}
