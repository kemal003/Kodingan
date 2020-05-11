package Ojol;

import Ojol.JenisModa.Mobil;
import Ojol.JenisModa.Moda;
import Ojol.JenisModa.SepedaMotor;
import Ojol.JenisModa.Taxi;

import java.util.*;

public class Pemesanan extends Penumpang{
    private final ArrayList<Pengemudi> listPengemudi;
    private Penumpang penumpang;
    private boolean isSudahMemesan;
    private ArrayList<Pengemudi> pengemudiTerpilih;

    public Pemesanan() {
        listPengemudi = new ArrayList<>();
        listPengemudi.add(new SepedaMotor("Adi", 5.0, 7.0, "N_1234_XA"));
        listPengemudi.add(new SepedaMotor("Bibi", 6.0, 5.0, "N_2345_XA"));
        listPengemudi.add(new SepedaMotor("Dede", 5.5, 6.0, "N_4874_XZ"));
        listPengemudi.add(new Mobil("Caca", 17.5, 5.5, "N_111_XXX"));
        listPengemudi.add(new Mobil("Dodo", 20.0, 10.5, "N_3412_XXX"));
        listPengemudi.add(new Mobil("Fifi", 19.0, 9.5, "AG_8888_XXX"));
        listPengemudi.add(new Taxi("EKA", 9.0, 8.5, "L_5432_XXX"));
        listPengemudi.add(new Taxi("EKA", 1.0, 3.5, "N_5432_XXX"));
        listPengemudi.add(new Taxi("EKA", 7.0, 5.5, "AG_5432_XXX"));
    }

    public Pemesanan(Penumpang penumpang) {
        this.penumpang = penumpang;
        listPengemudi = new ArrayList<>();
        pengemudiTerpilih = new ArrayList<>();
        listPengemudi.add(new SepedaMotor("Adi", 5.0, 7.0, "N_1234_XA"));
        listPengemudi.add(new SepedaMotor("Bibi", 6.0, 5.0, "N_2345_XA"));
        listPengemudi.add(new SepedaMotor("Dede", 5.5, 6.0, "N_4874_XZ"));
        listPengemudi.add(new Mobil("Caca", 17.5, 5.5, "N_111_XXX"));
        listPengemudi.add(new Mobil("Dodo", 20.0, 10.5, "N_3412_XXX"));
        listPengemudi.add(new Mobil("Fifi", 19.0, 9.5, "AG_8888_XXX"));
        listPengemudi.add(new Taxi("EKA", 9.0, 8.5, "L_5432_XXX"));
        listPengemudi.add(new Taxi("EKA", 1.0, 3.5, "N_5432_XXX"));
        listPengemudi.add(new Taxi("EKA", 7.0, 5.5, "AG_5432_XXX"));
    }

    public ArrayList<Pengemudi> getPengemudiUrut(){
        for (int i = 0; i < pengemudiTerpilih.size(); i++) {
            double jarakJemput = Math.abs(pengemudiTerpilih.get(i).getxPengemudi()-penumpang.getLokasi().getxJemput())+
                    Math.abs(pengemudiTerpilih.get(i).getyPengemudi()-penumpang.getLokasi().getyJemput());
            pengemudiTerpilih.get(i).setJarakJemput(jarakJemput);
        }
        Collections.sort(pengemudiTerpilih);
        return pengemudiTerpilih;
    }

    public double getBayar(){
        if (penumpang.geteDompet().getSaldo()>=getOngkos()){
            return getOngkos();
        }
        else return Math.abs(penumpang.geteDompet().getSaldo()-getOngkos());
    }

    public double getSaldoAkhir(){
        penumpang.geteDompet().bayar(getOngkos());
        return penumpang.geteDompet().getSaldo();
    }

    public double getOngkos(){
        return Math.round(penumpang.getJarak()) * pengemudiTerpilih.get(0).getBiayaSatuan();
    }

    public Penumpang getPenumpang() {
        return penumpang;
    }

    public void setSudahMemesan(boolean sudahMemesan) {
        isSudahMemesan = sudahMemesan;
    }

    public boolean isPengemudiAda(Moda jenisModa){
        for (int i = 0; i < listPengemudi.size(); i++) {
            if (listPengemudi.get(i).getJenisModa() == jenisModa){
                pengemudiTerpilih.add(listPengemudi.get(i));
            }
        }
        for (int i = 0; i < listPengemudi.size(); i++) {
            if (listPengemudi.get(i).getJenisModa() == jenisModa){
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        String result = "";
        result+= String.format("NAMAPENUMPANG %s\n" +
                "SALDO_AWAL %.1f\n", penumpang.getNama(), penumpang.geteDompet().getSaldo());
        if (!isSudahMemesan) {
            result+="BELUM MEMESAN\n";
            return result;
        }
        else {
            result+=String.format("PENGEMUDI %s\n", getPengemudiUrut().get(0).getNama());
            result+=String.format("KENDARAAN %s %s\n", getPengemudiUrut().get(0).getJenisModa(),
                    getPengemudiUrut().get(0).getNoPol());
            result+=String.format("JARAK_TUJUAN %.1f\n", penumpang.getLokasi().getJarak());
            result+=String.format("JARAK_PENGEMUDI %.1f\n", getPengemudiUrut().get(0).getJarakJemput());
            result+=String.format("JARAK_PENGEMUDI LAINNYA ");
            for (int i = 1; i < getPengemudiUrut().size(); i++) {
                result+=getPengemudiUrut().get(i).getJarakJemput() + " ";
            }
            result+=String.format("\nBIAYA %.1f\n", getOngkos());
            result+=String.format("SALDO_AKHIR %.1f", getSaldoAkhir());
            return result;
        }
    }
}
