import java.util.*;
public class Array6 {
    public static void main(String[]args){
        Scanner inp  = new Scanner(System.in);
        System.out.print("Silahkan masukkan jumlah kolom: "); int bar = inp.nextInt();
        int[][] arr = new int[bar][];
        for (int i = 1; i <= bar; i++) {
            System.out.printf("Masukkan baris ke-%d: ", i); int x = inp.nextInt();
            arr[(i-1)] = new int[x];
        }
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%2d", arr[i][j]);
            }
            System.out.println("");
        }
    }
}
