package UAP;
import java.util.*;
public class UAP2 {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        String angka = inp.nextLine();
        int x, jumlah=0;
        for (int i = 0; i < angka.length(); i++) {
            x = Integer.parseInt(angka.substring(i,i+1));
            jumlah+=x;
        }
        if (jumlah>=10){
            for (int j = 0; j >= 0; j++) {
                angka = Integer.toString(jumlah);
                jumlah=0;
                for (int i = 0; i < angka.length(); i++) {
                    x = Integer.parseInt(angka.substring(i,i+1));
                    jumlah+=x;
                } 
                if (jumlah<10) System.out.println(jumlah); break;
            }
        }
        else System.out.println(jumlah);
    }
}
