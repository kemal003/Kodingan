package Honda;
public class Pegawai {
    private static int jumlahPegawai = 0;
    private String nama;
    private int nomorInduk;
    private Jabatan jabatan;

    //constructor
    public Pegawai(String nama, String jabatan) {
        this.nama = nama;
        this.nomorInduk = jumlahPegawai + 1;
        this.jabatan = Jabatan.valueOf(jabatan);
        Pegawai.jumlahPegawai++;
    }

    //methods
    public String getNama() {
        return nama;
    }

    public int getNomorInduk() {
        return nomorInduk;
    }

    public Jabatan getJabatan() {
        return jabatan;
    }

    @Override
    public String toString() {
        String result="";
        result+="Nama : " + nama + '\n';
        result+="Nomor Induk : " + nomorInduk + '\n';
        result+="Jabatan : " + jabatan + '\n';
        return result;
    }   
}
