import java.util.Scanner;

public class Nopal {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);  
        System.out.print("Berapa banyak data yang akan diurutkan : ");
        int jml = ss.nextInt();
        int data [] = new int [jml];
        int n = data.length;
        // Input nilai
        for (int a = 0; a < jml; a++){
            System.out.print("Masukkan data ke-"+(a+1)+": ");
            data [a] = ss.nextInt();
        }
        // Mengurutkan menggunakan Selection Sort
        for (int i = 0; i < jml-1; i++ ){
            for (int j = i ; j < jml; j++){
                if (data [i] < data[j]){
                    int sem = data[i];
                    data[i] = data[j];
                    data[j] = sem;}
            }
        }
        //Cetak Angka yang urut
        for (int i = 0; i < jml; i++){
            System.out.println(data[i]+ " ");
        }
    }
    
}