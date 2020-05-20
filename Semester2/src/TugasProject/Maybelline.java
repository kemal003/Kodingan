package TugasProject;

public class Maybelline extends MakeUp implements BonusPembelian{
    private final String nama = "Maybelline";
    private final int harga = 100000;

    public Maybelline(String kategori, int banyakBarang) {
        super(kategori, banyakBarang);
        super.setNama(nama);
        super.setHarga(harga);
    }
    
    @Override
    public String getBonus(){
        if(super.getJmlhHarga()>=140000){
            return "Mendapat bonus: 1 buah Lipstick";
        }else
            return "Tidak mendapat bonus";
    }
    @Override
    public String getReturBarang(){
        return "1 Minggu";
    }
    
    @Override 
    public void info(){
        super.info();
        System.out.println(getBonus());
    }    
}

