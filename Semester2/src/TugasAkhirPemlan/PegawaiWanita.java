package TugasAkhirPemlan;

public class PegawaiWanita extends PenerimaanPegawaiKeefci implements Jabatan {

    private final String[] bonuskerja = {"Tas keefci", "Sepatu keefci", "Pulpen keefci"
    };

    public PegawaiWanita(String namacalonpegawai, boolean jeniskelamin, int umurpegawai) {
        super(namacalonpegawai, jeniskelamin, umurpegawai);
    }

    public double getGajiPegawai(){
        return super.getGajiPegawai();
    }

    public String[] getBonuskerja() {
        return bonuskerja;
    }

    @Override
    public String jabatanPegawai() {
        return "Kasir";
    }

    @Override
    public void cetakBonus() {
        for (int i = 0; i < bonuskerja.length; i++) {
            System.out.println("- " + bonuskerja[i]);
        }
    }
}
