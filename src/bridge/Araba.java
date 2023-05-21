package bridge;

import java.sql.SQLOutput;

public class Araba implements KiralanacakAraba{

    private String plaka;
    private  String model;
    private String yil;

    public Araba(String plaka) {
        this.plaka = plaka;
    }

    @Override
    public void arabaKirala() {
        System.out.println(plaka + " plakalı araba kiralandı");
    }

}
