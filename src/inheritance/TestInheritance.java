package inheritance;
/*
   1. One parent and One child only
   2. Multilevel inheritance: One parent and one child and then grand child etc. ]
   3. Hierarchical inheritance: One parent and multiple child and then grand child etc. ]

   Parents have overage height
Human class method
Parents have overage height
Children are athletic
 */
public class TestInheritance {
    public static void main(String[] args) {


        River river = new River();
        river.cleanWater();
        river.die();
        river.saltWater();

        System.out.println("-----------------------");

        Pond pond = new Pond();
        pond.sweetWater();
        pond.die();
        pond.cleanWater();
        pond.saltWater();

        System.out.println("---------------------------");

        Shrimp shrimp = new Shrimp();
        shrimp.live();
        shrimp.die();

    }
}
