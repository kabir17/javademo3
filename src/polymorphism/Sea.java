package polymorphism;

public class Sea {
    public void saltWater(){
        System.out.println("Sea water is salty");
    }
    public String seaFish(String fishName,int num){
        int i=0;
        while (i<1){
            System.out.println("Salmon is sea fish");
            int j=0;
            do{
                System.out.println("TalaPia is river fish");
                j++;
            }while (j<1);
            i++;
        }
        return "";
    }
}
