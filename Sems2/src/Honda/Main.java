package Honda;
public class Main {
    public static void main(String[] args) {
        Perusahaan honda = new Perusahaan("Honda");
        honda.tambahCabang("Sukun", "Jl. S. Supriadi");
        honda.tambahCabang("Kartika Sari Dinoyo", "Jl. Mayjend M.T. Haryono Ruko Istana Dinoyo");
        
        honda.tambahPegawaiKeCabang("Sukun", "Budiono", "KEPALA_CABANG", 7_250_000, true);
        honda.tambahPegawaiKeCabang("Sukun", "Ali", "STAF", 3_250_000, true);
        honda.tambahPegawaiKeCabang("Kartika Sari Dinoyo", "Joko", "KEPALA_CABANG", 9_000_000, true);
        honda.tambahPegawaiKeCabang("Kartika Sari Dinoyo", "Budianto", "STAF", 100_000, false);
        System.out.println("");
        honda.cariPegawai("");
//        honda.cariPegawai("budi");
    }
}
