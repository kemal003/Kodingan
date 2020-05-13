package AnuOjol;

public class PengemudiMobilLarge extends Pengemudi{
    private final int biayaSatuan=5000;
    private static int jumlahModa=0;

    public PengemudiMobilLarge(String nama, String noPol, double xPengemudi, double yPengemudi) {
        super(nama, noPol, xPengemudi, yPengemudi);
        jumlahModa++;
    }

    public static int getJumlahModa() {
        return jumlahModa;
    }

    @Override
    public String getTipe() {
        return "Mobil (Large)";
    }

    @Override
    public int getBayar() {
        return biayaSatuan;
    }
}
