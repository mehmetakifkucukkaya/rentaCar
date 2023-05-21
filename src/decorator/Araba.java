package decorator;

public class Araba implements Arac{

    private  String aciklama;
    private double kiralamaUcreti;

    public Araba(String aciklama, double kiralamaUcreti) {
        this.aciklama = aciklama;
        this.kiralamaUcreti = kiralamaUcreti;
    }
    @Override
    public String getAciklama() {
        return aciklama;
    }

    @Override
    public double getKiralamaUcreti() {
        return kiralamaUcreti;
    }
}
