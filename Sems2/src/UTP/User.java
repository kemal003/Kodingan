package UTP;
public class User {
    private String nama;
    private String nopel;
    private int jumlahPinjam;
    private Buku buku[];
    private Buku bukuPinjam[];
    private Buku stokKosong[];

    public User(String nama, String nopel, int jumlahPinjam) {
        this.nama = nama;
        this.nopel = nopel;
        this.jumlahPinjam = jumlahPinjam;
        buku = new Buku[jumlahPinjam];
        bukuPinjam = new Buku[jumlahPinjam];
        stokKosong = new Buku[6];
    }

    public String getNama() {
        return nama;
    }

    public String getNopel() {
        return nopel;
    }
    
    public void setPinjam(Buku buku, int i){
        this.buku[i] = buku;
    }
    
    public void cekBuku(){
        for (int i = 0; i < buku.length; i++) {
            if (buku[i].getStokBuku()!=0){
                bukuPinjam[i]=buku[i];
                buku[i].kurangiStok();
            }
            else stokKosong[i]=buku[i];
        }
    }
    
    public void tampilkanUser(){
        System.out.println("Nama : " + nama);
        System.out.println("Nomor pelanggan : " + nopel);
        System.out.println("List buku : ");
        for (int i = 0; i < bukuPinjam.length; i++) {
            System.out.println((i+1) + ". Buku " + bukuPinjam[i].getJudul());
        }
        for (int i = 0; i < stokKosong.length; i++) {
            if (stokKosong[i]!=null) {
                System.out.println("Terdapat buku yang kosong yaitu: ");
                System.out.println("Buku " + stokKosong[i].getJudul());
            }
        }
        System.out.println("Biaya pinjam : ");
        System.out.println("====================================");
    }
}
