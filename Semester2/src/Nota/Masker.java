package Nota;

public class Masker extends Barang {
    private static int totalStok;

    public Masker(int jumlahBarang, String satuan) {
        super(jumlahBarang, satuan);
        String pembanding = satuan.toLowerCase();
        super.setNamaBarang("Masker");
        switch (pembanding){
            case "pcs" : totalStok += jumlahBarang; break;
            case "box" : totalStok += jumlahBarang * 50;
            case "kardus" : totalStok += jumlahBarang * 50 * 8;
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
