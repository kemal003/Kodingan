package Ojol.JenisModa;

public enum Moda {
    SEPEDA_MOTOR("SEPEDA_MOTOR"),
    MOBIL("MOBIL"),
    TAXI("TAXI");

    final String nama;

    Moda(String moda) {
        this.nama = moda;
    }

    @Override
    public String toString() {
        return nama;
    }
}
