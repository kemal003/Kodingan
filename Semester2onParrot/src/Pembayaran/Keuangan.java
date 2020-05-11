package Pembayaran;

public class Keuangan {
    private String namaPemilik;
    private int saldo;

    public Keuangan(String namaPemilik, int saldo) {
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public int getSaldo() {
        return saldo;
    }
}
