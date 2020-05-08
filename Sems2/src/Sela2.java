import java.util.*;
public class Sela2 {
    String nama;
    String jabatan;
    double gaji;
    
    //CONSTRUCTOR
    Sela2(String nama, String jabatan, double gaji){
        this.nama=nama;
        this.jabatan=jabatan;
        this.gaji=gaji;
    }
    
    public String getNama(){
        return nama;
    }

    public String getJabatan(){
        return jabatan;
    }

    public double getGaji(){
        return gaji;
    }
    
    public double getGaji(int jamLembur){
        //ISI BEDA
        if (jabatan.equals("supervisor")){
            if(jamLembur>=6 && jamLembur<=10){
                return gaji+75000;
            } else if (jamLembur>10){
                return gaji+100000;
            }
        } else {
            if(jamLembur>=6 && jamLembur<=10){
                return gaji+25000;
            } else if (jamLembur>10){
                return gaji+50000;
            }            
        }
        return gaji;
    }
}

class Main{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String nama = inp.nextLine();
        String jabatan = inp.nextLine();
        double gaji = inp.nextDouble();
        int jam = inp.nextInt();
        Sela2 sela = new Sela2(nama, jabatan, gaji);
        System.out.println("Nama : "+sela.getNama());
        System.out.println("Jabatan : "+sela.getJabatan());
        System.out.println("Gaji : Rp. "+sela.getGaji());
        if(jam<6){
            System.out.println("Total Gaji : Rp. "+sela.getGaji());
        } else{
            System.out.println("Total Gaji : Rp. "+sela.getGaji(jam));
        }
            
    }
}
