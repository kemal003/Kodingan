import java.util.*;
public class Array7 {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: "); int baris = inp.nextInt();
        System.out.print("Masukkan jumlah kolom: "); int kolom = inp.nextInt();
        System.out.print("Akan di random sampai berapa? "); int rand = inp.nextInt();
        int [][] arr = new int[baris][kolom];
        int tot=0;
        int totalBaris=0, totalKolom=0;
        int [] totalPerBaris = new int[baris];
        int [] totalPerKolom = new int[kolom];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) ((Math.random()*rand)+1);
                System.out.printf("%4d", arr[i][j]);
                totalBaris+=arr[i][j];
                tot+=arr[i][j];
            }
            totalPerBaris[i]=totalBaris;
            totalBaris=0;
            System.out.println("");
        }
        for (int i = 0; i < kolom; i++) {
            for (int j = 0; j < baris; j++) {
                totalKolom += arr[j][i];
            }
            totalPerKolom[i]=totalKolom;
            totalKolom=0;
        }
        System.out.println("==================================");
        System.out.println("Maka total dari semua elemen array adalah: " + tot);
        System.out.println("==================================================");
        System.out.println("BARIS");
        System.out.println("==================================================");
        for (int i = 0; i < baris; i++) {
            System.out.printf("Total dari baris ke-%d adalah: %d\n",(i+1), totalPerBaris[i]);
        }
        System.out.println("==================================================");
        System.out.println("KOLOM");
        System.out.println("==================================================");
        for (int i = 0; i < kolom; i++) {
            System.out.printf("Total dari kolom ke-%d adalah: %d\n",(i+1), totalPerKolom[i]);
        }
    }
}