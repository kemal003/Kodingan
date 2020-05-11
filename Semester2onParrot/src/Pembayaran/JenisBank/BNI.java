package Pembayaran.JenisBank;

import Pembayaran.Bank;

public class BNI extends Bank {
    public BNI(String namaPemilik, String noRekening, int saldo, String masaBerlaku) {
        super(namaPemilik, noRekening, saldo, masaBerlaku);
        super.setNamaBank("BNI");
    }

    @Override
    public String getNoRekening() {
        return "(001)" + super.getNoRekening();
    }
}
