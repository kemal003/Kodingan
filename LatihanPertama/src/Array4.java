import java.util.*;
public class Array4 {
    public static void main(String[] args) {
        // Diberikan sebuah array sebagai berikut
    	Scanner inp = new Scanner(System.in);
        char arrayDora[] = {'i','n', 'i', 'a', 'r', 'r', 'a', 'y', '2', '1'};
      	char input = inp.next().charAt(0);
        for (int i = 0; i < arrayDora.length; i++) {
            if (input==arrayDora[i]) System.out.println(i); return;
        }
        System.out.println("Tidak Ketemu");
    }
}