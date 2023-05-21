package bridge;

public class PickupAraba implements KiralanacakAraba{

    private String plaka;
    private  String model;
    private String yil;

    public PickupAraba(String plaka) {
        this.plaka = plaka;
    }

    @Override
    public void arabaKirala() {
        System.out.println(plaka + " plakalı pick-up araba kiralandı");
    }

}
