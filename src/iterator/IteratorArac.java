package iterator;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class IteratorArac implements Iterator<AracIT> {

    private List<AracIT> arabalar;
    private int index;

    public IteratorArac(List<AracIT> arabalar) {
        this.arabalar = arabalar;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < arabalar.size();
    }

    @Override
    public AracIT next() {
        if (hasNext()) {
            AracIT arac = arabalar.get(index);
            index++;
            return arac;
        }
        throw new NoSuchElementException();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
