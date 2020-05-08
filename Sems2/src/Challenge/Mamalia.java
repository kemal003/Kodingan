package Challenge;

public class Mamalia extends Vertebrata{
    private int jumlahKaki;

    public Mamalia(int jumlahKaki, String namaLatin, boolean caraBerkembangBiak) {
        super(namaLatin, caraBerkembangBiak);
        this.jumlahKaki = jumlahKaki;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah kaki: " + jumlahKaki);
    }
}