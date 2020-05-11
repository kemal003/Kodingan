package PegawaiNopal;

public class Dosen extends Pegawai{
    private int jumlahSKS;
    private static final int TARIF_SKS=500_000;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    public void setJumlahSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }

    public int getGaji(){
        return super.getGaji() + (jumlahSKS * TARIF_SKS);
    }

    @Override
    public String getJenisPegawai() {
        return "Dosen";
    }

    @Override
    public String toString() {
        String result=super.toString();
        result+=String.format("Jumlah SKS \t\t: %d\n", jumlahSKS);
        return result;
    }
}
