import java.util.Scanner;
public class Tugas0001_1 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan bilangan n: ");
        int n = inp.nextInt();
        int sn = 0, tanda=1, kelipatan=0, i=n;
        System.out.println("Maka deret yang terbentuk: ");
        do{
            if (i==n) System.out.print(i);
            else 
                if (tanda>0) System.out.print("+" + i);
                else System.out.print("-" + i);
            sn+=i*tanda;
            kelipatan++;
                if (kelipatan%3==0) tanda=-tanda;
//                if (i%25==0) System.out.println("");
        } while (--i>=0);
        System.out.println(" = " + sn);
    }
}