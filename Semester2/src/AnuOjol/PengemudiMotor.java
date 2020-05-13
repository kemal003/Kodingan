package AnuOjol;

public class PengemudiMotor extends Pengemudi{
    private final int biayaSatuan=2000;
    private static int jumlahModa=0;

    public PengemudiMotor(String nama, String noPol, double xPengemudi, double yPengemudi) {
        super(nama, noPol, xPengemudi, yPengemudi);
        jumlahModa++;
    }

    public static int getJumlahModa() {
        return jumlahModa;
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
