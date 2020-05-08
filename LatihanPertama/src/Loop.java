import java.util.Scanner;
public class Loop {
       public static void main(String [] args){
            Scanner in = new Scanner(System.in);
            int a = (int) (Math.random()*10)+1;
            int nilai = 100;
            int tebak;
            for (int i=1; i<=11; i++){
                System.out.print("Masukkan tebakan: ");
                tebak = in.nextInt();
                if (tebak==a){
                    System.out.println("Selamat! Jawaban benar mendapat nilai " + nilai);
                    break;}
                else {
                    if (nilai==10){
                        System.out.println("MAAF, nilai anda sudah habis!");
                        break;}
                    if (nilai!=0) System.out.println("Silahkan tebak lagi!");
                        nilai=nilai-10;
                }
            }
            
    }
}
