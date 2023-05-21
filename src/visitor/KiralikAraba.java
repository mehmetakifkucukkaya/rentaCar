package visitor;

public class KiralikAraba implements Arabaa {

    private String marka;
    public KiralikAraba(String marka) {
        this.marka = marka;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public void ziyaretciKabul(ArabaVisitor ziyaretci) {
        ziyaretci.ziyaretEt(this);
    }
}
