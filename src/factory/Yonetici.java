package factory;

public class Yonetici implements Kullanici{

    private  String adSoyad;
    private String email;
    private String telefonNo;
    private String rol= "Yonetici";

    public Yonetici(String adSoyad, String email, String telefonNo) {
        this.adSoyad = adSoyad;
        this.email = email;
        this.telefonNo = telefonNo;
    }

    @Override
    public void kullaniciBilgi() {
        System.out.println("Kullanici Bilgileri\n---------------------------");
        System.out.println("Kullanici Rol: " + rol );
        System.out.println("Ad-Soyad: " +  adSoyad );
        System.out.println("Email: " +  email );
        System.out.println("Telefon Numarası: " +  telefonNo);
    }

}
