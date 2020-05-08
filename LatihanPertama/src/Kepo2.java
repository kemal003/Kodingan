/*Aldy mempunyai sebuah angka X dan Y. X merupakan angka pertama dan Y angka kedua. 
Karena rasa ingin tau, si Andy ingin mengetahui selisih angka sekarang dengan angka sebelumnya, 
angka ke-50, serta total jumlah angka (dari 1 - 50). 
Buatlah sebuah program untuk mencari jawaban dari hal yang ingin Andy ketahui !

Rumus : a = angka pertama, b = selisih angka, n = angka ke-n

Input Format
Nilai a
Nilai b

Constraints
-9223372036854775808 < a < 9223372036854775808
-9223372036854775808 < b < 9223372036854775808

Output Format
Nilai a
Nilai b
Selisih angka
Angka ke 100
Jumlah angka

Sample Input 0
1
2

Sample Output 0
Angka pertama = 1
Angka kedua   = 2
Selisih angka = 1
Angka ke 100  = 100
Jumlah angka  = 5050

Sample Input 1
2
7

Sample Output 1
Angka pertama = 2
Angka kedua   = 7
Selisih angka = 5
Angka ke 100  = 497
Jumlah angka  = 24950

Sample Input 2
-5
-1

Sample Output 2
Angka pertama = -5
Angka kedua   = -1
Selisih angka = 4
Angka ke 100  = 391
Jumlah angka  = 19300*/
import java.util.Scanner;
public class Kepo2 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long sel;
        if (a<b){sel=b-a;}
        else sel = a-b;
        long n = a + sel*99;
        long sn = 50 *(a+n);
        System.out.printf("%-14s= %d\n","Angka pertama", a);
        System.out.printf("%-14s= %d\n", "Angka kedua", b);
        System.out.printf("%-14s= %d\n", "Selisih angka", sel);
        System.out.printf("%-14s= %d\n", "Angka ke 100", n);
        System.out.printf("%-14s= %d\n", "Jumlah angka", sn);
    }
}
