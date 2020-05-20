package TugasProject;

public class Emina extends MakeUp implements BonusPembelian{
    private final String nama = "Emina";
    private final int harga = 50000;

    public Emina(String kategori, int banyakBarang) {
        super(kategori, banyakBarang);
        super.setNama(nama);
        super.setHarga(harga);
    }
    
    @Override
    public String getBonus(){
        if(super.getJmlhHarga()>=70000){
            return "Mendapat Bonus: 2 buah Beauty Blender";
        }else
            return "Tidak mendapat bonus";
    }
    @Override
    public String getReturBarang(){
        return "3 Hari";
    }
    
    @Override
    public void info(){
        super.info();
        System.out.println(getBonus());
    }
    
}
