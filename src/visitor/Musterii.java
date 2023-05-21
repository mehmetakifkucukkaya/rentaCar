package visitor;

public class Musterii {
    private String ad;

    public Musterii(String ad) {
        this.ad = ad;
    }

    public String getAd() {
        return ad;
    }

    public void raporOlustur(ArabaVisitor ziyaretci, KiralikAraba araba) {
        araba.ziyaretciKabul(ziyaretci);
    }
}
