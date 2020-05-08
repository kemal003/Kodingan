import java.util.Scanner;
public class KHS {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        String nama, nim, prodi, sems, x;
        int jmk, i=0;
        System.out.println("=======================================");
        System.out.println("Selamat Datang di input Kartu Hasil Studi Semester 1");
        System.out.println("Silahkan masukkan data - data di bawah ini");
        System.out.println("=======================================");
        System.out.print("Nama\t\t: "); nama = in.nextLine();
        System.out.print("NIM\t\t: "); nim = in.nextLine();
        System.out.print("Program Studi\t: "); prodi = in.nextLine();
        System.out.println("=======================================");
        System.out.print("Silahkan masukkan jumlah matkul yang diambil: "); jmk = in.nextInt();
        x = in.nextLine();
        String mk[] = new String[jmk];
        while (i<jmk){
            System.out.print("Mata kuliah ke-" + (i+1) + ": ");
            mk[i] = in.nextLine(); i++;}
        System.out.println("=======================================");
        System.out.println("Silahkan masukkan SKS dari mata kuliah!");
        int sks[] = new int[jmk]; i=0;
        while (i<jmk){
            System.out.printf("%-23s: ", mk[i]);
            sks[i] = in.nextInt(); i++;}
        System.out.println("=======================================");
        System.out.println("Silahkan masukkan nilai dari mata kuliah!");
        float nilai[] = new float[jmk];
        float nsks[] = new float [jmk];
        int totalsks=0; i=0;
        float totalnsks=0;
        while (i<jmk){
            System.out.printf("%-23s: ", mk[i]);
            nilai[i] = in.nextFloat();
            nsks[i] = nilai[i] * sks[i];
            totalsks += sks[i];
            totalnsks += nsks[i]; i++;}        
        System.out.println("=======================================");
        System.out.println("\tKARTU HASIL STUDI");
        System.out.println("Nama\t\t: "+nama);
        System.out.println("NIM\t\t: "+nim);
        System.out.println("Program Studi\t: "+prodi);
        System.out.println("Semester\t: 1");
        System.out.println("---------------------------------------------------");
        System.out.printf("%-3s|%-20s|%-5s|%-7s|%-9s|\n","No"," Mata Kuliah"," SKS"," Nilai"," N x SKS");
        System.out.println("---------------------------------------------------");
        i=0;
        while (i<jmk) {
            System.out.printf("%-3s|%-20s|%5d|%7.1f|%9.1f|\n",(i+1),mk[i],sks[i],nilai[i],nsks[i]);
            i++;}
        System.out.println("---------------------------------------------------");
        System.out.printf("%-25s %-10d %11.2f\n","TOTAL",totalsks,totalnsks);
        System.out.println("---------------------------------------------------");
        System.out.printf("IPK\t\t: %.2f/%d\n",totalnsks,totalsks);
        float ipk = (float)(totalnsks/totalsks);
        System.out.printf("IPK\t\t: %.2f\n", ipk);
        if (ipk==4.00){
            System.out.println("Anda mendapat nilai sempurna!");}
            else if (ipk<4.00 && ipk>=3.50){
                System.out.println("Anda mendapat nilai sangat memuaskan!");}
            else if (ipk<3.50 && ipk>=3.00){
                System.out.println("Anda mendapat nilai memuaskan!");}   
            else if (ipk<3.00 && ipk>=2.50){
                System.out.println("Anda mendapat nilai bagus!");}
            else if (ipk<2.50 && ipk>=2.00){
                System.out.println("Anda mendapat nilai cukup!");}
            else if (ipk<2.00){
                System.out.println("Anda mendapat nilai kurang!");
            }
    }
}
