package Matematika;
public class Matematika {
    int hasil;
    void penjumlahan(int a, int b){
        hasil = a + b;
    }
    void pengurangan(int a, int b){
        hasil = a - b;
    }
    void perkalian(int a, int b){
        hasil = a * b;
    }
    void pembagian(int a, int b){
        hasil = a / b; 
    }
    int getHasil(){
        return hasil;
    }
}

