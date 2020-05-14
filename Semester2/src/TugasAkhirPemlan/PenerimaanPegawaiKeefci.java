
package TugasAkhirPemlan;

public abstract class PenerimaanPegawaiKeefci {
    private static final String Restaurant = "Open Recruitment Pegawai Keefci Arifin Ahmad";
    private String namacalonpegawai;
    private boolean jeniskelamin;
    private int umurpegawai;
    private final double gajipokok = 1000000;

    public PenerimaanPegawaiKeefci(String namacalonpegawai, boolean jeniskelamin, int umurpegawai) {
        this.namacalonpegawai = namacalonpegawai;
        this.jeniskelamin = jeniskelamin;
        this.umurpegawai = umurpegawai;
    }

    public static String getRestaurant() {
        return Restaurant;
    }

    public String getNamaCalonPegawai() {
        return namacalonpegawai;
    }

    public String getJeniskelamin() {
        if (jeniskelamin) return "Laki-laki";
        else return "Perempuan";
    }

    public int getUmurpegawai() {
        return umurpegawai;
    }

    public double getGajiPegawai() {
        return gajipokok;
    }

    public abstract void cetakBonus();

    public abstract String jabatanPegawai();

    @Override
    public String toString() {
        return "Nama Pegawai: " +getNamaCalonPegawai()+"\nJenis Kelamin: "+getJeniskelamin()+
                "\nJabatan Tersedia: "+jabatanPegawai()+"\nUmur: "+getUmurpegawai()+
                "\n"+String.format("Gaji: Rp. %,d", getGajiPegawai())+"\nPeralatan yang diberikan: ";
    }
}
