package Honda;
public class PegawaiTetap extends Pegawai {
    private int gaji;
    
    //constructor
    public PegawaiTetap(String nama, String jabatan, int gaji){
        super(nama, jabatan);
        this.gaji = gaji;
    }
    
    //methods
    public int getGaji() {
        return gaji;
    }
 
    @Override
    public String toString(){
        String result=super.toString();
        result+="Status : Pegawai Tetap\n";
        result+=String.format("Gaji : %,d\n", gaji);
        return result;
    }
}
