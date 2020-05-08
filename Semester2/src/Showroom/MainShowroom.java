package Showroom;

import java.util.ArrayList;

public class MainShowroom {
    public static void main(String[] args) {
        ArrayList<Mobil> beliMobil = new ArrayList<>();
        beliMobil.add(new Tesla("Model S 2020", "Hitam", true));
        beliMobil.add(new Porsche("Model 911 2020", "Merah", true));
        beliMobil.add(new Toyota("Alphard 2020", "Hitam", false));
        beliMobil.add(new Toyota("Yaris Sport 2020", "Hijau", false));
        beliMobil.add(new Porsche("Cayman 2020", "Biru", false));
        beliMobil.add(new Tesla("Model X 2020", "Hitam", false));

        System.out.println("===LIST BELI MOBIL===");
        for (Mobil mobil : beliMobil) {
            System.out.println(mobil);
        }
    }
}
