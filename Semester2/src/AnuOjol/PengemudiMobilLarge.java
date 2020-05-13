package AnuOjol;

public class PengemudiMobilLarge extends Pengemudi{
    private final int biayaSatuan=5000;

    public PengemudiMobilLarge(String nama, String noPol, double xPengemudi, double yPengemudi) {
        super(nama, noPol, xPengemudi, yPengemudi);
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
