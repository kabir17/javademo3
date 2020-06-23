package nestedclass;

public class Sea {  //create a class

    public Sea(){   //create a constructor
    }

    //create sub-classes object
    Salmon salmon = new Salmon();
    Tuna tuna = new Tuna();
    Shrimp shrimp = new Shrimp();

    //Super class method
    public void fishMarket(String fishInfo){
        if (fishInfo.equalsIgnoreCase("Bronx")){
            salmon.buySalmon(fishInfo);
        }else if(fishInfo.equalsIgnoreCase("Atlantic")){
            tuna.liveLand(fishInfo);
        }else if (fishInfo.equalsIgnoreCase("Village")){
            shrimp.catchFish(fishInfo);
        }

    }
    //create more classes as private with method as public under super class
    private class Salmon{
        public void buySalmon(String place){
            System.out.println("Salmon fish buy Whole sale place : "+place);
        }
    }
    private class Tuna{
        public void liveLand(String sea){
            System.out.println("Tuna fish live land : "+sea);
        }
    }
    private class Shrimp{
        public void catchFish(String pond){
            System.out.println("Shrimp fish catch area is : "+pond);
        }
    }
}
