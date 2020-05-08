package UAP;
import java.util.*;
public class UAP3 {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        String angka = inp.nextLine();
        String[]arr = angka.split(" ");
        int[] jum = new int[arr.length];
        String pecah;
        int x, jumlah=0;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        for (int i = 0; i < arr.length; i++) {
            jumlah=0;
            for (int j = 0; j < arr[i].length(); j++) {
                pecah = arr[i].substring(j, j+1);
                x = Integer.parseInt(pecah);
                jumlah += x;
                jum[i]=jumlah;
            }
            
            System.out.print(jumlah + " ");
        }
    }
}
