import java.util.*;
public class Method02 {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        int pilih, x, n=0;
        int[] arrx = new int[0];
        do{
            menu(); pilih = inp.nextInt();
            garis();
            switch (pilih){
                case 1 : 
                    System.out.print("Silahkan masukkan panjang array: ");
                    x = inp.nextInt();
                    garis();
                    arrx = buatArray(x);
                    garis();
                    break;
                case 2 :
                    tampilArray(arrx);
                    garis();
                    break;
                case 3 : 
                    if (n>=arrx.length && arrx.length!=0) {
                        System.out.println("Mohon maaf, array sudah penuh");
                        garis();
                        break;
                    }
                    if (n<=arrx.length){
                        arrx = masukData(arrx, n);
                        if (arrx.length!=0) n++;
                        garis();
                    }
                    break;
                case 4 :
                    n=0;
                    if (arrx.length==0) {
                        System.out.println("Array belum dibuat atau panjang array = 0");
                        garis();
                    }
                    else {
                        System.out.print("Silahkan masukkan data yang ingin dihapus: ");
                        x = inp.nextInt();
                        arrx = hapusData(arrx, x);
                        garis();
                    }
                    break;
                case 5 : 
                    System.out.println("TERIMA KASIH ANJENG");
                    return;
            }
        } while (pilih>=1 || pilih<=5);
    }
    
    static void garis(){
        System.out.println("=====================================");
    }
    
    static void menu(){
        System.out.println("MENU PROGRAM ARRAY INT 1 DIMENSI");
        System.out.println("1. Buat Objek Array");
        System.out.println("2. Tampilkan Data Array");
        System.out.println("3. Masukkan Data Elemen Array");
        System.out.println("4. Hapus Data Elemen Array");
        System.out.println("5. Selesai");
        System.out.print("Pilih: ");
    }
    
    static int[] buatArray(int panj){
        int[] arr = new int[panj];
        System.out.println("Array telah terbuat dengan panjang " + panj);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%4d", arr[i]);
        } System.out.println("");
        return arr;
    }
    
    static void tampilArray(int[] x){
        if (x.length==0) System.out.println("Array belum dibuat atau panjang array = 0");
        else {
            System.out.println("Data elemen array yang telah dibuat adalah sebagai berikut:");
            for (int i = 0; i < x.length ; i++) {
                System.out.printf("%4d", x[i]);
            } System.out.println("");
        }
    }
    
    static int[] masukData(int[] x, int n){
        Scanner inp = new Scanner(System.in);
        if (x.length==0) {System.out.println("Array belum dibuat atau panjang array = 0");}
        else {
            System.out.print("Silahkan masukkan data array: "); 
            for (int i = 0; i < x.length; i++) {
                if (x[i]==0) {x[i] = inp.nextInt(); 
                System.out.printf("Data berhasil dimasukkan! (%d)\n", x[i]);
                break;}
            }
        }
        return x;
    }
    
    static int[] hapusData(int[] x, int n){
        Scanner inp = new Scanner(System.in);
        int t=0;
        for (int i = 0; i < x.length; i++) {
            if (n==x[i]) {
                System.out.printf("Data berhasil dihapus! (%d)\n", x[i]);
                x[i]=0;
                t++;
            }
        }
        if (t==0) System.out.println("Tidak ada yang ditemukan");
        return x;
    }
}
