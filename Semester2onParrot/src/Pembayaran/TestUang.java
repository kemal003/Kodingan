package Pembayaran;

import Pembayaran.JenisBank.BCA;
import Pembayaran.JenisBank.BNI;
import Pembayaran.JenisBank.BRI;

import java.util.ArrayList;

public class TestUang {
    public static void main(String[] args) {
        ArrayList<Keuangan> list = new ArrayList<>();
        list.add(new BNI("Kemal Abdillah", "0553320011", 4_000_000, "03082022"));
        list.add(new BCA("Mahsun Isma'il", "0335519666", 20_000_000, "06122024"));
        list.add(new BRI("Siti Cholishoh","0666619733", 40_000_000, "28022021"));
        list.add(new Investasi("Saihan Nabawi", 2_000_000, 12, 0.04));
        list.add(new Investasi("Irza Pradana", 5_000_000, 24, 0.02));
        list.add(new Investasi("Nanda Pratama", 10_000_000, 2, 0.1));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            if (i!=list.size()-1) System.out.println();
        }
    }
}
