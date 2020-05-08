package Challenge;

public class BukitBarisan {
    public static void main(String[] args) {
        Pisces pari = new Pisces(false, "Aetobatus Narinari", false);
        Mamalia harimau = new Mamalia(4, "Pantera Tigris", false);
        Aves merpati = new Aves(true, "Columbidae", true);
        System.out.println("Hewan-hewan di Cagar Alam Bukit Barisan:");
        System.out.println("IKAN PARI");
        pari.tampilkanInfo();
        System.out.println("");
        System.out.println("HARIMAU");
        harimau.tampilkanInfo();
        System.out.println("");
        System.out.println("MERPATI");
        merpati.tampilkanInfo();
    }
}
