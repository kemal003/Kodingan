package InherSela;
public class Main {
    public static void main(String[]args){
        Manusia kemal = new Manusia("Kemal Abdillah", 19, "Laki-laki");
        
        Mahasiswa sela = new Mahasiswa("195150207111002", "Ilmu Komputer", "Sela Azilah", 18, "Perempuan");
        Mahasiswa kemalx = new Mahasiswa("195150207111007", "Ilmu Komputer", kemal);
        
//        System.out.println(kemal.info());
        System.out.println(sela.info());
    }
}
