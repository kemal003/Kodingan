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
public class PersegiPanjang implements BidangDatar{
     //atribut
    private double panjang;
    private double lebar;
    //konstruktor
    public PersegiPanjang(double panjang, double lebar){
        this.panjang=panjang; this.lebar=lebar;
    }
    //methods
    public double getKeliling(){
        return 2*(panjang+lebar);
    }
    public double getLuas(){
        return panjang*lebar;
    }
    public String info(){
        return String.format("%-20sPanjang: %-10.3fLebar: %-10.3fKel: %-10.3fLuas: %.3f\n",
                "Persegi Panjang",panjang,lebar,getKeliling(),getLuas());
    }
}
