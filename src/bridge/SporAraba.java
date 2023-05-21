package bridge;

public class SporAraba implements KiralanacakAraba{

    private String plaka;
    private  String model;
    private String yil;

    public SporAraba(String plaka) {
        this.plaka = plaka;
    }

    @Override
    public void arabaKirala() {
        System.out.println(plaka + " plakalı spor araba kiralandı");
    }

}
