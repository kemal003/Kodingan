package BukitBarisan;
public class Mamalia extends Vertebrata{
    //atribut tambahan
    private int jumlahKaki;
    static String klarifikasi="Mamalia";
    
    //constructor
    public Mamalia(String namaHewan, String namaLatin, boolean kembangBiak, int jumlahKaki) {
        super(namaHewan, namaLatin, kembangBiak);
        this.jumlahKaki = jumlahKaki;
    }
    
    //methods
    @Override
    public String toString() {
        String result = super.toString();
        result += "Jumlah kaki: " + jumlahKaki + "\n";
        return result;
    }
    
    public static String getKlarifikasi() {
        return "Klarifikasi: " + klarifikasi + "\n";
    }
}