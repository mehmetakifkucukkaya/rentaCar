package bridge;

public class SuvAraba implements  KiralanacakAraba{

    private String plaka;
    private  String model;
    private String yil;

    public SuvAraba(String plaka) {
        this.plaka = plaka;
    }

    @Override
    public void arabaKirala() {
        System.out.println(plaka + " plakalı SUV araba kiralandı");
    }

}
