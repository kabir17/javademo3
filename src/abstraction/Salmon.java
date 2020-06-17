package abstraction;

public class Salmon implements River{

    public void born(){
        System.out.println("Salmon born in the sea");
    }
    public void live(){
        System.out.println("Salmon live in the sea");
    }
    public void die(){
        System.out.println("Salmon die out of the sea");
    }
}
