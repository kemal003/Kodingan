package PegawaiNopal;

public class DaftarGaji {
    private static int apakahPenuh=0;
    private Pegawai[] listPegawai;

    public DaftarGaji(int jumlahPegawai) {
        listPegawai = new Pegawai[jumlahPegawai];
    }

    public void addPegawai(Pegawai pegawaiBaru){
        for (int i = 0; i < listPegawai.length; i++) {
            if (listPegawai[i] == null){
                listPegawai[i] = pegawaiBaru;
                System.out.printf("Pegawai %s berhasil ditambahkan pada indeks ke-%d\n", pegawaiBaru.getNama(), i);
                apakahPenuh++;
                break;
            }
            if (apakahPenuh == listPegawai.length) {
                System.out.printf("Pegawai %s gagal ditambahkan - Daftar Gaji penuh\n", pegawaiBaru.getNama());
                break;
            }
        }
    }

    public void printSemuaGaji(){
        System.out.println("Print Semua Gaji");
        for (int i = 0; i < listPegawai.length; i++) {
            System.out.print(listPegawai[i]);
            if (i!=listPegawai.length-1) System.out.println();
        }
    }
}
