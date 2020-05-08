import java.util.Scanner;

class Barang {
    String nama;
    int Stock;
    int harga;
    
    void kurangiStock(int jumlah){
        if (cekStock (jumlah)) Stock -= jumlah;
        else System.out.println("Jumlah barang yang anda minta tidak cukup");}
    
    boolean cekStock(int jumlah){
        return jumlah < Stock;}
    }
public class Nopal {
    public static void main(String[] args) {
        Scanner zz = new Scanner (System.in);
        Barang[] barangS = new Barang[3];
        String [] namabarang = {"Bolpoin","Penghapus","Pensil"};
        int [] hargabarang = {10000, 5000, 7000};
        int [] stockbarang = {10, 100, 200};
        // Mengisi Nama barang ke dalam Array
        for (int i = 0; i < barangS.length; i++){
            barangS[i] = new Barang();
            barangS[i].nama = namabarang[i];
            barangS[i].harga = hargabarang[i];
            barangS[i].Stock = stockbarang[i];
            } 
            
        for (int i = 0; i < 3; i++) {
            System.out.println(barangS[i].nama);
        }
        // Minta input dari User
        for (int i = 0; i < 3; i++){
            System.out.print("Masukkan Nama Barang ke-"+(i+1)+" : ");
            String NamabarangS = zz.nextLine();
            System.out.print("Masukkan Jumlah Barang ke-"+(i+1)+" : ");
            int Jmlbarang = zz.nextInt();
            zz.nextLine();
           
            for (Barang cek : barangS){
                if (cek.nama.equals(NamabarangS)) 
                    cek.kurangiStock(Jmlbarang); 
                else System.out.println("Mohon maaf barang yang anda cari tidak ada");}
            }
        // Output Sisa Barang
        for (Barang print : barangS){
            System.out.println("Barang "+print.nama+", Rp."+print.harga+" Sisa = "+print.Stock+"");
        }
    }
    
}