package TugasProject;

import java.util.ArrayList;

public class Pesanan {
    private ArrayList<MakeUp> listbeli;

    public Pesanan() {
        listbeli = new ArrayList<>();
    }
    
    public void tambah(MakeUp makeup){
        listbeli.add(makeup);
    }

    public ArrayList<MakeUp> getListbeli() {
        return listbeli;
    }
}
