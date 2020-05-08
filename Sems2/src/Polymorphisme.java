/*
Menurut saya, saya sendiri masih terlalu "dapat" mengenai
fungsi dan konsep Polymorphisme, seperti penggunaannya nanti
bagaimana dan kapan digunakan. Butuh penyesuaian dan latihan
lagi agar bisa tau betul fungsi Polymorphisme ini.
*/

import java.util.*;
class Manusia{
    public void info(){
        System.out.println("Ini adalah manusia biasa");
    }
}

class WNI extends Manusia {
    @Override
    public void info(){
        System.out.println("WNI itu manusia");
    }
}

class WNA extends Manusia{
    @Override
    public void info(){
        System.out.println("Tapi WNA juga manusia");
    }
}

class Mahasiswa extends WNI {
    @Override
    public void info(){
        System.out.println("WNI bisa jadi mahasiswa");
    }
}

class MahasiswaUB extends Mahasiswa {
    @Override
    public void info(){
        System.out.println("Tapi ini Mahasiswa UB");
    }
}
public class Polymorphisme {
    public static void main(String[] args) {
        ArrayList<Manusia> iniTes = new ArrayList<>();
        iniTes.add(new Manusia());
        iniTes.add(new WNI());
        iniTes.add(new WNA());
        iniTes.add(new Mahasiswa());
        iniTes.add(new MahasiswaUB());
        
        for (int i = 0; i < iniTes.size(); i++) {
            iniTes.get(i).info();
        }
    }
}
