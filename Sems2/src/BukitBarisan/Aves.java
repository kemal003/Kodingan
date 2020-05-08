package BukitBarisan;
public class Aves extends Vertebrata{
    //atribut tambahan
    private boolean terbang;
    static String klarifikasi="Aves";
    
    //constructor
    public Aves(String namaHewan, String namaLatin, boolean kembangBiak, boolean terbang) {
        super(namaHewan, namaLatin, kembangBiak);
        this.terbang = terbang;
    }
    
    //methods
    @Override
    public String toString() {
        String result = super.toString();
        result += "Terbang: ";
        if (terbang) return result + "Bisa\n";
        else return result + "Tidak bisa\n";
    }
    
    public static String getKlarifikasi() {
        return "Klarifikasi: " + klarifikasi + "\n";
    }
}