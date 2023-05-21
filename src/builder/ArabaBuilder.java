package builder;

public class ArabaBuilder {

    private String arabaMarka;
    private String arabaModel;
    private int arabaYil;
    private double fiyat;


    public ArabaBuilder setMarka(String arabaMarka) {
        this.arabaMarka = arabaMarka;
        return this;
    }

    public ArabaBuilder setModel(String arabaModel) {
        this.arabaModel = arabaModel;
        return this;
    }

    public ArabaBuilder setYil(int arabaYil) {
        this.arabaYil = arabaYil;
        return this;
    }

    public ArabaBuilder setFiyat(double fiyat) {
        this.fiyat = fiyat;
        return this;
    }

    //Araba nesnesi oluşturmak için kullanılan methot
    public Araba build() {
        return new Araba(arabaMarka, arabaModel, arabaYil, fiyat);
    }


}
