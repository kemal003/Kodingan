public class PermutasiKombinasi {
    int[] loop = new int[20];
    int jumSequen=0;
    int pass=0;
    String kode="";
    int pjgKode=0;
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
   
void InitSequenPermutasi(){
    for(int i=0;i<jumSequen;i++){
    loop[i]=0;  
    }  
}
   
void InitSequenKombinasi(){
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
         
void UtamaLoop_dgnPengulangan(){
    SetParameter("ABCDEFG",4);
    InitSequenPermutasi();
    int i=1;
    while(prosesInProgess){
        Print((i++)+"). ");
        displayLoop();
        NextLoop_dgnPengulangan();
    }
}

void NextLoop_tanpaPengulangan(){
    NextLoop_dgnPengulangan();
    while ((prosesInProgess) && (IsPengulangan())){
        NextLoop_dgnPengulangan();  
    }
}
      
void UtamaLoop_tanpaPengulangan(){
    SetParameter("ABCDEF",5);
    InitSequenPermutasi();
    NextLoop_tanpaPengulangan();
    int i=1;
    while(prosesInProgess){  
        Print((i++)+"). ");
        displayLoop();
        NextLoop_tanpaPengulangan();
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
    SetParameter("ABCDE",3);
    InitSequenKombinasi();
    while(prosesInProgess){
        if (SyaratKombinasi()){  
        sequen = SusunSequen();
        Print((i++)+"). ");
        displayLoop();         
        }
    NextLoop_tanpaPengulangan();
    }
}
   
void Permutasi(){
    String sequen;
    int i=1;
    int total=0;
    SetParameter("ABC",2);
    Println("ABC");
    InitSequenKombinasi();
    while(prosesInProgess){
        sequen = SusunSequen();
        Print((i++)+"). ");
        displayLoop();         
        NextLoop_tanpaPengulangan();
    }
}
   
void PolaBerulang(String s, int jml){
//    SetParameter("ABC",5);
    SetParameter(s, jml);
    InitSequenPermutasi();
    int i=1;
    int total=0;
    String sequen;
    while(prosesInProgess){
        {  
        sequen = SusunSequen();
        Print((i++)+"). ");
        Println(sequen);
        total++;
        }
    NextLoop_dgnPengulangan();
    }
    Println("n(S) = "+total);       
}
   
void Utama(){Kombinasi();}

}