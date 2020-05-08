/*Loli ingin mencari tahu berapa jumlah hari pada bulan X dan tahun Y, 
jika dia mencari pada kalender akan sangat susah apalagi jika tahun nya sudah terlewat / beberapa tahun ke depan. 
Maka dari itu buatlah sebuah program untuk mencari tahu jumlah dari pada bulan X dan tahun Y !

Input Format
bulan X (dalam angka)
tahun Y

Constraints
0 < X < 12
0 < Y < 10000

Output Format
Bulan X (dalam kalimat)
Tahun Y
Jumlah hari

Sample Input 0
9
1600

Sample Output 0
September
Tahun 1600
Jumlah hari = 30

Sample Input 1
13
1000

Sample Output 1
Maaf bulan hanya sampai 12
Sample Input 2
0
1000

Sample Output 2
Bulan 0 tidak ada*/
import java.util.Scanner;
public class Kepo {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int jh = 0;
        String bulan = null;
        if (x==1){bulan = "Januari"; jh=31;}
        else if (x==2){
            bulan = "Februari";
            if (y%4==0){jh=29;}
            else jh=28;}
        else if (x==3){bulan = "Maret"; jh=31;}
        else if (x==4){bulan = "April"; jh=30;}
        else if (x==5){bulan = "Mei"; jh=31;}
        else if (x==6){bulan = "Juni"; jh=30;}
        else if (x==7){bulan = "Juli"; jh=31;}
        else if (x==8){bulan = "Agustus"; jh=31;}
        else if (x==9){bulan = "September"; jh=30;}
        else if (x==10){bulan = "Oktober"; jh=31;}
        else if (x==11){bulan = "November"; jh=30;}
        else if (x==12){bulan = "Desember"; jh=31;}
        else if (x>12){System.out.println("Maaf bulan hanya sampai 12"); return;}
        else if (x==0){System.out.println("Bulan 0 tidak ada"); return;}
            System.out.println(bulan);
            System.out.println("Tahun " + y);
            System.out.println("Jumlah hari = " + jh);
    }
}
