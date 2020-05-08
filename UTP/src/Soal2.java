import java.util.*;

public class Soal2 {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner inp = new Scanner(System.in);
        long waktu = inp.nextLong();
        long jarak = inp.nextLong();
        long jam = waktu/3600;
        double sjam = (double)waktu/3600;
        long menit = (waktu%3600)/60;
        long detik = (waktu%3600)%60;
        double kecepatan = jarak/sjam;
        long bulkec = Math.round(kecepatan);
        double met;
        if (bulkec<=4)met = 6;
        else if (bulkec==5.)met=8.3;
        else if (bulkec==6.)met=9.8;
        else if (bulkec==7.)met=11.0;
        else met = 11.8;
        double kal = met*50*((double)waktu/3600);
        long bulkal = Math.round(kal);
        System.out.printf("%02d:%02d:%02d\n",jam,menit,detik);
        System.out.println(bulkal);
//        System.out.println("MET " + met);
//        System.out.println("KAL " + kal);
//        System.out.println(bulkec);
//        System.out.println(kecepatan);
    }
}