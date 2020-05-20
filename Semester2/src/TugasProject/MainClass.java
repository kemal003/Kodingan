package TugasProject;

import java.util.*;
public class MainClass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pesanan x = new Pesanan();
        System.out.println("==============WELCOME TO DRUGSTORE MAKE UP================");       
        System.out.print("Nama Anda: "); String name = in.nextLine();
        System.out.print("Alamat Pengiriman: "); String address = in.nextLine();
        System.out.print("No. Handphone: "); String nomer = in.nextLine();
        
        System.out.println("");
        System.out.println("Terdapat beberapa merk make up:");
        System.out.println("1. Wardah");
        System.out.println("2. Emina");
        System.out.println("3. Maybelline");
        
        System.out.println("===========================================================");
        System.out.print("Ingin beli berapa produk sis? "); int jumlah = in.nextInt(); 
        for (int i = 0; i < jumlah; i++) {
            in.nextLine();
            System.out.print("Merk: "); String merk = in.nextLine();
            System.out.print("Kategori item: "); String kategori = in.nextLine();
            System.out.print("Banyak item: "); int item = in.nextInt();
            if(merk.equalsIgnoreCase("Wardah")){
                MakeUp baru = new Wardah(kategori, item);
                x.tambah(baru);
                System.out.println("Produk berhasil ditambahkan!");
            } else if(merk.equalsIgnoreCase("Emina")){
                MakeUp baru = new Wardah(kategori, item);
                x.tambah(baru);
                System.out.println("Produk berhasil ditambahkan!");
            } else if(merk.equalsIgnoreCase("Maybelline")){
                MakeUp baru = new Wardah(kategori, item);
                x.tambah(baru);  
                System.out.println("Produk berhasil ditambahkan!");
            } else  System.out.println("Produk Tidak Ada");
        }
        System.out.println();
        
        System.out.println("==========Checkout Pembelian=============");
        for (int i = 0; i < jumlah; i++) {
            
        }
    }
    
}    
