package Inheritance;
public class Manusia {
    //atribut
    private String nama;
    private String jenisKelamin;
    private int tahunLahir;
    private String namaIbu;

    public Manusia(String nama, String jenisKelamin, int tahunLahir, String namaIbu) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.tahunLahir = tahunLahir;
        this.namaIbu = namaIbu;
    }
    
    //methods
    public String getNama(){
        return nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public int getTahunLahir() {
        return tahunLahir;
    }

    public String getNamaIbu() {
        return namaIbu;
    }

    public String tampilkanInfo() {
        return "Nama : " + nama + "\nJenis Kelamin : " + jenisKelamin
                + "\nTahun Lahir : " + tahunLahir + "\nNama Ibu : " + namaIbu;
    }
}
