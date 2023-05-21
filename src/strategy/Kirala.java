package strategy;

public class Kirala {

    private  KiralamaSecenegi kiralamaSecenegi ;

    public void setKiralamaSecenegi (KiralamaSecenegi kiralamaSecenegi)
    {
        this.kiralamaSecenegi = kiralamaSecenegi;
    }

    public double kiralamaUcreti(double kiraSuresi)
    {
        return kiralamaSecenegi.kiralamaUcreti(kiraSuresi);
    }


}
