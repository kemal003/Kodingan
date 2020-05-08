package BukitBarisan;
public class Pisces extends Vertebrata{
    //atribut tambahan
    private boolean jenisAir;
    static String klarifikasi="Pisces";
    
    //constructor
    public Pisces(String namaHewan, String namaLatin, boolean kembangBiak, boolean jenisAir) {
        super(namaHewan, namaLatin, kembangBiak);
        this.jenisAir = jenisAir;
    }
    
    //methods
    @Override
    public String toString() {
        String result = super.toString();
        result += "Jenis air: ";
        if(jenisAir) return result + "Air tawar\n";
        else return result + "Air laut\n";
    }

    public static String getKlarifikasi() {
        return "Klarifikasi: " + klarifikasi + "\n";
    }
}