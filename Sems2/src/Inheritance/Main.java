package Inheritance;
public class Main {
    public static void main(String[]args){
        Manusia x = new Manusia("Kemal Abdillah", "L", 2001, "Siti Cholishoh");
        WNI xA = new WNI("3503110503010005", "Trenggalek", x);
        System.out.println(xA.tampilkanInfo());

        Mahasiswa xAfilkom = new Mahasiswa ("195150207111007", "Ilmu Komputer", "Teknik Informatika", xA, x);
        System.out.println(xAfilkom.tampilkanInfo());
    }
}
