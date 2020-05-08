package Nota;

import java.util.ArrayList;

public class Stok implements Sirkulasi{
    ArrayList<Barang> barangs = new ArrayList<>();

    public void tambahBarang(Barang barang){
        barangs.add(barang);
    }

    public String getSirkulasi(){
        String result = "";

        for (int i = 0; i < barangs.size(); i++) {
            result += barangs.get(i);
        }
        return result;
    }
}
