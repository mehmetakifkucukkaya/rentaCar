package observer;

public interface KiralamaServisi {

    void observerKayit(Observer gozlemci);
    void observerSil(Observer gozlemci);
    void observerBildirim(String bildirimMesaji);



}
