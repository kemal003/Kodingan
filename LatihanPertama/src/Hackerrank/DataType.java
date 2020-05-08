package Hackerrank;
import java.util.*;
import java.io.*;
class Solution{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=0;i<4;i++){
            try {
//                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if (x>=-((2^16)/2) && x<=((2^16/2)-1)) System.out.println("* short");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}



