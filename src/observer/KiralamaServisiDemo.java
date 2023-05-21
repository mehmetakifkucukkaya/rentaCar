package observer;

import strategy.KiralamaSecenegi;

import java.util.ArrayList;
import java.util.List;

public class KiralamaServisiDemo implements KiralamaServisi {
    private List<Observer> gozlemciler;
    private String durum;

    public KiralamaServisiDemo() {
        gozlemciler = new ArrayList<>();
    }

    @Override
    public void observerKayit(Observer gozlemci) {
        gozlemciler.add(gozlemci);
    }

    @Override
    public void observerSil(Observer gozlemci) {
        gozlemciler.remove(gozlemci);
    }

    public void setDurum(String durum) {
        this.durum = durum;
        observerBildirim(durum);
        System.out.println("Durum güncellendi: " + durum);
    }
    @Override
    public void observerBildirim(String bildirimMesaji) {
        List<Observer> tempGozlemciler = new ArrayList<>(gozlemciler);
        for (Observer gozlemci : tempGozlemciler) {
            gozlemci.guncelle(bildirimMesaji);
        }
    }



}
