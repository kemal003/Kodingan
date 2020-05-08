package Honda;
public class Pegawai {
    private static int jumlahPegawai = 0;
    private String nama;
    private int nomorInduk;
    private Jabatan jabatan;
    private int lamaBekerja;
    private int tunjanganSenioritas;
    private int thr;
    private int gaji;

    //constructor
    public Pegawai(String nama, String jabatan, int lamaBekerja) {
        this.nama = nama;
        this.nomorInduk = jumlahPegawai + 1;
        this.jabatan = Jabatan.valueOf(jabatan);
        this.lamaBekerja = lamaBekerja;
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

    public int getTunjanganSenioritas() {
        return tunjanganSenioritas;
    }

    public int getThr() {
        return thr;
    }

    public int getGaji() {
        return gaji=0;
    }

    public int getLamaBekerja() {
        return lamaBekerja;
    }

    public void setTunjanganSenioritas(int tunjanganSenioritas) {
        this.tunjanganSenioritas = tunjanganSenioritas;
    }

    public void setThr(int thr) {
        this.thr = thr;
    }

    @Override
    public String toString() {
        String result="";
        result+="Nomor Induk : " + nomorInduk + '\n';
        result+="Nama : " + nama + '\n';
        result+="Jabatan : " + jabatan + '\n';
        return result;
    }   
}
