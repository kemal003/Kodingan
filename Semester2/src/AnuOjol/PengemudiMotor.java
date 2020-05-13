package AnuOjol;

public class PengemudiMotor extends Pengemudi{
    private final int biayaSatuan=2000;

    public PengemudiMotor(String nama, String noPol, double xPengemudi, double yPengemudi) {
        super(nama, noPol, xPengemudi, yPengemudi);
    }

    @Override
    public String getTipe() {
        return "Motor";
    }

    @Override
    public int getBayar() {
        return biayaSatuan;
    }
}
