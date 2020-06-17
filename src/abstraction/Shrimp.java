package abstraction;

public class Shrimp extends Fish implements River,Sea{

    public void born(){
        System.out.println("Fish born in the river");
    }
    public void live(){
        System.out.println("Fish live in the river");
    }
    public void die(){
        System.out.println("Fish die out of the river");
    }
    public void fishMarket(){
        System.out.println("We need to build up fish market");
    }
    public void saltWater(){
        System.out.println("Why sea water is salty");
    }
    public void noBlood(){
        System.out.println("Shrimp fish has no blood");
    }
}

