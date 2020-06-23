package singleton;

public class Fish {  //create class

    private Fish(){  //create constructor as private
    }

    public static Fish getFish(){  //Create a static object of class name nd get method as class name.
        return new Fish();
    }
    public void connectRiver(){   //declare any method as wanted under singleton class.
        System.out.println("Fish is ready to go into the river");
    }
    public void enjoyRiver(){
        System.out.println("Fish enjoy river");
    }
}
