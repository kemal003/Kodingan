package InherSela;
public class Mahasiswa extends Manusia {
//    //atribut
//    private String nama;
//    private int umur;
//    private String gender;
    
    //atribut tambahan
    private String nim;
    private String fakultas;

    public Mahasiswa(String nim, String fakultas, String nama, int umur, String gender) {
        super(nama, umur, gender);
        this.nim = nim;
        this.fakultas = fakultas;
    }
    
    public Mahasiswa(String nim, String fakultas, Manusia x){
        super(x.getNama(), x.getUmur(), x.getGender());
        this.nim = nim;
        this.fakultas = fakultas;
    }
    
    public String info(){
        return super.info() + 
                "\nNIM : " + nim + 
                "\nFakultas : " + fakultas;
    }
}
