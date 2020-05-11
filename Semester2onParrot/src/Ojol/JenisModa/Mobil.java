package Ojol.JenisModa;

import Ojol.Transportasi;

public class Mobil extends Transportasi {
    private final double biayaSatuan=4000;
    private final Moda jenisModa=Moda.MOBIL;

    public Mobil(String nama, double xPengemudi, double yPengemudi, String noPol) {
        super(nama, xPengemudi, yPengemudi, noPol);
    }

    public double getBiayaSatuan() {
        return biayaSatuan;
    }

    public Moda getJenisModa() {
        return jenisModa;
    }
}
