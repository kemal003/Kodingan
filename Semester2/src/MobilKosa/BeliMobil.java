/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MobilKosa;

/**
 *
 * @author asus
 */
public class BeliMobil{
    public static void main(String[] args) {
        DetailMobil[] listMobil = new DetailMobil[6];
        listMobil[0] = new Tesla("Tesla","Model S 2020","Hitam","electric");
        listMobil[1] = new Porsche("Porsche","Model 911 2020","Biru dongker","electric");
        listMobil[2] = new Toyota("Toyota","Alphard 2020","Gold","non electric");
        listMobil[3] = new Toyota("Toyota","Yaris Sport 2020","Kuning","non electric");
        listMobil[4] = new Porsche("Porsche","Cayman 2020","Hitam","non electric");
        listMobil[5] = new Tesla("Tesla","Model X 2020","Putih","non electric");
        
        System.out.println("       DAFTAR PEMBELIAN MOBIL      ");
        System.out.println("      SHOWROOM MOBIL FUTURECAR     ");
        for (int i = 0; i < listMobil.length; i++) {
            System.out.println("-----------------"+(i+1)+"-----------------");
            listMobil[i].info();
            System.out.println("----------------O0O----------------");
            System.out.println();
        }
    }
}
