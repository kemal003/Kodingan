import java.util.Scanner;
public class Nomor1_2 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai x: "); int x = in.nextInt();
        System.out.print("Masukkan nilai y: "); int y = in.nextInt();
        if (x>0){
            if (y>0){System.out.println("Titik T berada pada Kuadran I");}
            else if (y<0){System.out.println("Titik T berada pada Kuadran IV");}
            else System.out.println("Titik T berada pada sumbu X positif");}   
        else if (x>0){
            if (y>0){System.out.println("Titik T berada Kuadran II");}
            else if (y<0){System.out.println("Titik T berada pada Kuadran III");}
            else System.out.println("Titik T berada pada sumbu X negatif");}
        else {
            if (y > 0) System.out.println("Titik T berada pada sumbu Y positif");
            else if ( y<0 ) System.out.println("Titik T berada pada sumbu Y negatif");
            else System.out.println("Titik T berada pada pusat bidang kartesius");
        }
    }
}
