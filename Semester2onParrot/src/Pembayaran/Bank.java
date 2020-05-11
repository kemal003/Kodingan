package Pembayaran;

public abstract class Bank extends Keuangan implements Finansial {
    private String namaBank;
    private String noRekening;
    private String masaBerlaku;

    public Bank(String namaPemilik, String noRekening, int saldo, String masaBerlaku) {
        super(namaPemilik, saldo);
        this.noRekening = noRekening;
        this.masaBerlaku = masaBerlaku.substring(0, 2);
        switch (masaBerlaku.substring(2, 4)){
            case "01" : this.masaBerlaku += " Januari " + masaBerlaku.substring(4, 8); break;
            case "02" : this.masaBerlaku += " Februari " + masaBerlaku.substring(4, 8); break;
            case "03" : this.masaBerlaku += " Maret " + masaBerlaku.substring(4, 8); break;
            case "04" : this.masaBerlaku += " April " + masaBerlaku.substring(4, 8); break;
            case "05" : this.masaBerlaku += " Mei " + masaBerlaku.substring(4, 8); break;
            case "06" : this.masaBerlaku += " Juni " + masaBerlaku.substring(4, 8); break;
            case "07" : this.masaBerlaku += " Juli " + masaBerlaku.substring(4, 8); break;
            case "08" : this.masaBerlaku += " Agustus " + masaBerlaku.substring(4, 8); break;
            case "09" : this.masaBerlaku += " September " + masaBerlaku.substring(4, 8); break;
            case "10" : this.masaBerlaku += " Oktober " + masaBerlaku.substring(4, 8); break;
            case "11" : this.masaBerlaku += " November " + masaBerlaku.substring(4, 8); break;
            case "12" : this.masaBerlaku += " Desember " + masaBerlaku.substring(4, 8); break;
        }
    }

    public String getNoRekening() {
        return noRekening;
    }

    public void setNamaBank(String namaBank){
        this.namaBank = namaBank;
    }

    @Override
    public String toString() {
        return "Info Rekening [" + noRekening + "]\n" +
                "Nama Bank = " + namaBank + '\n' +
                "Nama Pemilik = " + super.getNamaPemilik() + '\n' +
                "Nomor Rekening = " + getNoRekening() + '\n' +
                String.format("Saldo = Rp. %,d", super.getSaldo()) + '\n' +
                "Masa Berlaku = " + masaBerlaku;
    }
}
