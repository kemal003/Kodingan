package Showroom;

public class Porsche extends Mobil implements SmartCar{
    private static final String[] listBonus = {
            "Rolex Model 1", "Rolex Model 2", "Rolex Model 3",
            "Rolex Model 4", "Rolex Model 5", "Rolex Model 6",
            "Rolex Model 7", "Rolex Model 8", "Rolex Model 9", "Rolex Model 10"
    };

    public Porsche(String namaMobil, String warnaMobil, boolean isMobilElektrik) {
        super(namaMobil, warnaMobil, isMobilElektrik);
    }

    @Override
    public String getBonus() {
        String namaMobil = super.getNamaMobil().toLowerCase();
        String bonus = "";
        int jumlahBonus = 0;
        if (namaMobil.contains("model 911")) jumlahBonus = 2;
        else if (namaMobil.contains("cayman")) jumlahBonus = 1;
        int i = (int) (Math.random() * 10);
        bonus += String.format("- %d buah Jam Tangan %s", jumlahBonus, listBonus[i]);
        return bonus;
    }

    @Override
    public String getMerek() {
        return "PORSCHE";
    }

    @Override
    public int getWaktuMaintenance() {
        if (super.isMobilElektrik()) return 2;
        else return 3;
    }

    @Override
    public boolean isSelfDriving() {
        return true;
    }

    @Override
    public boolean isSelfParking() {
        return false;
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
