package AnuOjol;

public abstract class Pengemudi implements Pembayaran, Comparable<Pengemudi>{
    private String nama;
    private String noPol;
    private double xPengemudi;
    private double yPengemudi;
    private double jarakKePenumpang;

    public Pengemudi(String nama, String noPol, double xPengemudi, double yPengemudi) {
        this.nama = nama;
        this.noPol = noPol;
        this.xPengemudi = xPengemudi;
        this.yPengemudi = yPengemudi;
    }

    public String getNama() {
        return nama;
    }

    public String getNoPol() {
        return noPol;
    }

    public double getxPengemudi() {
        return xPengemudi;
    }

    public double getyPengemudi() {
        return yPengemudi;
    }

    public double getJarakKePenumpang() {
        return jarakKePenumpang;
    }

    public void setJarakKePenumpang(double xPenumpang, double yPenumpang) {
        jarakKePenumpang = Math.abs(xPenumpang-xPengemudi)+Math.abs(yPenumpang-yPengemudi);
    }

    @Override
    public int compareTo(Pengemudi pengemudi) {
        int compareJarak = (int) Math.round(pengemudi.jarakKePenumpang);
        return (int) this.jarakKePenumpang-compareJarak;
    }

    public abstract String getTipe();

    public abstract int getBayar();

    @Override
    public String toString() {
        String result="";
        result+=String.format("Tipe Moda: %s\n", getTipe());
        result+=String.format("Nama pengemudi: %s\n", nama);
        result+=String.format("No. Polisi: %s\n", noPol);
        result+=String.format("Jarak ke anda: %.1f\n", jarakKePenumpang);
        return result;
    }
}
