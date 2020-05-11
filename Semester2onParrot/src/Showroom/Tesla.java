package Showroom;

public class Tesla extends Mobil implements SmartCar{
    private static final String[] listBonus = {
            "Tesla Panel Model 1", "Tesla Panel Model 2", "Tesla Panel Model 3",
            "Tesla Panel Model 4", "Tesla Panel Model 5", "Tesla Panel Model 6",
            "Tesla Panel Model 7", "Tesla Panel Model 8", "Tesla Panel Model 9", "Tesla Panel Model 10",
    };

    public Tesla(String namaMobil, String warnaMobil, boolean isMobilElektrik) {
        super(namaMobil, warnaMobil, isMobilElektrik);
    }

    @Override
    public String getBonus() {
        String namaMobil = super.getNamaMobil().toLowerCase();
        String bonus = "";
        int jumlahBonus = 0;
        if (namaMobil.contains("model s")) jumlahBonus = 3;
        else if (namaMobil.contains("model x")) jumlahBonus = 5;
        int i = (int) (Math.random() * 10);
        bonus += String.format("- %d buah Panel Surya %s", jumlahBonus, listBonus[i]);
        return bonus;
    }

    @Override
    public String getMerek() {
        return "TESLA";
    }

    @Override
    public int getWaktuMaintenance() {
        if (super.isMobilElektrik()) return 1;
        else return 3;
    }

    @Override
    public boolean isSelfDriving() {
        return true;
    }

    @Override
    public boolean isSelfParking() {
        return true;
    }

    @Override
    public String toString() {
        String result=super.toString();
        result+=String.format("Fitur Smart Car :\n");
        result+=String.format("- Self Driving : %s\n", isSelfDriving());
        result+=String.format("- Self Parking : %s\n", isSelfParking());
        result += "Bonus :\n";
        result += getBonus() + '\n';
        return result;
    }
}
