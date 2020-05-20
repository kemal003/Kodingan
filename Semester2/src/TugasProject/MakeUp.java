package TugasProject;

public abstract class MakeUp {
    private String nama;
    private String kategori;
    private int banyakBarang;
    private int harga;
    private int jmlhHarga;
    private static int diskon = 0;

    public MakeUp(String kategori, int banyakBarang) {
        this.kategori = kategori;
        this.banyakBarang = banyakBarang;
        diskon+=3;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getKategori(){
        return kategori;
    }

    public int getBanyakBarang() {
        return banyakBarang;
    }
    
    public int getHarga(){
        return harga;
    }

    public int getJmlhHarga() {
        return harga*banyakBarang*diskon/100;
    }
    
    public abstract String getReturBarang();
    
    public void info(){
        System.out.println("Merk: "+nama);
        System.out.println("Kategori item: "+kategori);
        System.out.println("Banyak item: "+banyakBarang);
        System.out.println("Diskon: "+diskon+"%");
        System.out.println("Total Harga: "+getJmlhHarga());     
    }      
}
