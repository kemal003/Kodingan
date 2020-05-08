import java.util.*;
public class Array {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan kalimat/kata: "); String x = inp.nextLine();
        String sub[] = new String[x.length()];
        for (int i = 0; i < x.length(); i++) {
            sub[i] = x.substring(i,i+1);
        }
        System.out.print("Huruf ke-berapa yang ingin diprint? "); int k = inp.nextInt();
        if (k>(x.length()+1)) System.out.println("Terlalu banyak");
        else {
        if (sub[k-1].equals(" ")) System.out.println("Itu adalah spasi");
        else System.out.println("Hurufnya adalah: " + sub[k-1]);
        }
    }
}
