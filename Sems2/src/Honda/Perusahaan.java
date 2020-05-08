package Honda;
public class Perusahaan {
    private int n=0;
    private String nama;
    private Cabang[] daftarCabang = new Cabang[0];

    //constructor
    public Perusahaan(String nama) {
        this.nama = nama;
    }
    
    //methods
    public void tambahCabang(String namaCabang, String alamatCabang){
        n++;
        Cabang cabangBaru = new Cabang(namaCabang, alamatCabang);
        Cabang[] xCabang = new Cabang[n];
        for (int i = 0; i < daftarCabang.length; i++) {
            xCabang[i] = daftarCabang[i];
        }
        xCabang[n-1] = cabangBaru;
        daftarCabang = xCabang;
        
        System.out.printf("%s cabang %s berhasil ditambahkan dengan kode cabang: %d\n", 
                nama, namaCabang, cabangBaru.getKodeCabang());
    }
    
    public void tambahPegawaiKeCabang(String namaCabang, String namaPegawai, String jabatan, int gaji, boolean isPegawaiTetap){
        for (int i = 0; i < daftarCabang.length; i++) {
            if (daftarCabang[i].getNama().equalsIgnoreCase(namaCabang)){
                daftarCabang[i].tambahPegawai(namaPegawai, jabatan, gaji, isPegawaiTetap);
                break;
            }
        }
    }
    
    public void cariPegawai (String namaPegawai){
        int x=0;
        String cariPegawai = namaPegawai.toLowerCase();
        System.out.println("==HASIL PENCARIAN==");
        for (int i = 0; i < daftarCabang.length; i++) {
            for (int j = 0; j < daftarCabang[i].getDaftarPegawai().length; j++) {
                if (daftarCabang[i].getDaftarPegawai()[j].getNama().toLowerCase().contains(cariPegawai)) {
                    System.out.printf("Pegawai '%s' ditemukan pada cabang %s dengan informasi:\n",
                            namaPegawai, daftarCabang[i].getNama());
                    System.out.println(daftarCabang[i].getDaftarPegawai()[j]);
                    x++;
                }
            }
        }
        if (x==0) System.out.println("PEGAWAI TIDAK DITEMUKAN");
    }

    public Cabang[] getDaftarCabang() {
        return daftarCabang;
    }
}
