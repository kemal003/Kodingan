package Pembayaran;

public class Investasi extends Keuangan implements Finansial{
    private int jangkaWaktu;
    private double bunga;

    public Investasi(String namaPemilik, int saldo, int jangkaWaktu, double bunga) {
        super(namaPemilik, saldo);
        this.jangkaWaktu = jangkaWaktu;
        this.bunga = bunga;
    }

    @Override
    public int getSaldo() {
        double hitung=super.getSaldo();
        for (int i = 0; i < jangkaWaktu; i++) {
            hitung+=hitung * bunga;
        }
        return (int) (hitung);
    }

    @Override
    public String toString() {
        return "Info Investasi :\n" +
                "Nama Pemilik : " + super.getNamaPemilik() + '\n' +
                String.format("Saldo saat ini : Rp. %,d\n", super.getSaldo()) +
                String.format("Perkiraan saldo mendatang : Rp. %,d", getSaldo());
    }
}
