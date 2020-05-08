import java.util.Scanner;
public class Panah {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Silahkan masukkan jumlah susunan bintang: "); 
        int n = inp.nextInt();
        System.out.println("Maka susunan bintang yang terbentuk adalah: ");
        for (int i=n; i>0; i--){
            for (int j=i; j<=n; j++)
                System.out.printf("->");
            System.out.println("");
        }
        for (int i=n-1; i>0; i--){
            for (int j=0; j<i; j++)
                System.out.printf("->");    
            System.out.println("");
        }
    }
}