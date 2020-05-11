package Ojol;

public class eDompet {
    private double saldo=0;

    public void topUp(double tambah){
        saldo+=tambah;
    }

    public void bayar(double bayar){
        saldo-=bayar;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isSaldoMemenuhi(double biaya){
        return this.saldo >= 10000 && this.saldo >= biaya;
    }
}
