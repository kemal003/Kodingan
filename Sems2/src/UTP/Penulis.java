package UTP;
public class Penulis {
    private String nama;
    private int umur;
    private String motivasi;
    private Buku buku[];

    public Penulis(String nama, int umur, String motivasi, int jumlahBuku) {
        this.nama = nama;
        this.umur = umur;
        this.motivasi = motivasi;
        buku = new Buku[jumlahBuku];
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getMotivasi() {
        return motivasi;
    }
    
    public void setBuku(Buku buku, int i){
        this.buku[i]=buku;
    }
    
    public void tampilkanBuku(){
        System.out.println(nama + " menulis " + buku.length + " buku, yaitu :");
        for (int i = 0; i < buku.length; i++) {
            System.out.println("Judul    : " + buku[i].getJudul());
            System.out.println("Sinopsis : " + buku[i].getSinopsis());
            System.out.println("");
        }
        System.out.println("=====================================");
    }
}
