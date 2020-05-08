import java.util.Scanner;
public class Faktorial {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        long i, nfak=1;
        System.out.print("Masukkan nilai n: "); long n = in.nextLong();
        System.out.println("Maka nilai dari n!: ");
        System.out.print(n + "! = ");
        for (i=n; i>1; i--){
            System.out.print(i + "x");
            nfak = nfak*i;
        } 
        System.out.println(1);
        System.out.println("adalah " + nfak);
    }
}
