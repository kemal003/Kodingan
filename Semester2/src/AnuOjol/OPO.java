package AnuOjol;

public class OPO {
    private static int isiSaldo=0;

    public OPO() {
    }

    public void tambahSaldo(int tambahSaldo) {
        if (tambahSaldo>=0) {
            System.out.printf("Berhasil TopUp sebesar: Rp. %,d\n", tambahSaldo);
            isiSaldo += tambahSaldo;
        }
        else System.out.println("Gagal, TopUp salah");
        System.out.printf("Saldo sekarang: Rp. %,d\n", isiSaldo);
    }

    public void bayarOngkos(int bayar) {
        isiSaldo -= bayar;
    }

    public int getIsiSaldo() {
        return isiSaldo;
    }
}
