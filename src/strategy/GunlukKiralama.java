package strategy;

public class GunlukKiralama implements  KiralamaSecenegi{
    private static final double GUNLUK_UCRET = 1000.0;


    @Override
    public double kiralamaUcreti(double kiraSuresi) {
        return GUNLUK_UCRET * kiraSuresi;
    }
}
