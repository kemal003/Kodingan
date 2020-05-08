/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MobilKosa;

public class DetailMobil implements Mobil{
    private String nama;
    private String model;
    private String warna;
    private String jenis;

    public DetailMobil(String nama, String model, String warna, String jenis) {
        this.nama = nama;
        this.model = model;
        this.warna = warna;
        this.jenis = jenis;
    }
    public void info(){
        spek();
        servis();
        fitur();
        bonus();
    }

    @Override
    public void spek() {
        System.out.println("Nama : "+nama+" "+model);
        System.out.println("Warna: "+warna);
    }
    
    @Override
    public void servis() {
        int servis = 0;
        if(this.jenis.equalsIgnoreCase("electric")){
            if(this.nama.equalsIgnoreCase("Tesla")){servis=1;}
            else if(this.nama.equalsIgnoreCase("Porsche")){servis=2;}
            else if(nama.equalsIgnoreCase("Toyota")){servis=5;}
        }else if(jenis.equalsIgnoreCase("non electric")){
            if(nama.equalsIgnoreCase("Tesla")){servis=3;}
            else if(nama.equalsIgnoreCase("Porsche")){servis=3;}
            else if(nama.equalsIgnoreCase("Toyota")){servis=5;}
        }else{ System.out.println("Tidak ada mobil dengan jenis "+jenis+"ini.");}
        System.out.println("Perawatan: Setiap "+servis+" tahun sekali");
    }
    

    @Override
    public void fitur() {
        boolean selfdriving = true;
        boolean selfparking = true;
        if(this.nama.equalsIgnoreCase("Tesla")){selfdriving=selfparking= true;}
            else if(this.nama.equalsIgnoreCase("Porsche")){selfparking=false;}
            else if(this.nama.equalsIgnoreCase("Toyota")){selfdriving=selfparking=false;}
            else System.out.println("Mobil "+nama+" "+model+" tidak dijualn disini.");
        System.out.println("Smart Car Features: ");
        System.out.println("\tSelf Driving: "+selfdriving);
        System.out.println("\tSelf Parking: "+selfparking); 
    }

    
    @Override
    public void bonus(){
        String produk = null;
        int banyakbonus=0;
        if(this.nama.equalsIgnoreCase("Tesla")){
            produk = "Tesla Panel Model";
            if (this.model.equalsIgnoreCase("Model S 2020")) banyakbonus = 3;
            else if (this.model.equalsIgnoreCase("Model X 2020")) banyakbonus = 5;
            else System.out.println("Tidak ada bonus");
        }
        if(this.nama.equalsIgnoreCase("Porsche")){
            produk = "Jam Tangan Rolex";
            if (this.model.equalsIgnoreCase("Model 911 2020")) banyakbonus = 2;
            else if (this.model.equalsIgnoreCase("Cayman 2020")) banyakbonus = 1;
            else System.out.println("Tidak ada bonus");
        }
        if(this.nama.equalsIgnoreCase("Toyota")){
            produk = "Voucher";
            if (this.model.equalsIgnoreCase("Alphard 2020")) banyakbonus = 6;
            else if (this.model.equalsIgnoreCase("Yaris Sport 2020")) banyakbonus = 3;
            else System.out.println("Tidak ada bonus");
        }

        System.out.println("Bonus yang didapatkan yaitu: ");
        for (int i = 0; i < banyakbonus; i++) {
            int bns = (int) (Math.random()* (max-min+1)+min);
            if (this.nama.equalsIgnoreCase("Toyota")){
                switch (bns) {
                    case 1:
                        System.out.println((i + 1) + ": " + produk + " Sushi Tei 50%");
                        break;
                    case 2:
                        System.out.println((i + 1) + ". " + produk + " Yoshinoya 50%");
                        break;
                    case 3:
                        System.out.println((i + 1) + ". " + produk + " Starbucks 50%");
                        break;
                    case 4:
                        System.out.println((i + 1) + ". " + produk + " Chatime 50%");
                        break;
                    case 5:
                        System.out.println((i + 1) + ". " + produk + " Ace Hadware 50%");
                        break;
                    case 6:
                        System.out.println((i + 1) + ". " + produk + " KFC 50%");
                        break;
                    case 7:
                        System.out.println((i + 1) + ". " + produk + " Domino Pizza 50%");
                        break;
                    case 8:
                        System.out.println((i + 1) + ". " + produk + " Gucci 50%");
                        break;
                    case 9:
                        System.out.println((i + 1) + ". " + produk + " Hermes 50%");
                        break;
                    case 10:
                        System.out.println((i + 1) + ". " + "Luis Vuitton 50%" + produk);
                        break;
                }
            }
            else System.out.println((i+1)+". "+produk+" "+bns);
        }
    }
}

