package encapsulation;

public class TestFish {
    public static void main(String[] args) {

        Fish fish1 = new Fish("Salmon",200.00);
        System.out.println(fish1.getFishName());
        System.out.println("price : "+fish1.getPrice()+ " dollars ");

        System.out.println("-----------------------");

        Fish fish2 = new Fish();
        fish2.setFishName("Tuna");
        fish2.setDOB("01/01/2005");
        fish2.setFishId(111);
        fish2.setPrice(100.00);
        System.out.println(fish2.getFishName()+"      "+fish2.getFishId()+  "   "+fish2.getDOB()+"   "+
                fish2.getPrice());

        Fish fish3 = new Fish();
        fish3.setFishName("Talapia");
        fish3.setFishId(112);
        fish3.setDOB("01/01/2020");
        fish3.setPrice(15.00);
        System.out.println(fish3.getFishName()+"   "+fish3.getFishId()+"   "+fish3.getDOB()+"   "+
                fish3.getPrice());

        Fish fish4 = new Fish();
        fish4.setFishName("puti");
        fish4.setFishId(113);
        fish4.setDOB("01/06/2020");
        fish4.setPrice(2);
        System.out.println(fish4.getFishName()+"      "+fish4.getFishId()+"   "+fish4.getDOB()+"   "+
                fish4.getPrice());
    }
}
