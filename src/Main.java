import builder.Araba;
import builder.ArabaBuilder;
import factory.Kullanici;
import factory.KullaniciFactory;

public class Main {
    public static void main(String[] args) {

        // Builder Tasarim Deseni Kullandigimiz Kisim

        Araba araba1 = new ArabaBuilder()
                .setMarka("TOGG")
                .setModel("T10X Uzun Menzil")
                .setYil(2023)
                .setFiyat(1215000.0)
                .build();

        System.out.println( araba1 );


        //Factory Tasarim Desenini Kullandigimiz Kisim

            Kullanici musteri = KullaniciFactory.yeniKullanici("Müşteri", "Ali ", "ali@gmail.com","55555555555");
            musteri.kullaniciBilgi();

        Kullanici yonetici = KullaniciFactory.yeniKullanici("Yönetici","Mehmet Akif Küçükkaya","akif@gmail.com","66666666666");
            yonetici.kullaniciBilgi();
    }

}