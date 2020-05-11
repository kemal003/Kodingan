package PegawaiNopal;

public class MainGaji {
    public static void main(String[] args) {
        DaftarGaji daftarGaji = new DaftarGaji(3);

        Staf jokoSasongko = new Staf("1500230492004", "Joko Sasongko", "Jalan Bunga Merak");
        jokoSasongko.setJumlahKehadiran(20);
        Dosen jokoSusilo = new Dosen("1500231082001", "Joko Susilo", "Villa Tidar");
        jokoSusilo.setJumlahSKS(16);
        Dosen santoso = new Dosen("1500120176001", "Santoso", "Permata Jingga");
        santoso.setJumlahSKS(12);
        Staf rahmatAbadi = new Staf("1500180996004", "Rahmat Abadi", "Jalan Bandung");
        rahmatAbadi.setJumlahKehadiran(10);

        daftarGaji.addPegawai(jokoSasongko);
        daftarGaji.addPegawai(jokoSusilo);
        daftarGaji.addPegawai(santoso);
        daftarGaji.addPegawai(rahmatAbadi);

        System.out.println();
        daftarGaji.printSemuaGaji();
    }
}
