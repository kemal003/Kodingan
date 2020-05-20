package TugasAkhirPemlan;

public class PegawaiPria extends PenerimaanPegawaiKeefci implements Jabatan {

    private final String[] bonuskerja = {"Spatula keefci", "Sepatu keefci", "Sisau keefci"
    };

    public PegawaiPria(String namacalonpegawai, boolean jeniskelamin, int umurpegawai) {
        super(namacalonpegawai, jeniskelamin, umurpegawai);
    }

    public double getGajiPegawai() {
        return super.getGajiPegawai() + 500000;
    }

    public String[] getBonuskerja() {
        return bonuskerja;
    }

    @Override
    public String jabatanPegawai() {
        return "Koki";
    }

    @Override
    public String cetakBonus() {
        String hasil="";
        for (int i = 0; i < bonuskerja.length; i++) {
            hasil+=("- " + bonuskerja[i] + "\n");
        }
        return hasil;
    }
}
