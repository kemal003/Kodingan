public class Bintang {
    public static void main(String[]args){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <=10; j++) {
                if (i==1 || i==9 || j==1 || j==9 || i==j || i+j==10) System.out.printf("\u2588");
                else System.out.print("  ");}
            System.out.println("");
        }
    }
}
