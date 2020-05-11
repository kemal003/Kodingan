package Honda;
public class PegawaiTetap extends Pegawai {
    private int gaji;
    private int tunjanganJabatan;
    
    //constructor
    public PegawaiTetap(String nama, String jabatan, int gaji, int lamaBekerja){
        super(nama, jabatan, lamaBekerja);
        this.gaji = gaji;
        switch (Jabatan.valueOf(jabatan)) {
            case STAF: tunjanganJabatan = 250000; break;
            case ANALIS: tunjanganJabatan = 750000; break;
            case STAF_AHLI: tunjanganJabatan = 40000; break;
            case KEPALA_CABANG: tunjanganJabatan = 1200000; break;
            default : tunjanganJabatan = 0;
        }
        super.setTunjanganSenioritas(lamaBekerja * 5000);
    }
    
    //methods
    public int getGaji() {
        return gaji + tunjanganJabatan + super.getTunjanganSenioritas();
    }

    @Override
    public int getThr() {
        return (int) (getGaji() * 1.5);
    }

    @Override
    public String toString(){
        String result=super.toString();
        result+=String.format("THR : Rp. %,d\n", getThr());
        result+="Status : Pegawai Tetap\n";
        result+=String.format("Gaji : Rp. %,d\n", getGaji());
        return result;
    }
}
