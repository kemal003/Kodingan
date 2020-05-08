import java.util.Scanner;
public class Aritma {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int bil1, bil2, jwb, op;
        bil1 = (int)(Math.random()*100+1);
        bil2 = (int)(Math.random()*100+1);
        op = (int)(Math.random()*4);
        switch (op) {
            case 0:
                System.out.printf("%d + %d = ?\n", bil1, bil2);
                System.out.print("JAWAB : ");
                jwb = in.nextInt();
                if (jwb==bil1+bil2) System.out.println("NAIS!");
                else System.out.printf("SALAH, seharusnya : %d\n", bil1 + bil2);
                break;
            case 1:
                System.out.printf("%d - %d = ?\n", bil1, bil2);
                System.out.print("JAWAB : ");
                jwb = in.nextInt();
                if (jwb==bil1-bil2)System.out.println("NAIS!");
                else System.out.printf("SALAH, seharusnya : %d\n", bil1 - bil2);
                break;
            case 2:
                System.out.printf("%d x %d = ?\n", bil1, bil2);
                System.out.print("JAWAB : ");
                jwb = in.nextInt();
                if (jwb==bil1*bil2)System.out.println("NAIS!");
                else System.out.printf("SALAH, seharusnya : %d\n", bil1 * bil2);
                break;
            case 3:
                if (bil1>=bil2){
                System.out.printf("%d / %d = ?\n", bil1, bil2);
                System.out.print("JAWAB : ");
                jwb = in.nextInt();
                if (jwb==bil1/bil2)System.out.println("NAIS!");
                else System.out.printf("SALAH, seharusnya : %d\n", bil1/bil2);}
                else {
                System.out.printf("%d / %d = ?\n", bil2, bil1);
                System.out.print("JAWAB : ");
                jwb = in.nextInt();
                if (jwb==bil2/bil1)System.out.println("NAIS!");
                else System.out.printf("SALAH, seharusnya : %d\n", bil2/bil1); 
                }
                break;
        }
    }
}
