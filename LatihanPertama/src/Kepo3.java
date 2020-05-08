/* Junet melakukan latihan lari cepat dengan cara berlari mengelilingi sekolah. 
Anda sebagai teman dari Junet mencoba menghitung berapa lama waktu bagi Junet 
untuk berlari (dalam satuan detik) dan berapa jauh Junet berlari (dalam satuan meter). 
Buatlah sebuah program untuk menghitung kecepatan Juner berlari dalam satuan km/jam.

Rumus kecepatan = jarak / waktu

Input Format
jarak
waktu

Constraints
jarak >= 0
waktu >= 0

Output Format

jarak (dalam km)
waktu (dalam jam; Format = jam:menit:detik)
kecepatan

Sample Input 0
10000
3600

Sample Output 0
10.0
1:0:0
10.0

Sample Input 1
123456
1250

Sample Output 1
123.456
0:20:50
355.55328000000003

Sample Input 2
15000
9500

Sample Output 2
15.0
2:38:20
5.684210526315789

Sample Input 3
1500
70

Sample Output 3
1.5
0:1:10
77.14285714285714

Sample Input 4
1234
960

Sample Output 4
1.234
0:16:0
4.6275*/

import java.util.Scanner;
public class Kepo3 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        double jarak = in.nextLong();
        long waktu = in.nextLong();
        long jam = (long) (waktu/3600);
        long menit = (long) ((waktu%3600)/60);
        long detik = (long) ((waktu%3600)%60);
        double kecepatan = (double) (jarak/((double) waktu/3600));
        System.out.println((double) (jarak/1000));
        System.out.println(jam + ":" + menit + ":" + detik);
        System.out.println(kecepatan/1000);
    }
}
