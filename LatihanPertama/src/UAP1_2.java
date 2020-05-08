import java.util.*;
public class UAP1_2 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int jumlah = inp.nextInt();
        int []arr = new int [jumlah];
        int selisih=0;
        for (int i = 0; i < jumlah; i++) {
            arr[i] = inp.nextInt();
        }
        Arrays.sort(arr);
        selisih = arr[1] - arr[0];
        System.out.println(selisih);
    }
}