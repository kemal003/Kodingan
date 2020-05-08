import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class TugasMatkomFixed {
    static Set<String> hasilHuruf=new HashSet<>();
    // GENERATE KOMBINASI
    static void cari(String sumber, int sisaPanjang, int offset, String hasil, String sequence) {
        // PENGECEKAN APAKAH 
        if(sisaPanjang==0){
            int indexUrutan=0;
            for(int i=0;i<hasil.length();i++){
                if(indexUrutan<sequence.length()) {
                    if(hasil.charAt(i)==sequence.charAt(indexUrutan)) {
                        indexUrutan++;
                    }
                }
            }
            if(indexUrutan==sequence.length()) 
            {
                int jumlahHasilAwal=hasilHuruf.size();
                hasilHuruf.add(hasil);
                int jumlahHasilAkhir=hasilHuruf.size();
                if(jumlahHasilAwal!=jumlahHasilAkhir) System.out.println(hasil);
            }
            return;
        }
        // GENERATE KOMBINASI
        for(int i=offset;i<sumber.length()-sisaPanjang+1;i++){
            cari(sumber, sisaPanjang-1, i+1, hasil+sumber.charAt(i), sequence);
        }
    }
    
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        // DEKLARASI VARIABEL DAN INPUT
        System.out.print("Masukkan input string: ");String inString=inp.nextLine();
        System.out.print("Masukkan jumlah karakter output: ");int jumlahOutput=inp.nextInt();
        inp.nextLine();
        System.out.print("Masukkan sequence yang dicari: ");String sequence=inp.nextLine();
        System.out.println("");
        // CARI SUBSTRING YANG MEMILIKI SEQUENCE SAMA
        cari(inString, jumlahOutput, 0, "", sequence);
        // OUTPUT
        // JIKA KOSONG
        if(hasilHuruf.isEmpty()) System.out.println("Tidak Ada");
        else System.out.println("\nJumlah: "+hasilHuruf.size());
    }
}