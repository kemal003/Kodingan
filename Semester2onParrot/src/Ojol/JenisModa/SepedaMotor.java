package Ojol.JenisModa;

import Ojol.Transportasi;

public class SepedaMotor extends Transportasi {
    private final double biayaSatuan=2000;
    private final Moda jenisModa=Moda.SEPEDA_MOTOR;

    public SepedaMotor(String nama, double xPengemudi, double yPengemudi, String noPol) {
        super(nama, xPengemudi, yPengemudi, noPol);
    }

    public double getBiayaSatuan() {
        return biayaSatuan;
    }

    public Moda getJenisModa() {
        return jenisModa;
    }
}
