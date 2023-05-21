import bridge.Islemler;
import bridge.KiralanacakAraba;
import bridge.SporAraba;
import bridge.SuvAraba;
import builder.Araba;
import builder.ArabaBuilder;
import decorator.Arac;
import decorator.EkMenzilDecorator;
import factory.Kullanici;
import factory.KullaniciFactory;
import iterator.AracIT;
import iterator.AracListesi;
import iterator.Otomobil;
import proxy.KiralamaServisi;
import proxy.ProxyKiralama;

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


        //Bridge Tasarim Desenini Kullandigimiz Kisim

        KiralanacakAraba sporAraba = new SporAraba("34 BA 2626");
        Islemler kiraIslem = new Islemler(sporAraba);
        kiraIslem.kirala();

        KiralanacakAraba suvAraba = new SuvAraba("25 AE 123");
        Islemler kiraIslem2 = new Islemler(suvAraba);
        kiraIslem2.kirala();


        //Proxy Tasarim Desenini Kullandigimiz Kisim

        KiralamaServisi servisKira = new ProxyKiralama();

        servisKira.kiralamaIslemi("Mehmet");

        servisKira.kiralamaIslemi("Ahmet");  //Sistemdeki tek arabayı 'Mehmet' kiraladığı için 'Ahmet' araba kiralayamaayacak


        //Decorator Tasarim Desenini Kullandigimiz Kisim

        Arac araba2 = new decorator.Araba("TOGG",1750);

        Arac decoratedAraba = new EkMenzilDecorator(araba2 );

        System.out.println("Açıklama: "+ decoratedAraba.getAciklama());
        System.out.println("Kiralama Bedeli: " + decoratedAraba.getKiralamaUcreti() + " TL");

        //Itterator Tasarim Desenini Kullandigimiz Kisim

        AracListesi araclar = new AracListesi();

        araclar.aracEkle(new Otomobil("BMW" , 1200));
        araclar.aracEkle(new Otomobil("Mercedes" , 1000));
        araclar.aracEkle(new Otomobil("Toyota" , 1100));



    }



}