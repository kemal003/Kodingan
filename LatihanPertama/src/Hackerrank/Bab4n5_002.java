package Hackerrank;
import java.util.Scanner;

public class Bab4n5_002 {
  
   // fungsi F(x) = Ax + B
   static long F(long A, long B, long x){
      long hasil = 0;
      hasil = A*x + B;  // menghitung nilai hasil dengan rumus sesuai soal
      return hasil;		// mengembalikan nilai "hasil" kepada pemanggil method
   }
  
  // fungsi G(x) = Cx + D
   static long G(long C, long D, long x){
      long hasil = 0;
      // lengkapi, dengan definisi sesuai soal
      hasil = C*x + D;
      return hasil;		// mengembalikan nilai "hasil" kepada pemanggil method
   }
  
   // Fungsi H(x) = F(G(x)) atau G(F(x))
   static long H(long A, long B, long C, long D, long x, String ekspresi){
      long hasil = 0;
      if (ekspresi.equals("FoG")) { 	// Jika baris kedua FoG maka H(x) = F(G(x))
         hasil = A*G(C, D, x) + B; 	// perbaiki, hint : lihat definisi F(x) dan G(x)
      } else {	// jika GoF maka H(x) = G(F(x))
         // lengkapi
         hasil = C*F(A, B, x) + D;
      }
      return hasil;
   }
   
   // main method sudah lengkap tidak perlu diubah
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      long A, B, C, D, x;
      A = in.nextLong();
      B = in.nextLong();
      C = in.nextLong();
      D = in.nextLong();
      x = in.nextLong();
      String exp;
      in.nextLine();
      exp = in.nextLine();
      System.out.println(H(A, B, C, D, x, exp)); //-> mencetak hasil dari pemanggilan method H(x)
   }
}