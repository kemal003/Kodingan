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
public class InterfaceTest {
    public static void main(String[] args){
        BidangDatarList bdl = new BidangDatarList(20);
        bdl.setBidangDatar(new Lingkaran(50));
        bdl.setBidangDatar(new Persegi(50));
        bdl.setBidangDatar(new PersegiPanjang(50,30));
        bdl.setBidangDatar(new Persegi(150));
        bdl.setBidangDatar(new PersegiPanjang(120,50));
        bdl.setBidangDatar(new Lingkaran(150));
        bdl.setBidangDatar(new Persegi(75));
        System.out.println(bdl.info());
    }
}
