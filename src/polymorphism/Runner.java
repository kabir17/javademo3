package polymorphism;

public class Runner {
    public static void main(String[] args) {

        Sea sea = new Sea();
        sea.saltWater();
        sea.seaFish("Salmon",5);

        System.out.println("---------------------");

        River river = new River();
        river.seaFish("TalaPia",5);
    }
}
