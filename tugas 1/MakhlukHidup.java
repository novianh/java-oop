public class MakhlukHidup {
    String Nama, alatGerak, alatNapas, alatPencernaan;
    int jumlahSel;
    public MakhlukHidup() {

    }
}

public class monera extends MakhlukHidup {
    private String makanan;
    public String makan() {
        makanan = "autotrof dan heterotrof";
    System.out.println("monera: "+makanan);
    return 0;
    }
    public monera() {

    }
}

public class protista extends MakhlukHidup {
    private String makanan;

    public String makan() {
        makanan = "autotrof dan fagositosis";
        System.out.println("protista: "+makan);

        
    }
    public protista() {

            
        }
}
public class fungi extends MakhlukHidup {
    private String makanan;

    public String makan() {
        makanan = "heterotrof";
        System.out.println("fungi: "+makan);

        
    }
    public fungi() {

            
        }
}
public class plantae extends MakhlukHidup {
    private String makanan;

    public String makan() {
        makanan = "autotrof";
        System.out.println("plantae: "+makan);

        
    }
    public plantae() {

            
        }
}
public class mamalia extends MakhlukHidup {
    private String makanan;

    public String makan() {
        makanan = "heterotrof";
        System.out.println("mamalia: "+makan);

        
    }
    public mamalia() {

            
        }
}

public class makhluk {
    public makhluk() {

    }
    public static void main(String[]args) {
        String data1, data2, data3, data4, data5;
        protista mhprotista = new protista();
        monera mhmonera = new monera();
        fungi mhfungi = new fungi();
        plantae mhplantae = new plantae();
        mamalia mhmamalia = new mamalia();

        System.out.println("Kelas MH");
        System.out.println("oleh Novia Nur Hamidah");
        System.out.println("2A/203307071");
        System.out.println("=======================================");
        System.out.println("");
        data1=mhprotista.makan();
        data2=mhmonera.makan();
        data3=mhfungi.makan();
        data4=mhplantae.makan();
        data5=mhmamalia.makan();

    }
}