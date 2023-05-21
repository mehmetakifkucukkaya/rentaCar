package decorator;

public class EkMenzilDecorator extends DecoratorArac {

    //Kiralanack arabaya ek menzil hizmeti saytın alınıyor
    private static final double EKMENZIL_UCRET = 150.0;

    public EkMenzilDecorator(Arac decoratedArac) {
        super(decoratedArac);
    }

    @Override
    public String getAciklama() {
        return super.getAciklama() + ", Ek Menzil Hizmeti eklendi";
    }

    @Override
    public double getKiralamaUcreti() {
        return super.getKiralamaUcreti() + EKMENZIL_UCRET;
    }


}
