package Ojol.JenisModa;

import Ojol.Transportasi;

public class Taxi extends Transportasi {
    private final double biayaSatuan=4500;
    private final Moda jenisModa=Moda.TAXI;

    public Taxi(String nama, double xPengemudi, double yPengemudi, String noPol) {
        super(nama, xPengemudi, yPengemudi, noPol);
    }

    public double getBiayaSatuan() {
        return biayaSatuan;
    }

    public Moda getJenisModa() {
        return jenisModa;
    }
}
