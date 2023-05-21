package proxy;

public class ProxyKiralama implements KiralamaServisi{

    private KiralamaServisiDemo kiralamaServisi;
    private int mevcutAracSayisi;

    public ProxyKiralama() {
        this.kiralamaServisi = new KiralamaServisiDemo();
        this.mevcutAracSayisi = 1;
    }


    @Override
    public void kiralamaIslemi(String musteriAd) {

        if (mevcutAracSayisi > 0) {
            kiralamaServisi.kiralamaIslemi(musteriAd);
            mevcutAracSayisi--;
        }
        else {
            System.out.println("Sistemde mevcut arac bulunamadi");
        }

    }
}
