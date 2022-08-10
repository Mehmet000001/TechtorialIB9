package Exceptions;

public class Practice {
    public static void main(String[] args) {

        try {
            System.out.println("this is my first line of code");
            String str="35c";//given exception bc for c not number
            int result =5/0;
            int number=Integer.parseInt(str);
            System.out.println(number);
            System.out.println("This is the  text I want to see");
        }catch (NumberFormatException xyz){
            System.out.println("There is a format mismatch");///this is validation part
        }catch (ArithmeticException ar){
            System.out.println("The result of division by zero is not working");
        }
    }
}
