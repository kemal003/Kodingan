public class CekTitikBaru {
    private double x;
    private double y;
    private static int n;
    
    CekTitikBaru(){n++;}
    CekTitikBaru (double t){
        x=y=t; n++;
    }
    CekTitikBaru (double x,double y){
        this.x = x;
        this.y = y;
        this.n = n;
    }   
    
    public static int getN(){return n;}
    public double getX(){return x;}
    public void setX(double x){this.x = x;}
    public double getY(){return y;}
    public void setY(double y){this.y = y;}

    
    
    
}
