public class IkiNjajalNopal {
    int Stok;
    int harga;
    String nama;
    
    void setNama(String nama){
        this.nama=nama;
    }
    
    void setHarga(int harga){
        this.harga=harga;
    }
    
    void setStok(int stok){
        this.Stok=stok;
    }
    
    void kurangiStok(int jumlahMinta){
        if (cekOOS(jumlahMinta)) 
            System.out.println("Jumlah yang diminta out of stock");
        else {
            System.out.println("IKI TES");
            for (int i = 0; i < jumlahMinta; i++) {
                this.Stok -= jumlahMinta;
            }
            System.out.println("CHECKLIST!");
        }
    }
    
    boolean cekOOS(int jumlahMinta){
        return jumlahMinta > this.Stok;
    }
}
