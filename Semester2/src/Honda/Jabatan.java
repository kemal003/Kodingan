package Honda;
enum Jabatan {
    STAF("Staf"),
    STAF_AHLI("Staf Ahli"),
    ANALIS("Analis"),
    KEPALA_CABANG("Kepala Cabang");

    //attribut
    private final String name;

    //constructor
    Jabatan(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

