import java.util.*;
public class Tugas0001_2b {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Jika jumlah sapi tidak diketahui, silahkan input 0!\n");
        System.out.print("Masukkan jumlah sapi: ");
        int sapi = inp.nextInt();
        System.out.println("Silahkan masukkan berat daging sapi: ");
        int beratSapi;
        int sapiMax = 0, sapiMin = 0, jumlahBerat = 0, si=0;
        int noMax = 1, noMin = 1;
//        JIKA SAPI = 0
        if (sapi==0){
        for (int i = 1; i>=1; i++){
            System.out.print("Berat sapi ke-" + i + ": "); beratSapi = inp.nextInt();
            jumlahBerat += beratSapi;
            si += i;
            if(i==1) sapiMin = beratSapi;
            else {
                if (sapiMax<beratSapi){
                sapiMax = beratSapi; noMax = i;}
                if (sapiMin>beratSapi && beratSapi!=0){
                sapiMin = beratSapi; noMin = i;}
            }
            if (beratSapi==0) {break;}
        }
        double rata2 = (double)jumlahBerat/(si-1);
        System.out.println("Maka jumlah berat sapi: " + jumlahBerat);
        System.out.printf("dan rata - ratanya adalah: %.2f\n", rata2);
        System.out.println("Sapi paling berat adalah: " + sapiMax + " yang merupakan sapi ke-" + noMax);
        System.out.println("dan sapi paling ringan adalah: " + sapiMin + " yang merupakan sapi ke-" + noMin);
        }
//        JIKA SAPI !=0
        else {
            for (int i = 1; i<=sapi; i++){
            System.out.print("Berat sapi ke-" + i + ": "); beratSapi = inp.nextInt();
            jumlahBerat += beratSapi;
            if(i==1) sapiMin = beratSapi;
            else {
                if (sapiMax<beratSapi){
                sapiMax = beratSapi; noMax = i;}
                if (sapiMin>beratSapi){
                sapiMin = beratSapi; noMin = i;}
            }
        }
        double rata2 = (double)jumlahBerat/sapi;
        System.out.println("Maka jumlah berat sapi: " + jumlahBerat);
        System.out.printf("dan rata - ratanya adalah: %.2f\n", rata2);
        System.out.println("Sapi paling berat adalah: " + sapiMax + " yang merupakan sapi ke-" + noMax);
        System.out.println("dan sapi paling ringan adalah: " + sapiMin + " yang merupakan sapi ke-" + noMin);
        }
    }
}
