public class Titik {
    double x;
    double y;
    
    //CONSTRUCTOR
    
    Titik(){
        x=0;
        y=0;
    }
    
    Titik(double x, double y){
        this.x=x;
        this.y=y;
    }
    
    public double getJarakXY(){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
    
}
