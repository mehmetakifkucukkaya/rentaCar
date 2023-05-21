package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AracListesi  implements  Iterable<AracIT>{

private List<Otomobil> arabalar;

    public AracListesi() {
        arabalar = new ArrayList<>();
    }

    public void aracEkle(Otomobil arac) {
        arabalar.add(arac);
    }

    public void aracCikar(AracIT arac) {
        arabalar.remove(arac);
    }

    @Override
    public Iterator<AracIT> iterator() {
        return new Iterator<AracIT>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public AracIT next() {
                return null;
            }
        };
    }

}
