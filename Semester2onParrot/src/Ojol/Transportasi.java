package Ojol;

import Ojol.JenisModa.Moda;

public abstract class Transportasi extends Pengemudi {
    private String noPol;

    public Transportasi(String nama, double xPengemudi, double yPengemudi, String noPol) {
        super(nama, xPengemudi, yPengemudi);
        this.noPol = noPol;
    }

    public String getNoPol(){
        return this.noPol;
    }

    public abstract Moda getJenisModa();
}
