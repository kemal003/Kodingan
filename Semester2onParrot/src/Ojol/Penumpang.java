package Ojol;

public class Penumpang {
    private String nama;
    private eDompet eDompet;
    private Lokasi lokasi;

    public Penumpang(String nama) {
        this.nama = nama;
        lokasi = new Lokasi();
        eDompet = new eDompet();
    }

    public Penumpang() {
        lokasi = new Lokasi();
        eDompet = new eDompet();
    }

    public String getNama() {
        return nama;
    }

    public eDompet geteDompet() {
        return eDompet;
    }

    public double getJarak() {
        return lokasi.getJarak();
    }

    public Lokasi getLokasi() {
        return lokasi;
    }

    @Override
    public String toString() {
        if (this.lokasi==null) return nama;
        else return String.format("Nama : %s\n" +
                "Titik jemput :\n" +
                "x = %.1f y = %.1f\n" +
                "Titik antar : \n" +
                "x = %.1f y = %.1f", nama, lokasi.getxJemput(), lokasi.getyJemput(),
                lokasi.getxAntar(), lokasi.getyAntar());
    }
}
