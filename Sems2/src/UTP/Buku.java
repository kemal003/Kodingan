package UTP;
public class Buku {
    private String judul;
    private String sinopsis;
    private Penulis penulis[];
    static int stokBuku;

    public Buku(String judul, String sinopsis, int stokBuku, int jumlahPenulis) {
        this.judul = judul;
        this.sinopsis = sinopsis;
        Buku.stokBuku = stokBuku;
        penulis = new Penulis[jumlahPenulis];
    }

    public String getJudul() {
        return judul;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public Penulis[] getPenulis() {
        return penulis;
    }

    public int getStokBuku() {
        return stokBuku;
    }
    
    public void setPenulis(int i, Penulis penulisx){
        penulis[i]=penulisx;
    }
    
    public void kurangiStok(){
        stokBuku--;
    }
    
    public void tampilkanPenulis(){
        System.out.println("Buku " + judul + " ditulis oleh : ");
        for (int i = 0; i < penulis.length; i++) {
            System.out.println("Nama     : " + penulis[i].getNama());
            System.out.println("Umur     : " + penulis[i].getUmur());
            System.out.println("Motivasi : " + penulis[i].getMotivasi());
            System.out.println("");
        }
        System.out.println("=====================================");
    }
}
