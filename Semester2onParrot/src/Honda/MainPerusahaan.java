package Honda;
public class MainPerusahaan {
    public static void main(String[] args) {
        Perusahaan honda = new Perusahaan("Honda");
        honda.tambahCabang("Sukun", "Jl. S. Supriadi");
        honda.tambahCabang("Kartika Sari Dinoyo", "Jl. Mayjend M.T. Haryono Ruko Istana Dinoyo");

        honda.tambahPegawaiKeCabang("Sukun", "Budiono", "KEPALA_CABANG", 2_250_000, true, 10);
        honda.tambahPegawaiKeCabang("Sukun", "Ali", "ANALIS", 3_250_000, true, 15);
        honda.tambahPegawaiKeCabang("Sukun", "Sujatmiko", "STAF", 100_000, false, 36);
        honda.tambahPegawaiKeCabang("Kartika Sari Dinoyo", "Joko", "KEPALA_CABANG", 4_000_000, true, 20);
        honda.tambahPegawaiKeCabang("Kartika Sari Dinoyo", "Budianto", "STAF", 100_000, false, 5);
        honda.cariPegawai("");
//        honda.cariPegawai("budi");
    }
}
