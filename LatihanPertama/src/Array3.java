import java.util.*;
public class Array3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        int arr []= new int[x];
        int inArr;
        for (int i = 0; i<arr.length; i++){
            inArr = inp.nextInt();
            arr[i] = inArr;
        }
        for (int i = arr.length; i>=0; i--){
            System.out.print(arr[i]);
        }
    }
}