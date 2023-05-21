package proxy;

import java.sql.SQLOutput;

public class KiralamaServisiDemo implements KiralamaServisi{


    @Override
    public void kiralamaIslemi(String musteriAd) {
        System.out.println(musteriAd +" musterisine araba kiralandı");
    }




}
