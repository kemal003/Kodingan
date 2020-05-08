package UTP;
public class Main {
    public static void main(String[] args) {
        Buku a = new Buku("A", "Akhlak", 3, 2);
        Buku d = new Buku("D", "Dengan baik", 3, 1);
        Buku e = new Buku("E", "Edan", 3, 1);
        Buku f = new Buku("F", "Fatamorgana", 3, 1);
        Buku i = new Buku("I", "Idiolek", 2, 1);
        Buku j = new Buku("J", "Janji", 2, 1);
        Buku k = new Buku("K", "Kalau memang", 2, 1);
        Buku l = new Buku("L", "Lentera", 2, 1);
        Buku m = new Buku("M", "Matahari", 2, 1);
        Buku o = new Buku("O", "Omong kosong", 1, 2);
        
        Penulis pnlsA = new Penulis("Abdi", 19, "Hidup itu semua penting", 2); 
        Penulis pnlsB = new Penulis("Irza", 19, "Hidup itu semua baik", 2); 
        Penulis pnlsC = new Penulis("Saihan", 18, "Hidup itu semua perlu", 4); 
        Penulis pnlsD = new Penulis("Iwang", 20, "Hidup itu semua tidak adil", 2); 
        Penulis pnlsE = new Penulis("Aristo", 19, "Hidup itu semua menang", 1);
        
        a.setPenulis(0, pnlsA);
        a.setPenulis(1, pnlsB);
        d.setPenulis(0, pnlsC);
        e.setPenulis(0, pnlsC);
        f.setPenulis(0, pnlsC);
        i.setPenulis(0, pnlsD);
        j.setPenulis(0, pnlsE);
        k.setPenulis(0, pnlsA);
        l.setPenulis(0, pnlsB);
        m.setPenulis(0, pnlsB);
        o.setPenulis(0, pnlsC);
        o.setPenulis(1, pnlsD);
        
        pnlsA.setBuku(a, 0);
        pnlsA.setBuku(k, 1);
        pnlsB.setBuku(a, 0);
        pnlsB.setBuku(l, 1);
        pnlsC.setBuku(d, 0);
        pnlsC.setBuku(e, 1);
        pnlsC.setBuku(f, 2);
        pnlsC.setBuku(o, 3);
        pnlsD.setBuku(i, 0);
        pnlsD.setBuku(o, 1);
        pnlsE.setBuku(j, 0);
        
        User u1 = new User("Kemal", "U001", 3);
        User u2 = new User("Abdillah", "U002", 6);
        User u3 = new User("Azwar", "U003", 4);
        
        u1.setPinjam(a, 0);
        u1.setPinjam(f, 1);
        u1.setPinjam(k, 2);
        u1.cekBuku();
        u2.setPinjam(d, 0);
        u2.setPinjam(i, 1);
        u2.setPinjam(k, 2);
        u2.setPinjam(l, 3);
        u2.setPinjam(o, 4);
        u2.setPinjam(m, 5);
        u2.cekBuku();
        u3.setPinjam(d, 0);
        u3.setPinjam(e, 1);
        u3.setPinjam(f, 2);
        u3.setPinjam(k, 3);
        u3.cekBuku();
        
        System.out.println("Informasi buku yang ditulis oleh penulis A, B dan D");
        System.out.println("===================================================");
        pnlsA.tampilkanBuku();
        pnlsB.tampilkanBuku();
        pnlsD.tampilkanBuku();

        System.out.println("Informasi penulis buku A, D dan K");
        System.out.println("=================================");
        a.tampilkanPenulis();
        d.tampilkanPenulis();
        k.tampilkanPenulis();
        
        System.out.println("Tampilkan informasi peminjaman user");
        System.out.println("===================================");
        u1.tampilkanUser();
        u2.tampilkanUser();
        u3.tampilkanUser();
    }
}
