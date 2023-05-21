package decorator;

public abstract class DecoratorArac implements Arac{

    protected  Arac decoratedArac;

    public DecoratorArac(Arac decoratedArac)
    {
        this.decoratedArac = decoratedArac;
    }

    @Override
    public String getAciklama() {
        return decoratedArac.getAciklama();
    }

    @Override
    public double getKiralamaUcreti() {
        return decoratedArac.getKiralamaUcreti();
    }


}
