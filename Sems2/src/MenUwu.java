import java.util.*;
public class MenUwu {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String nama = inp.nextLine();
        String jabatan = inp.nextLine();
        double gaji = inp.nextDouble();
        Pegawai uwu = new Pegawai(nama, jabatan, gaji);
        int jamLembur = inp.nextInt();
        System.out.println("Nama : " + uwu.getNama());
        System.out.println("Jabatan : " + uwu.getJabatan());
        System.out.println("Gaji : Rp. " + uwu.getGaji());
        if (jamLembur >= 6){
            System.out.println("Total Gaji : Rp. " + uwu.getGaji(jamLembur));
        } else System.out.println("Total Gaji : Rp. " + uwu.getGaji());
    }
}