package PegawaiNopal;

public class Staf extends Pegawai{
    private int jumlahKehadiran;
    private static final int TARIF_HARIAN=100_000;

    public Staf(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    public void setJumlahKehadiran(int jumlahKehadiran) {
        this.jumlahKehadiran = jumlahKehadiran;
    }

    @Override
    public int getGaji(){
        return super.getGaji() + (jumlahKehadiran * TARIF_HARIAN);
    }

    @Override
    public String getJenisPegawai() {
        return "Staf";
    }

    @Override
    public String toString() {
        String result=super.toString();
        result+=String.format("Jumlah kehadiran \t\t: %d\n", jumlahKehadiran);
        return result;
    }
}
