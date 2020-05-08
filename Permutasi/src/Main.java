import java.util.*;

public class Main {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        PermutasiKombinasi mimang = new PermutasiKombinasi();
        System.out.print("Silahkan input data: "); String x = inp.next();
        System.out.print("Silahkan masukkan panjang kombinasi: "); int y = inp.nextInt();
        mimang.PolaBerulang(x, y);
    }
}
