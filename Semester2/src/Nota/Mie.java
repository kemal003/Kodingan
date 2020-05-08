package Nota;

public class Mie extends Barang{
    private static int totalStok;

    public Mie(int jumlahBarang, String satuan) {
        super(jumlahBarang, satuan);
        String pembanding = satuan.toLowerCase();
        super.setNamaBarang("Mie");
        switch (pembanding){
            case "pcs" : totalStok += jumlahBarang; break;
            case "kardus" : totalStok += jumlahBarang * 40;
        }
    }

    public static int getTotalStok() {
        return totalStok;
    }

    @Override
    public String toString() {
        return String.format("%sTotal stok : %d\n\n", super.toString(), totalStok);
    }
}
