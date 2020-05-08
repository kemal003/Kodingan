import java.util.*;
public class Rekursif {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Silahkan masukkan bilangan: "); long x = inp.nextLong();
        System.out.print("Silahkan masukkan bilangan pangkat: "); long p = inp.nextLong();
        System.out.printf("SIGMA %d = %d\n", x, sigma(x));
        System.out.printf("FAKTORIAL %d! = %d\n", x, faktorial(x));
        if (p<0){
            System.out.printf("PANGKAT %d^%d = 1/%d\n", x, p, pangkat(x, p));}
        else {
            System.out.printf("PANGKAT %d^%d = %d\n", x, p, pangkat(x, p));
        }
        
    }
    
    static long faktorial(long n){
        if (n==0) return 1;
        else return faktorial(n-1)*n;
    }
    
    static long sigma(long n){
        if (n==0) return 0;
        else return sigma(n-1)+n;
    }
    
    static long pangkat(long n, long p){
        if (p<0){
            if (p==0) return 1;
            else return pangkat(n, p+1)*n;
        }
        else {
            if (p==0) return 1;
            else return pangkat(n, p-1)*n;
        }
    }
}
