/*TUGAS MATEMATIKA KOMPUTASI
PERMUTASI KOMBINASI DAN REKURSIF

Anggota Kelompok :
1. Andika Irza Pradana (195150201111009)
2. Aristo Renaldo Ruslim (195150200111002)
3. Muhammad Azwar Kemal Abdillah (195150207111007)

##CLASS PERMUTASI KOMBINASI*/
package Matematika;
import java.util.Scanner;
class KelasSet2{
    String H="";  
    void Clear(){
        H="";  
    }
    
    boolean IsAdded(String kode){
        boolean tdkAda=false;
        if (!H.contains(","+kode+",")){
            tdkAda=true;
            H=H+","+kode+",";
        }
    return (tdkAda);
    }             
}

public class VersiAristo {
    private int[] loop = new int[20];
    private int jumSequen=0;
    private int pass=0;
    private String kode="";
    private int pjgKode=0;
    public  boolean prosesInProgess=true;
    public String Sort(String s){
        String h="";
        while (s.length()>0){
            char cMin = s.charAt(0);
            for(int i=1;i<s.length();i++){
                if (cMin>s.charAt(i)){
                    cMin = s.charAt(i); 
                }  
            }
            s=s.replace(""+cMin,"");
            h+=""+cMin;
        }
        return h;
    }

    void Print(String b){System.out.print(b);}

    void Print(int b){System.out.print(b);}

    void Println(int b){System.out.println(b);}
   
    void Enter(){System.out.println("");}
   
    void Println(String b){System.out.println(b);}
   
    String Format(double d,int n){
        String s=String.format("%f", d);
        for(int i=0;i<n;i++){
            s=s+"0";  
        }
        int p=s.indexOf(".");
        if (p<0){p=s.indexOf(",");}
        s=s.substring(0,p+(n+1));
        return(s);
    }

    String VariasiKode(String s){
        String H="";
        int p=s.length();
        for(int i=0;i<p;i++){
            if (!H.contains(""+s.charAt(i))){
                H=H+s.charAt(i);  
            }  
        }
        return (Sort(H));
    }
    
    void SetParameter(String kd,int sqn){
        kode=kd;    
        pjgKode=kode.length();
        jumSequen=sqn;
        pass=jumSequen-1;
    }

    void SetParameter(int sequenlength,int sqn){
        kode="";
        for(int i=0;i<sequenlength;i++){
            kode=kode+(char)(65+i);  
        }
        pjgKode=kode.length();
        jumSequen=sqn;
        pass=jumSequen-1;
    }
   
    void InitSequenPerulangan(){
        for(int i=0;i<jumSequen;i++){
            loop[i]=0;  
        }  
    }
   
    void InitSequenPermutasiKombinasi(){
        for(int i=0;i<jumSequen;i++){
            loop[i]=i;  
        }  
        prosesInProgess=true;
    }
   
    void displayLoop(){
        if (prosesInProgess){
            for(int i=0;i<jumSequen;i++){
                Print(""+kode.charAt(loop[i])+"  ");  
            }         
            Println("");
        }
    }

    void displayIndexLoop(){
        if (prosesInProgess){
            for(int i=0;i<jumSequen;i++){
                Print(loop[i]+"  ");  
            }         
        Println("");
        }       
    }
   
   String SusunSequen(){
        String s="";
        for(int i=0;i<jumSequen;i++){
            s+=kode.charAt(loop[i]);  
        }
        return(s);
    }
   
    boolean IsPengulangan(){
        String HKode="";
        int jenisKode=0;
        for(int i=0;i<jumSequen;i++){
            if (!HKode.contains(","+loop[i]+",")){  
                HKode=HKode+","+loop[i]+",";
                jenisKode++;
            }
        }         
        return(jenisKode<jumSequen);
    }
     
    void NextLoop_dgnPengulangan(){
        int batasAtas=kode.length();
        if (loop[0]<batasAtas){
            loop[pass]++;
            boolean inLoop=false;
            while ((pass>0) && (loop[pass]>=batasAtas)){
                pass--;
                loop[pass]++;   
                inLoop=true;
            }
            if (inLoop){
                for(int i=pass+1;i<jumSequen;i++){
                loop[i]=0; 
                }
            pass=jumSequen-1;
            }
        }
        prosesInProgess=false;    
        if (loop[0]<batasAtas){
            prosesInProgess=true;  
        }
    }
         
    void NextLoop_tanpaPengulangan(){
        NextLoop_dgnPengulangan();
        while ((prosesInProgess) && (IsPengulangan())){
            NextLoop_dgnPengulangan();  
        }
    }
      
    String varKode;
   
    boolean SyaratKombinasiPlus(){
        boolean retval=true;
        for(int i=0;i<jumSequen-1;i++){
            retval = retval && (loop[i]<=loop[i+1]);  
        }
        return(retval);
    }

    boolean SyaratKombinasi(){
        boolean retval=true;
        int jarakMax=45;
        for(int i=0;i<jumSequen-1;i++){
            retval = retval && ((loop[i]<loop[i+1]) && ((loop[i+1]-loop[i])<jarakMax));  
        }
        return(retval);
    }
   
    void Kombinasi(){
        String sequen;
        int i=1;
        int total=0;
        SetParameter("ABCD",3);
        InitSequenPermutasiKombinasi();
        while(prosesInProgess){
            if (SyaratKombinasi()){  
                sequen = SusunSequen();
                Println((i++)+"). "+sequen);
            }
            NextLoop_tanpaPengulangan();
        }
    }

    void Permutasi(){
        String sequen;
        int i=1;
        int total=0;
        SetParameter("ABCD",4);
        InitSequenPermutasiKombinasi();
        while(prosesInProgess){
            sequen = SusunSequen();
            Println((i++)+"). "+sequen);
            NextLoop_tanpaPengulangan();
        }
    }
   
    void PolaBerulang(){
        SetParameter("ABC",4);
        InitSequenPerulangan();
        int i=1;
        int total=0;
        String sequen;     
        while(prosesInProgess){
            {  
            sequen = SusunSequen();
            Println((i++)+"). "+sequen);
            total++;
            }
            NextLoop_dgnPengulangan();
        }
        Println("n(S) = "+total);       
    }

    void PolaBerulangJumJenisTertentu(){
        SetParameter("ABC",4);
        InitSequenPerulangan();
        int i=1;
        int total=0;
        String sequen;     
        int jumJenis=1;
        while(prosesInProgess){
            {  
            sequen = SusunSequen();
            varKode=VariasiKode(sequen);
            if (varKode.length()==jumJenis){
                Println((i++)+"). "+sequen+"  variasi : "+varKode);
                total++;
            }
            }
            NextLoop_dgnPengulangan();
        }
        Println("n(S) = "+total);
    }
   
    void SusunanBeberapaKodeSama(){
        KelasSet set = new KelasSet();
        set.Clear();
        String sequen;
        int i=1;
        int total=0;
        SetParameter("AABBC",5);
        InitSequenPermutasiKombinasi();
        while(prosesInProgess){
            {  
            sequen = SusunSequen();
            if (set.IsAdded(sequen)){
                Println((i++)+"). "+sequen);
            }
            }
            NextLoop_tanpaPengulangan();
        }
    }
   
    int jumKode(String sequen,String kode){
        int jum=0;
        for(int i=0;i<sequen.length();i++){
            if (kode.equals(""+sequen.charAt(i))){
                jum++;  
            }  
        }
        return(jum);
    }
  
    void kerjasoal18(String x,int n, String a, String z){
        SetParameter(x,n);
        InitSequenPerulangan();
        int i=1;
        int total=0;
        String sequen;     
        while(prosesInProgess){
            {  
            sequen = SusunSequen();
            Println((i++)+") "+a+sequen+z);
            total++;
            }
            NextLoop_dgnPengulangan();
        }
        Println("n(S) = "+total);       
    }
   
    void Soal18(){
        Scanner in=new Scanner(System.in);
        String a = null,z = null,x = null;
        int n = 0;
        System.out.println("Susunlah pola 5 elemen DNA dengan syarat:\na) diakhiri dengan A\nb) diawali dengan A diakhiri dengan G\nc) hanya mengandung A dan T\nd) tidak mengandung C");
        System.out.print("Pilih soal : "); char pilih =in.next().charAt(0);
        switch(pilih){
            default: System.out.println("tidak ada"); break;
            case 'a':x="AGTC"; a=""; z="A"; n=4; break;
            case 'b':x="AGTC"; a="T"; z="G"; n=3; break;
            case 'c':x="AT"; a=""; z=""; n=5; break;
            case 'd':x="AGT"; a=""; z=""; n=5; break;
        }
        if(n!=0)kerjasoal18(x,n,a,z);   
    }
    void Utama(){Soal18();}
}
