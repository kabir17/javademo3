package exception;

import java.util.Scanner;

public class HandleRuntimeException{
    public static void main(String[] args) {

        int number= 10;
        int total= 0;
        try {
            total= number / 0;
        }catch (Exception ex){
            System.out.println("ArithMeticException");
        }
        System.out.println(total);

        //Using scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");

        int num=sc.nextInt();
        int num1=sc.nextInt();
        int result = 0;
        try {
            result = num / num1;
        }catch (Exception e){
            System.out.println("ArithMeticException if divide by zero");
        }
        System.out.println(result);
    }
}
