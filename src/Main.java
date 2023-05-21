import builder.Araba;
import builder.ArabaBuilder;

public class Main {
    public static void main(String[] args) {

        // Builder Tasarım Deseni Kullandığımız Kısım

        Araba araba1 = new ArabaBuilder()
                .setMarka("TOGG")
                .setModel("T10X Uzun Menzil")
                .setYil(2023)
                .setFiyat(1215000.0)
                .build();

        System.out.println( araba1 );



    }
}