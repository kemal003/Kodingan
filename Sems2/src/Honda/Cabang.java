package Honda;
public class Cabang {
    private int n=0;
    private static int jumlahCabang = 0;
    private int kodeCabang;
    private String nama;
    private String alamat;
    private Pegawai[] daftarPegawai = new Pegawai[0];

    //constructor
    public Cabang(String nama, String alamat) {
        this.kodeCabang = jumlahCabang+1;
        this.nama = nama;
        this.alamat = alamat;
        Cabang.jumlahCabang++;
    }
    
    //methods
    public void tambahPegawai(String namaPegawai, String jabatan, int gaji, boolean isPegawaiTetap) {
        n++;
        Pegawai pegawaiBaru;
        if (isPegawaiTetap) {
            pegawaiBaru = new PegawaiTetap(namaPegawai, jabatan, gaji);
        } else {
            pegawaiBaru = new PegawaiHarian(namaPegawai, jabatan, gaji);
        }
        
        Pegawai[] xPegawai = new Pegawai[n];
        for (int i = 0; i < daftarPegawai.length; i++) {
            xPegawai[i] = daftarPegawai[i];
        }
        xPegawai[n-1] = pegawaiBaru;
        daftarPegawai = xPegawai;
        
        System.out.printf("Pegawai %s berhasil ditambahkan ke cabang %s dengan nomor induk: %d\n",
                namaPegawai, nama, pegawaiBaru.getNomorInduk());
    }
    
    public static int getJumlahCabang() {
        return jumlahCabang;
    }

    public int getKodeCabang() {
        return kodeCabang;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public Pegawai[] getDaftarPegawai() {
        return daftarPegawai;
    }
    
}
