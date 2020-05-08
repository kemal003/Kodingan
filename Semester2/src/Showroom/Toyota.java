package Showroom;

public class Toyota extends Mobil {
    private static final String[] listBonus = {
            "Sushi Tei 50%", "Yoshinoya 50%", "Starbucks 50%",
            "Chatime 50%", "Ace Hardware 50%", "KFC 50%",
            "Domino Pizza 50%", "Gucci 50%", "Hermes 50%", "Luis Vuitton 50%"
    };

    public Toyota(String namaMobil, String warnaMobil, boolean isMobilElektrik) {
        super(namaMobil, warnaMobil, isMobilElektrik);
    }

    @Override
    public String getBonus() {
        String namaMobil = super.getNamaMobil().toLowerCase();
        String bonus = "";
        int jumlahBonus = 0;
        if (namaMobil.contains("alphard")) jumlahBonus = 6;
        else if (namaMobil.contains("yaris sport")) jumlahBonus = 3;
        int i = (int) (Math.random() * 10);
        bonus += String.format("- %d Voucher Belanja %s", jumlahBonus, listBonus[i]);
        return bonus;
    }

    @Override
    public String getMerek() {
        return "TOYOTA";
    }

    @Override
    public int getWaktuMaintenance() {
        return 5;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "Bonus :\n";
        result += getBonus() + '\n';
        return result;
    }
}