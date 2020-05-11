package Ojol;

public class Lokasi {
    private double xJemput;
    private double yJemput;
    private double xAntar;
    private double yAntar;

    public void setJemput(double xJemput, double yJemput){
        this.xJemput = xJemput;
        this.yJemput = yJemput;
    }

    public void setAntar(double xAntar, double yAntar){
        this.xAntar = xAntar;
        this.yAntar = yAntar;
    }

    public double getxJemput() {
        return xJemput;
    }

    public double getyJemput() {
        return yJemput;
    }

    public double getxAntar() {
        return xAntar;
    }

    public double getyAntar() {
        return yAntar;
    }

    public boolean isJemputMissing(){
        return xJemput == 0 && yJemput == 0;
    }

    public boolean isAntarMissing(){
        return xAntar == 0 && yAntar == 0;
    }

    public boolean isLokasiMemenuhi(){
        return !(isJemputMissing() && isAntarMissing());
    }

    public double getJarak() {
        return Math.abs(this.xAntar - this.xJemput) + Math.abs(this.yAntar - this.yJemput);
    }
}
