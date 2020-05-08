import java.util.*;
public class While {
    public static void main(String[]args){
        int a=0;
//        while (a>=0){
//        long i=(long) (Math.random()*1000000000); 
//        System.out.println(i);
//        }
        while (a<=30){
            a++;
            if (a%2==0 || a>30) continue;
            System.out.println(a);
        }
    }
}
