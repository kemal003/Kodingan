public class Lingkaran {
    double jari2;
    double luas;
    Titik pusat;
    
    //CONSTRUCTOR
    Lingkaran(){
        pusat = new Titik(0, 0);
    }
    
    Lingkaran(int x, int y){
        pusat = new Titik(x, y);
    }
    
    //METHOD
    
    public void setJari2(double jari2) {
        this.jari2 = jari2;
    }

    public void hitungLuas() {
        luas = Math.PI*jari2*jari2;
    }
}
