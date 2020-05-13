package AnuOjol;

public class PengemudiMobil extends Pengemudi{
    private final int biayaSatuan=4000;
    private static int jumlahModa=0;

    public PengemudiMobil(String nama, String noPol, double xPengemudi, double yPengemudi) {
        super(nama, noPol, xPengemudi, yPengemudi);
        jumlahModa++;
    }

    public static int getJumlahModa() {
        return jumlahModa;
    }

    @Override
    public String getTipe() {
        return "Mobil";
    }

    @Override
    public int getBayar() {
        return biayaSatuan;
    }
}
