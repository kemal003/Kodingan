import javax.swing.*;

public class Suwung
{

    public static void main (String [] args)
    {

        String pilihS = JOptionPane.showInputDialog(" Pilih Menu  :  \n\n 1. Hitung Luas Segitiga \n \n 2. Hitung Luas Lingkaran ");
        int pilih = Integer.parseInt (pilihS);
        int a,t;
        double l;
        String aS,tS,rS;
        double phi = 3.14;        
        double r, luas;  
        

        switch ( pilih)
        {
        case 1 : JOptionPane.showMessageDialog( null,"Hitung Luas Segitiga ");
                    
                    aS =  JOptionPane.showInputDialog(" Masukan Nilai Alas : ");
                    a = Integer.parseInt(aS );

                    tS =  JOptionPane.showInputDialog(" Masukan Nilai Tinggi : ");
                    t = Integer.parseInt(tS );

                    l= (double)((a*t )/2);

                JOptionPane.showMessageDialog(null," Luas Segitiga : "+l);//+"Luas Segitiga",JOptionPane.PLAIN_MESSAGE);
                

        break;
        case 2 : JOptionPane.showMessageDialog( null,"Hitung Luas Lingkaran ");


            rS= JOptionPane.showInputDialog("Masukkan Panjang Jari-jari : "); 
            r = Double.parseDouble(rS );
            
            luas = 0.5 * phi * r * r;         

            JOptionPane.showMessageDialog(null," Luas Lingkaran : "+luas);//+"Luas Lingkaran", JOptionPane.PLAIN_MESSAGE);


        break;
        
        }
        

    }

}