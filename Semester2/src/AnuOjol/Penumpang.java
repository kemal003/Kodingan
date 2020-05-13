package AnuOjol;

public class Penumpang {
    private String nama;
    private double xJemput, yJemput;
    private double xTujuan, yTujuan;
    private OPO opo;

    public Penumpang() {
        opo = new OPO();
    }

    public String getNama() {
        return nama;
    }

    public double getxJemput() {
        return xJemput;
    }

    public double getyJemput() {
        return yJemput;
    }

    public double getxTujuan() {
        return xTujuan;
    }

    public double getyTujuan() {
        return yTujuan;
    }

    public OPO getOpo() {
        return opo;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJemput(double xJemput, double yJemput) {
        this.xJemput = xJemput;
        this.yJemput = yJemput;
        System.out.println(String.format("Lokasi jemput berhasil diset ke : (%.1f ; %.1f)", this.xJemput, this.yJemput));
    }

    public void setTujuan(double xTujuan, double yTujuan) {
        this.xTujuan = xTujuan;
        this.yTujuan = yTujuan;
        System.out.println(String.format("Lokasi tujuan berhasil diset ke : (%.1f ; %.1f)", this.xTujuan, this.yTujuan));
    }

    public double getJarak() {
        return (Math.abs(xJemput-xTujuan)+Math.abs(yJemput-yTujuan));
    }
}
