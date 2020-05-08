package Showroom;

public abstract class Mobil {
    private final String namaMobil;
    private final String warnaMobil;
    private final boolean isMobilElektrik;

    public Mobil(String namaMobil, String warnaMobil, boolean isMobilElektrik) {
        this.namaMobil = namaMobil;
        this.warnaMobil = warnaMobil;
        this.isMobilElektrik = isMobilElektrik;
    }

    public String getNamaMobil() {
        return namaMobil;
    }

    public String getWarnaMobil() {
        return warnaMobil;
    }

    public boolean isMobilElektrik() {
        return isMobilElektrik;
    }

    public abstract String getMerek();

    public abstract int getWaktuMaintenance();

    public abstract String getBonus();

    @Override
    public String toString() {
        String result="";
        result+=String.format("Nama mobil : %s %s\n", getMerek(), namaMobil);
        result+=String.format("Warna : %s\n", warnaMobil);
        if (isMobilElektrik) result+="Jenis mobil : Elektrik\n";
        else result+="Jenis mobil : Non-elektrik\n";
        result+=String.format("Maintenance : setiap %d tahun\n", getWaktuMaintenance());
        return result;
    }
}