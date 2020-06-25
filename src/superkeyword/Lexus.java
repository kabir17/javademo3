package superkeyword;

public class Lexus extends Toyota {

    /*
    Using super keyword to invoke super class parameter constructor properties from sub-class constructor.
    But if we don't do parameter then by default it will call no-arguments constructor.No need to use super.
     */

    public Lexus(){
        super("Hybrid",2020);
    }
    public void engine(){
        System.out.println(super.parts);  //Calling super class variable by using super.
        super.engine();  //calling super class method engine by using super.
        System.out.println("This engine is sub-class lexus class method");  //This is lexus own method msg.
    }
}
