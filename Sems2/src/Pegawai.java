class Pegawai {
    String nama;
    String jabatan;
    double gaji;
        
    Pegawai(String nama, String jabatan, double gaji){
        this.nama=nama;
        this.jabatan=jabatan;
        this.gaji=gaji;
    }
    
    public double getGaji() {return gaji;}

    public double getGaji(int jamLembur) {
        if (jabatan.equalsIgnoreCase("supervisor")){
            if (jamLembur>=6 && jamLembur<=10) return gaji+75000;
            else if (jamLembur>10) return gaji+100000;
            else return gaji;
        }
        else {
            if (jamLembur>=6 && jamLembur<=10) return gaji+25000;
            else if (jamLembur>10) return gaji+50000;
            else return gaji;
        }
    }
    
    public String getNama() {return nama;}

    public String getJabatan() {return jabatan;}   
}