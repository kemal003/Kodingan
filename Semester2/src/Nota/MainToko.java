package Nota;

public class MainToko {
    public static void main(String[] args) {
        Stok stokBaru = new Stok();
        stokBaru.tambahBarang(new Mie(4, "kardus"));
        stokBaru.tambahBarang(new Masker(8, "box"));
        stokBaru.tambahBarang(new Mie(4, "kardus"));
        System.out.println(stokBaru.getSirkulasi());
    }
}
