import java.util.*;

public class NopalNjajal {
    public static void main(String[]args){
        int x = 0;
        Scanner inp = new Scanner(System.in);
        String[] namaBarang = {"Polpen", "Pensil", "Setip"};
        int[] hargaBarang = {10000, 5000, 7000};
        int[] stokBarang = {10, 100, 200};
        
        IkiNjajalNopal jjl = new IkiNjajalNopal();
        //Input User
        for (int i = 0; i < 3; i++) {
            System.out.print("Silahkan masukkan barang ke-"+(i+1)+": "); 
            String mintaBarang = inp.nextLine();
            System.out.print("Masukkan jumlah permintaan barang "+ mintaBarang +": ");
            int jmlMinta = inp.nextInt();
            inp.nextLine();
        
            for (int j = 0; j < namaBarang.length; j++) {
                if (mintaBarang.equals(namaBarang[i])){
                    x += 1;
                    jjl.setNama(mintaBarang);
                    jjl.setStok(stokBarang[i]);
//                    System.out.println("IKI TEST");
                    if (jjl.cekOOS(jmlMinta)){
                        jjl.setHarga(hargaBarang[i]);
                        jjl.kurangiStok(jmlMinta);
                    }
                }
            }
            if (i==0) System.out.println("MAAF BARANG TIDAK TERSEDIA");
        }
    }
}
