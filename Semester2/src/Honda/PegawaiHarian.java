package Honda;
public class PegawaiHarian extends Pegawai{
    private int gaji;

    //constructor
    public PegawaiHarian(String nama, String jabatan, int gaji, int lamaBekerja){
        super(nama, jabatan, lamaBekerja);
        this.gaji = gaji;
        super.setTunjanganSenioritas(lamaBekerja / 6 * 5000);
    }
    
    //methods
    @Override
    public int getGaji() {
        return (gaji + super.getTunjanganSenioritas()) * 20;
        //asumsi 20 hari masuk kerja
    }
    
    public int getGaji(int jumlahMasuk){
        return gaji * jumlahMasuk;
    }

    @Override
    public int getThr() {
        if (super.getLamaBekerja()>12) return gaji * 45;
        else return 0;
    }

    @Override
    public String toString(){
        String result=super.toString();
        result+="Status : Pegawai Harian\n";
        result+=String.format("THR : Rp. %,d\n", getThr());
        result+=String.format("Upah harian : Rp. %,d\n", gaji);
        result+=String.format("Upah penuh bulanan : Rp. %,d\n", getGaji());
        return result;
    }
}
