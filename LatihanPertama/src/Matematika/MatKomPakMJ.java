package Matematika;
class KelasSet1{
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

public class MatKomPakMJ {
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

   void Print(String b){
     System.out.print(b);
   }

   void Print(int b){
     System.out.print(b);
   }

   void Println(int b){
     System.out.println(b);
   }
   
   void Enter(){
     System.out.println("");       
   }
   
   void Println(String b){
     System.out.println(b);
   }
   
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
       if (SyaratKombinasi())
       {  
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
     SetParameter("ABCDEFG",5);
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
     //Template Permutasi
     // Hitung 5!/(2!2!1!)=120/4 = 30  
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
         if (set.IsAdded(sequen))
         {
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
   
   void Soal10(){
     KelasSet set = new KelasSet();
     set.Clear();
     String sequen;
     int i=1;
     int total=0;
     SetParameter("ABCDEFG",7);
     //SetParameter("AAABBC",4);         
     InitSequenPermutasiKombinasi();
     while(prosesInProgess){
       {  
         sequen = SusunSequen();
         if (set.IsAdded(sequen))
         {
           total++;
           boolean sy1=jumKode(sequen,"A")==2;
           boolean sy2=jumKode(sequen,"B")==1;
           boolean sy3=jumKode(sequen,"C")==1;
           if (sy1 && sy2 && sy3)
           {    
             Println((i++)+"). "+sequen);
           }
         }
       }
       NextLoop_tanpaPengulangan();
     }
     Println("n(S) = "+total);
   }
   
   void Utama(){
     //Kombinasi(); 
     //Permutasi();
     //PolaBerulang();
     //PolaBerulangJumJenisTertentu();
     //SusunanBeberapaKodeSama();
     Soal10();  
   }
}