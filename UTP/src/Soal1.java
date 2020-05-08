import java.util.Scanner;
public class Soal1 {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        long a, b, c, d, p, q, r, s;
        a = inp.nextLong();
        b = inp.nextLong();
        c = inp.nextLong();
        d = inp.nextLong();
        p = inp.nextLong();
        q = inp.nextLong();
        r = inp.nextLong();
        s = inp.nextLong();
        if (((p==a) || (p==c)) && ((q==b) || (q==d))){
            System.out.println("Sama");}
        else if ((a>p) && (b>q) && (c>r) && (d>s)){
            System.out.println("Saling berpotongan");
        }
        else if ((a<p) && (b<q) && (c==r) && (d>s)){
            System.out.println("Saling bersinggungan dalam");
        }
        else if ((a<p) && (b>q) && (c<r) && (d<s)){
            System.out.println("Saling bersinggungan luar");
        }
        else if ((a>p) && (b>q) && (c<r) && (d<s)){
            System.out.println("Saling tumpang tindih");
        }
        else if ((a>p) && (b<q) && (c>r) && (d<s)){
            System.out.println("Saling lepas");
        }
    }
}
