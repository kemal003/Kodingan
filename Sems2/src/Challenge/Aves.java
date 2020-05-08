package Challenge;

public class Aves extends Vertebrata{
    private boolean terbang;
    private String printTerbang;

    public Aves(boolean terbang, String namaLatin, boolean caraBerkembangBiak) {
        super(namaLatin, caraBerkembangBiak);
        if (this.terbang) printTerbang="Bisa";
        else printTerbang="Tidak bisa";
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Bisa terbang: " + printTerbang);
    }
}