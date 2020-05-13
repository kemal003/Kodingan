package Ojol;

import Ojol.JenisModa.Moda;

public abstract class Pengemudi implements Comparable{
    private final String nama;
    private final double xPengemudi;
    private final double yPengemudi;
    private double jarakJemput;

    public Pengemudi(String nama, double xPengemudi, double yPengemudi) {
        this.nama = nama;
        this.xPengemudi = xPengemudi;
        this.yPengemudi = yPengemudi;
    }

    public void setJarakJemput(double jarakJemput) {
        this.jarakJemput = jarakJemput;
    }

    public double getxPengemudi() {
        return xPengemudi;
    }

    public double getyPengemudi() {
        return yPengemudi;
    }

    public abstract Moda getJenisModa();

    public abstract String getNoPol();

    public abstract double getBiayaSatuan();

    public double getJarakJemput() {
        return jarakJemput;
    }

    @Override
    public int compareTo(Object pengemudi) {
        int compareJarak = (int) Math.round(((Pengemudi) pengemudi).jarakJemput);
        return (int) this.jarakJemput-compareJarak;
    }

    public String getNama(){
        return nama;
    }

    @Override
    public String toString() {
        String result="";
        result+=String.format("Tipe kendaraan: %s", getJenisModa());
        result+=String.format("Nama pengemudi: %s\n", nama);

        return "Pengemudi{" +
                "kendaraan=" + getJenisModa() +
                ", xPengemudi=" + xPengemudi +
                ", yPengemudi=" + yPengemudi +
                ", jarakJemput=" + jarakJemput +
                ", satuan=" + getBiayaSatuan() +
                '}';
    }
}
