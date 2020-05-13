package AnuOjol;

public class OPO {
    private static int isiSaldo=0;

    public OPO() {
    }

    public void tambahSaldo(int tambahSaldo) {
        isiSaldo += tambahSaldo;
        if (tambahSaldo!=0) System.out.printf("Berhasil TopUp sebesar: Rp. %,d\n", tambahSaldo);
        System.out.printf("Saldo sekarang: Rp. %,d\n", isiSaldo);
    }

    public void bayarOngkos(int bayar) {
        isiSaldo -= bayar;
    }

    public int getIsiSaldo() {
        return isiSaldo;
    }
}
