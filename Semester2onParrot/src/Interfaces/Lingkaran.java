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
public class Lingkaran implements BidangDatar{
    //atribut
    private double diameter;
    //konstruktor
    public Lingkaran(double diameter){
        this.diameter=diameter;
    }
    //methods
    public double getKeliling(){
        return Math.PI*diameter;
    }
    public double getLuas(){
        return Math.PI*diameter*diameter/4;
    }
    public String info(){
        return String.format("%-20sDiameter: %-26.3fKel: %-10.3fLuas: %.3f\n",
                "Lingkaran",diameter,getKeliling(),getLuas());
    }
}
