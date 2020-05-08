package Inheritance;
public class WNI extends Manusia{
    //atribut tambahan
    private String nik;
    private String tempatLahir;

    public WNI(String nik, String tempatLahir, Manusia manusia) {
        super(manusia.getNama(), manusia.getJenisKelamin(), manusia.getTahunLahir(), manusia.getNamaIbu());
        this.nik = nik;
        this.tempatLahir = tempatLahir;
    }
    
    //methods
    public String getNik() {
        return nik;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }
    
    @Override
    public String tampilkanInfo() {
        return super.tampilkanInfo() + "\nNIK : " + nik + "\nTempat Lahir : "
                + tempatLahir;
    }
}
