package strategy;

public class SaatlikKiralama implements KiralamaSecenegi{

    private static final double SAATLIK_UCRET = 100.0;


    @Override
    public double kiralamaUcreti(double kiraSuresi) {
        return SAATLIK_UCRET * kiraSuresi;

    }
}
