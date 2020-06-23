package singleton;

public class TestFish {
    public static void main(String[] args) {

        Fish fish = Fish.getFish();
        fish.connectRiver();
        fish.enjoyRiver();
    }
}

/*
DatabaseInstance databaseInstance = DatabaseInstance.getInstance1();
        databaseInstance.connectDatabase();
 */