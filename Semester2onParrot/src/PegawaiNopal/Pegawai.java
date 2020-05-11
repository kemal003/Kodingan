package PegawaiNopal;

public class Pegawai {
    private final String nip;
    private final String nama;
    private final String alamat;

    public Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public int getGaji(){
        return 1_500_000;
    }

    public String getJenisPegawai(){
        return null;
    }

    @Override
    public String toString() {
        String result="";
        result+=String.format("%s\n",getJenisPegawai());
        result+=String.format("NIP \t\t: %s\n", nip);
        result+=String.format("Nama \t\t: %s\n", nama);
        result+=String.format("Alamat \t\t: %s\n", alamat);
        result+=String.format("Gaji \t\t: %,d\n", getGaji());
        return result;
    }
}
