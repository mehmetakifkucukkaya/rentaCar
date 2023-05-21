package visitor;

public class RaporVisitor implements  ArabaVisitor{


    @Override
    public void ziyaretEt(KiralikAraba araba) {
        System.out.println("Araba Raprou: "+ araba.getMarka());
    }


}
