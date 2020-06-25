package string.operation;

/*
    Java string concat() method concatenates multiple strings. This method appends the specified string at the
    end of the given string and returns the combined string.
 */

public class StringMethod {

    public void concatEndOfGivenInSingleLine(){
        String str1 = "Learning";
        str1=str1.concat(" Java");
        str1=str1.concat(" Programming ");
        str1=str1.concat(" Language ");

        System.out.println("Concat in single : "+str1);
    }
    public void concatEndOfGivenInCombine(){
        String str1 = "Learning";
        str1 = str1.concat(" Java ").concat(" Programming ").concat(" Language");
        System.out.println("Concat in Combine : "+str1);
    }
    public void concatBeginOfGivenString(){
        String str = "Programming Language";
        String str1 = "Java ".concat(str);

        System.out.println("Beginning of Given String : "+str1);
    }
    /*
        concatenating thirty to the end of the given value. The given value integer 30 must need to convert
        the given integer to the string first.
        We are using valueOf() method to convert the number to the equivalent string str and then we are
        concatenating the 30 at the end of converted string.
     */
    public void convertIntToString(){
        int number = 20;
        String str = String.valueOf(number);
        System.out.println("Convert Int to String : "+str + 30);
    }
    public void addStringArray(){
        char vowel[] = {'k','a','j','o','l'};
        System.out.println("Adding String Array : "+String.valueOf(vowel));
    }
    public void doubleToString(){
        double d = 100.00;
        System.out.println("Double to String : "+String.valueOf(d));
    }
    public void floatToString(){
        float f = 200.00f;
        System.out.println("Float to String : "+String.valueOf(f));
    }
    public void stringIsEmpty(){
        String str = "";       //empty string
        String str1 = "Hello";  //non-empty

        System.out.println("Empty String : "+str.isEmpty());
        System.out.println("Non Empty String : "+str1.isEmpty());
    }
}
