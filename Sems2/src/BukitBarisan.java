class Vertebrata {
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

class Pisces extends Vertebrata{
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

class Mamalia extends Vertebrata{
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

class Aves extends Vertebrata{
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

public class BukitBarisan {
    public static void main(String[] args) {
        Pisces maskoki = new Pisces("Ikan Maskoki", "Carassius Auratus", true, true);
        Mamalia gajah = new Mamalia("Gajah Asia", "Elephas Maximus", false, 4);
        Aves cendrawasih = new Aves("Cendrawasih", "Paradisaea Apoda", true, true);
        System.out.println("CAGAR ALAM BUKIT BARISAN");
        System.out.println("=========================");
        System.out.println("Terdapat beberapa hewan di dalamnya yakni sebagai berikut:\n");
        System.out.println(maskoki + Pisces.getKlarifikasi());
        System.out.println(gajah + Mamalia.getKlarifikasi());
        System.out.println(cendrawasih + Aves.getKlarifikasi());
    }
}
