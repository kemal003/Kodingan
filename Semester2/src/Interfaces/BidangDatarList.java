/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author User
 */
public class BidangDatarList {
    //atribut
    private BidangDatar bd[];
    //Konstruktor
    public BidangDatarList(int jumlahElemen){
         bd = new BidangDatar[jumlahElemen];
    }
    //methods
    public boolean setBidangDatar(BidangDatar data){
        int i=0;
        while(i<bd.length && bd[i]!=null) i++;
        if(i<bd.length) { bd[i]=data; return true; }
        else return false;
    }
    //contoh penerapan konsep polimorfisme sederhana
    public String info(){
        String s = "DAFTAR BIDANG DATAR:\n";
        int i=0;
        double totKel=0, totLuas=0;
        while(i<bd.length && bd[i]!=null) {
            s=String.format("%s%2d. %s",s,i+1,bd[i].info());
            totKel+=bd[i].getKeliling();
            totLuas+=bd[i].getLuas();
            i++;
        }
        s=String.format("%sTotal Keliling = %.3f\nTotal Luas     = %.3f\n",
                s,totKel,totLuas);
        return s;
    }
}
