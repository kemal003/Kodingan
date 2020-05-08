import java.util.*;
public class Array2 {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan jumlah data: "); int x = inp.nextInt();
            int ar[] = new int[x];
            int i=0;
        System.out.println("Input array diakhiri dengan 0");
        for (i=0; i<ar.length; i++) {
            System.out.print("Silahkan input nilai array: Nilai[" + (i+1) + "] : ");
            ar[i] = inp.nextInt();
            if (ar[i]==0) break;
        }
        System.out.print("Silahkan masukkan angka yang akan dicek: "); int cek = inp.nextInt();
        do {i=0; i++;
            if (cek==ar[i]) System.out.printf("Ditemukan nilai yang sama yaitu: %d pada Nilai[%d]\n", cek, i);
            else {System.out.println("Tidak ditemukan nilai yang sama");}
        } while (i<ar.length-1 && cek!=ar[i]);
    }
}
