import java.util.*;
public class Tugas0001_2 {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan jumlah sapi: ");
        int sapi = inp.nextInt();
        System.out.println("Silahkan masukkan berat daging sapi: ");
        int sapiMax = 0; int beratSapi; int sapiMin = 0;
        int jumlahBerat = 0; int noMax = 1; int noMin = 1;
        for (int i = 1; i<=sapi; i++){
            System.out.print("Berat sapi ke-" + i + ": "); beratSapi = inp.nextInt();
            jumlahBerat += beratSapi;
            if(i==1) sapiMin = beratSapi;
            if (sapiMax<beratSapi){
                sapiMax = beratSapi;
                noMax = i;
            }
            if (sapiMin>beratSapi){
                sapiMin = beratSapi;
                noMin = i;
            }
        }
        double rata2 = (double)jumlahBerat/sapi;
        System.out.println("Maka jumlah berat sapi: " + jumlahBerat);
        System.out.printf("dan rata - ratanya adalah: %.2f\n", rata2);
        System.out.println("Sapi paling berat adalah: " + sapiMax + " yang merupakan sapi ke-" + noMax);
        System.out.println("dan sapi paling ringan adalah: " + sapiMin + " yang merupakan sapi ke-" + noMin);
    }
}
