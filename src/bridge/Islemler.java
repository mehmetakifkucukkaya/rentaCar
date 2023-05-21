package bridge;

public class Islemler {

    private  KiralanacakAraba araba;
    public Islemler(KiralanacakAraba araba) {
        this.araba = araba;
    }


    public void kirala() {
        araba.arabaKirala();
    }

}
