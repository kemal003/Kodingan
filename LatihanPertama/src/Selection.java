import java.util.Scanner;
public class Selection {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Menghitung ax^2+bx+c dengan program");
        double a, b, c, d;
        double x1, x2;
        System.out.print("Masukkan nilai a : ");
        a = in.nextInt();
        System.out.print("Masukkan nilai b : ");
        b = in.nextInt();
        System.out.print("Masukkan nilai c : ");
        c = in.nextInt();
        System.out.println("Maka : ");
        if (a!=0){
            /*d=b*b-4*a*c;
            if (d>=0){
                x1 = (-b+Math.sqrt(d))/(2*a);
                x2 = (-b-Math.sqrt(d))/(2*a);
                System.out.printf("x1 = %.2f\nx2 = %.2f\n", x1, x2);}
            else System.out.printf("x1 = %.2f + %.2fj\nx2 = %.2f + %.2fj\n",
                    -b/2*a,Math.sqrt(-d)/2*a,-b/2*a,Math.sqrt(-d)/2*a);
                */}
        else if (b!=0){
            x1 = -c/b;
            System.out.printf("Pers. Linier dengan x = %.2f\n\n", x1);}
        else System.out.print("Data salah njer");
    }
}

//if (args){ }
//[else]