package Honda;
public class PegawaiHarian extends Pegawai{
    private int gaji;
    
    //constructor
    public PegawaiHarian(String nama, String jabatan, int gaji){
        super(nama, jabatan);
        this.gaji = gaji;
    }
    
    //methods
    public int getGaji() {
        return gaji * 20;
        //asumsi 20 hari masuk kerja
    }
    
    public int getGaji(int jumlahMasuk){
        return gaji * jumlahMasuk;
    }
 
    @Override
    public String toString(){
        String result=super.toString();
        result+="Status : Pegawai Harian\n";
        result+=String.format("Upah harian : %,d\n", gaji);
        result+=String.format("Upah penuh bulanan : %,d\n", getGaji());
        return result;
    }
}
