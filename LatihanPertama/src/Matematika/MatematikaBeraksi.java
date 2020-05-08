package Matematika;

public class MatematikaBeraksi {
    public static void main(String[]args){
       MatematikaCanggih MTK = new MatematikaCanggih();
       
       MTK.setmodulus(10, 3);
       System.out.println("Hasil modulus:" + MTK.hasilModulus());
      
       MTK.pembagian(10, 3);
        System.out.println("Hasil pembagian:" + MTK.getHasil());
       
       MTK.pengurangan(10, 3);
        System.out.println("Hasil pengurangan:" + MTK.getHasil());
        
       MTK.penjumlahan(10, 3);
         System.out.println("Hasil penjumlahan:" + MTK.getHasil());
         
       MTK.perkalian(10, 3);
        System.out.println("Hasil perkalian:" + MTK.getHasil());
    }
    
}
