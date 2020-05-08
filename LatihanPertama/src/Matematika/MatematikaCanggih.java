package Matematika;
public class MatematikaCanggih extends Matematika {
    
    private int modulus;
    void setmodulus(int a, int b){
        modulus = a%b;
    }
    int hasilModulus(){
        return modulus;
    }     
}
