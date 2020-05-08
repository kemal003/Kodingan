public class Buku {
    private String judul;
    private String kode;
    private String penulis;
    private int harga;
    static public String Irzabgst;
    static int jumlahBuku;

    public Buku(){
        jumlahBuku++;
    }
    
    public Buku(String judul, String kode, String penulis, int harga) {
        this.judul = judul;
        this.kode = kode;
        this.penulis = penulis;
        this.harga = harga;
    }
    
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public static int getJumlahBuku() {
        return jumlahBuku;
    }
    
}

class MainBuku{
    public static void main(String[] args) {
        Buku b1 = new Buku();
        b1.setJudul("UWAWU");
        Buku.Irzabgst="BENAR";
        System.out.println(b1.getJudul());
        
    }
}


