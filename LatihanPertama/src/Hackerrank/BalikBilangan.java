package Hackerrank;
import java.util.*;
public class BalikBilangan {

// 	reverse(x) {
//     temp = x // variabel sementara
//     ret  = 0 // variabel kembalian

//     while (temp > 0) { // mengulang untuk membalik bilangan
//         ret  = (ret * 10) + (temp mod 10)
//         temp = temp div 10
//     }

//     return ret
// }
    
    
    static long reverse(long bil) {
    	// lengkapi
        long temp = bil;
        long ret = 0;
        
        while (temp>0){
            ret = (ret * 10) + (temp % 10);
            temp = temp/10;
        }
        return ret;
	}

public static void main(String[] args) {
      long a, b;
      Scanner in = new Scanner(System.in);
      a = in.nextLong();
      b = in.nextLong();
      a = reverse(a);
      b = reverse(b);
      long hasil = reverse(a+b);
      System.out.println(reverse(a));
      System.out.println(reverse(b));
      System.out.println(hasil);
   }
}