package factory;


public class KullaniciFactory {
    public static Kullanici yeniKullanici(String rol, String adSoyad, String email,String telefonNo) {
        if (rol.equalsIgnoreCase("Müşteri")) {
            return new Musteri(adSoyad, email,telefonNo);
        } else if (rol.equalsIgnoreCase("Yönetici")) {
            return new Yonetici(adSoyad, email,telefonNo);
        }
        return null;
    }
}