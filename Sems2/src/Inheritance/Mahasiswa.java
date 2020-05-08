package Inheritance;
public class Mahasiswa extends WNI {
    private String nim;
    private String fakultas;
    private String prodi;

    public Mahasiswa(String nim, String fakultas, String prodi, WNI wni, Manusia manusia) {
        super(wni.getNik(), wni.getTempatLahir(), manusia);
        this.nim = nim;
        this.fakultas = fakultas;
        this.prodi = prodi;
    }
    
    @Override
    public String tampilkanInfo(){
        return super.tampilkanInfo() + "\n\nMerupakan Mahasiswa Universitas Brawijaya dengan data : " +
                "\nNIM : " + nim + "\nFakultas : " + fakultas + "\nProdi : " +
                prodi;
    } 
}
