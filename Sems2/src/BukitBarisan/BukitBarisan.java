package BukitBarisan;
public class BukitBarisan {
    public static void main(String[] args) {
        Pisces maskoki = new Pisces("Ikan Maskoki", "Carassius Auratus", true, true);
        Mamalia gajah = new Mamalia("Gajah Asia", "Elephas Maximus", false, 4);
        Aves cendrawasih = new Aves("Cendrawasih", "Paradisaea Apoda", true, true);
        System.out.println("CAGAR ALAM BUKIT BARISAN");
        System.out.println("=========================");
        System.out.println("Terdapat beberapa hewan di dalamnya yakni sebagai berikut:\n");
        System.out.println(maskoki + Pisces.getKlarifikasi());
        System.out.println(gajah + Mamalia.getKlarifikasi());
        System.out.println(cendrawasih + Aves.getKlarifikasi());
    }
}
