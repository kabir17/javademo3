package superkeyword;

public class Toyota {

    public String model;
    public int year;
    public String parts = "Corolla";

    public Toyota (){
        System.out.println("Basic setup");
    }

    public Toyota(String model, int year) {
        this.model = model;
        this.year = year;
        System.out.println(model+" "+year);
    }

    public void engine(){
        int i=0;
        while (i<1){
            System.out.println("This engine is Super class method");
            i++;
        }
    }
}
