package TugasProject;

public class Wardah extends MakeUp implements BonusPembelian{
    private final String nama = "Wardah";
    private final int harga = 80000;
    
    public Wardah(String kategori, int banyakBarang) {
        super(kategori, banyakBarang);
        super.setNama(nama);
        super.setHarga(harga);
    }
    
    @Override
    public String getBonus(){
        if(super.getJmlhHarga()>=100000){
            return "Mendapat bonus: 1 buah Brush Pack";
        }else 
            return "Tidak mendapat bonus";
    }
    
    @Override
    public String getReturBarang(){
        return "5 Hari";
    }
    
    @Override               
    public void info(){
        super.info();
        System.out.println(getBonus());
    }   
}
