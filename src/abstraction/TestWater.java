package abstraction;

public class TestWater {
    public static void main(String[] args) {

        River river = new Shrimp();
        river.born();
        river.live();
        river.die();

        System.out.println("------------------");

        Shrimp shrimp = new Shrimp();
        shrimp.born();
        shrimp.live();
        shrimp.die();
        shrimp.fishMarket();
        shrimp.noBlood();
        shrimp.saltWater();

        System.out.println("----------------------------");

        River salmon = new Salmon();
        salmon.born();
        salmon.live();
        salmon.die();

        System.out.println("--------------------------");

        River tuna = new Tuna();
        tuna.born();
        tuna.live();
        tuna.die();

        Tuna tuna1 = new Tuna();
        //tuna1.tunaPrint();

        System.out.println("-----------------------------");

        Fish fish = new Shrimp();
        fish.fishMarket();
        fish.water();
    }
}
