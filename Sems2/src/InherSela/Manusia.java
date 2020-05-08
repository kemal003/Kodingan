package InherSela;
public class Manusia {
    //atribut
    private String nama;
    private int umur;
    private String gender;

    public Manusia(String nama, int umur, String gender) {
        this.nama = nama;
        this.umur = umur;
        this.gender = gender;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getGender() {
        return gender;
    }
    
    public String info(){
        return "Nama : " + nama + 
                "\nUmur : " + umur + 
                "\nGender : " + gender;
    }
    
}
