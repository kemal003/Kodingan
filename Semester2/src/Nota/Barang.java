package Nota;

public abstract class Barang {
    private String namaBarang;
    private int jumlahBarang;
    private String satuan;

    public Barang(int jumlahBarang, String satuan) {
        this.jumlahBarang = jumlahBarang;
        this.satuan = satuan;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    @Override
    public String toString() {
        return String.format("Nama barang : %s\n", namaBarang);
    }
}
