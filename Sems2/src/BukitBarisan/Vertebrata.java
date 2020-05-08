package BukitBarisan;
public class Vertebrata {
    //atribut
    private String namaHewan;
    private String namaLatin;
    private boolean kembangBiak;

    //constructor
    public Vertebrata(String namaHewan, String namaLatin, boolean kembangBiak) {
        this.namaHewan = namaHewan;
        this.namaLatin = namaLatin;
        this.kembangBiak = kembangBiak;
    }
    
    //methods
    @Override
    public String toString() {
        String result = "";
        result += "[" + namaHewan + "]\n";
        result += "Nama latin: " + namaLatin + "\n";
        result += "Cara berkembang biak: ";
        if (kembangBiak) return result + "Bertelur\n";
        else return result + "Beranak\n";
    }
}