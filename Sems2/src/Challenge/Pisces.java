package Challenge;

public class Pisces extends Vertebrata{
    private boolean jenisAir;
    private String printJA;
    
    public Pisces(boolean jenisAir, String namaLatin, boolean caraBerkembangBiak) {
        super(namaLatin, caraBerkembangBiak);
        this.jenisAir = jenisAir;
        if (this.jenisAir) printJA = "Air tawar";
        else printJA = "Air laut";
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis air: " + printJA);
    }
}