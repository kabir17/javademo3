package abstraction;

public class Tuna implements River{

    public void born(){

        System.out.println("Tuna born in the sea");
    }
    public void live()
    {
        System.out.println("Tuna live in the sea");
    }
    public void die()
    {
        System.out.println("Tuna die out of the sea");
    }
    public void enjoy(){
        System.out.println("Tuna enjoy in the water");
    }
    public void tunaPrint(){
        for (int i=0; i<3; i++) {
            System.out.println("Tuna");
        }
    }
}
