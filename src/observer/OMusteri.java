package observer;

public class OMusteri implements  Observer{
    private String ad;

    public OMusteri(String ad) {
        this.ad = ad;
    }


    @Override
    public void guncelle(String mesaj) {
        System.out.println(ad+ " müşteriye bildirim başarıyla gönderildi");
    }
}
