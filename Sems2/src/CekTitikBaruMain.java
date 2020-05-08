public class CekTitikBaruMain {
    public static void main(String[]args){
        for (int i = 0; i<15; i++)new CekTitikBaru();
        System.out.println("Jumlah objek titik yang telah dibuat: "+CekTitikBaru.getN());
        CekTitikBaru t1 =new CekTitikBaru(10);
        System.out.println("Jumlah objek titik yang telah dibuat: "+CekTitikBaru.getN());
        new CekTitikBaru();
        System.out.println("Jumlah objek titik yang telah dibuat: "+CekTitikBaru.getN());
    
    
    }
}
