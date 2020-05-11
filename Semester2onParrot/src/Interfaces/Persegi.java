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
public class Persegi implements BidangDatar{
    //atribut
    private double sisi;
    //konstruktor
    public Persegi(double sisi){
       this.sisi=sisi;
    }
    //methods
    public double getKeliling(){
        return 4*sisi;
    }
    public double getLuas(){
        return sisi*sisi;
    }
    public String info(){
        return String.format("%-20sSisi: %-30.3fKel: %-10.3fLuas: %.3f\n",
                "Persegi",sisi,getKeliling(),getLuas());
    }
}
