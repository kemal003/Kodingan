package Pembayaran.JenisBank;

import Pembayaran.Bank;

public class BRI extends Bank {
    public BRI(String namaPemilik, String noRekening, int saldo, String masaBerlaku) {
        super(namaPemilik, noRekening, saldo, masaBerlaku);
        super.setNamaBank("BRI");
    }

    @Override
    public String getNoRekening() {
        return "(003)" + super.getNoRekening();
    }
}
