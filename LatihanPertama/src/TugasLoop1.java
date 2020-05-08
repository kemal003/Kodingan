import java.util.Scanner;
public class TugasLoop1 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int jumlah=0;
        int i;
        System.out.print("Masukkan nilai n: "); int n = in.nextInt();
        System.out.println("Maka hasil penjumlahan 1 - n:");
        System.out.print("==> ");
        for (i=1; i<n; i++){
            System.out.print(i + "+");
            jumlah=jumlah+i;}
        System.out.println(n + "\nadalah: " + (jumlah+i));
        float rata2 = ((float)(jumlah+i)/n);
        System.out.println("Rata - ratanya adalah: " + (rata2));
    }   
}
