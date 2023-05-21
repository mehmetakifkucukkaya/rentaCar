package builder;

public class Araba {

    private String arabaMarka;

    private String arabaModel;
    private int arabaYil;
    private double fiyat;
    public String getArabaMarka() {
        return arabaMarka;
    }

    public void setArabaMarka(String arabaMarka) {
        this.arabaMarka = arabaMarka;
    }

    public String getArabaModel() {
        return arabaModel;
    }

    public void setArabaModel(String arabaModel) {
        this.arabaModel = arabaModel;
    }

    public int getArabaYil() {
        return arabaYil;
    }

    public void setArabaYil(int arabaYil) {
        this.arabaYil = arabaYil;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }



    // Araba sınıfının constructorı
    public Araba(String arabaMarka, String arabaModel, int arabaYil, double fiyat) {
        this.arabaMarka = arabaMarka;
        this.arabaModel = arabaModel;
        this.arabaYil = arabaYil;
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "Araba Bilgileri: " +
                "marka='" + arabaMarka + '\'' +
                ", model='" + arabaModel + '\'' +
                ", yil=" + arabaYil +
                ", fiyat=" + fiyat ;
    }
}

