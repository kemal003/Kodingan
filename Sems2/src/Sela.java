import java.util.*;
class Sela{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x=0;
        String kalimat=inp.nextLine();
        for (int i = 0; i < kalimat.length(); i++) {
            if (kalimat.charAt(i)==' ') x++;
        }
        System.out.println("Jumlah kata = " + (x+1));
    }
}
    