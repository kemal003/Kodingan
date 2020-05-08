package Challenge;

public class Vertebrata {
    private String namaLatin;
    private boolean caraBerkembangBiak;
    private String printCBB;

    public Vertebrata(String namaLatin, boolean caraBerkembangBiak) {    
        this.namaLatin = namaLatin;
        if (this.caraBerkembangBiak) printCBB = "Bertelur";
        else printCBB = "Beranak";
    }

    public void tampilkanInfo() {
        System.out.println("Nama latin: " + namaLatin);
        System.out.println("Cara berkembang biak: " + printCBB);
    }
}