package Pembayaran.JenisBank;

import Pembayaran.Bank;

public class BCA extends Bank {
    public BCA(String namaPemilik, String noRekening, int saldo, String masaBerlaku) {
        super(namaPemilik, noRekening, saldo, masaBerlaku);
        super.setNamaBank("BCA");
    }

    @Override
    public String getNoRekening() {
        return "(002)" + super.getNoRekening();
    }
}
