/* 
                                METHOD
    1. Deklarasi Method
        [akses modifier] [static] return-type nama_method ([daftar parameter]){

        }
        Dalam method tidak ada nested method. Jadi di dalam method tidak ada method lain.
    2. Return-type
        Tipe data dari nilai nilai data/objek yang dikirimkan kembali oleh method ke pemanggil 
        method, sesaat SETELAH method selesai di dieksekusi. Ada 2 macam return type:
            a. void
            b. non-void (Primitif datat class)
                PASAL PENGEMBALIAN NILAI DATA
        * Jika return type berupa void maka tidak ada nilai data yang dikembalikan.
        * Jika return type berupa non-void maka ada nilai data yang dikembalikan ke pemanggil
        method sesaat setelah method dieksekusi.
                PASAL PENULISAN RETURN
        * Jika return type non-void WAJIB ada statement "return"
        * Jika return type void tidak boleh ada statement "return".
    3. Nama Method
        Nama method mengikuti aturan identifier di Java, dengan variasi bebas, huruf kata awal kecil
        dan kata selanjutnya digunakan huruf kapital atau underscore sebagai pemisah.
    4. Daftar parameter
        Dipakai untuk menigirim pesan/nilai data/nilai referensi dari pemanggil method ke method
        sesaat SEBELUM method dieksekusi.
        Cara deklarasi parameter adalah:
            tipe_Data namaParameter
                bila lebih dari satu dipisahkan menggunakan "koma".

        CONTOH
    static boolean cekNilai(int a){
        if (a>=0) return true;
        else return false;
    }
*/

import java.util.*;
public class Method {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan se buah nilai: "); int x = inp.nextInt();
        System.out.println("Jawab: " + cekNilai(x));
        printtt();
        printtt();
//        printtt();
//        printtt();
    }
    static void printtt() {
        System.out.println("YAK");
        System.out.println("OK");
        System.out.println("GO");
    }
    static String cekNilai(int a){
        if (a>=0) return "Itu positif";
        else return "Itu negatif";
    }
}
