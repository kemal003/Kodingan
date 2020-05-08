import java.util.Scanner;
public class Latihan2 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        float a, b, y, x;
        int p, q;
        System.out.println("Persamaan garis adalah y = ax + b");
        System.out.print("Masukkan nilai a: "); a = in.nextFloat();
        System.out.print("Masukkan nilai b: "); b = in.nextFloat();
        System.out.println("Diketahui titik T(p,q) berada pada bidang kartesius");
        System.out.println("Di manakah letak titik T jika: ");
        System.out.print("p: "); p = in.nextInt();
        System.out.print("q: "); q = in.nextInt();
        System.out.println("Jawab: ");
        System.out.println("Jika x = 0 maka: y = b"); y = b;
        System.out.println("Jika y = 0 maka: x = -b/a"); x = -b/a;
        System.out.printf("Diketahui titik potong pada sumbu x adalah (0,%.0f)",y);
        System.out.printf("dan titik potong pada sumbu y adalah (%.0f,0)",x);
        if (p>x && q>y){
            
        }
    }
}
