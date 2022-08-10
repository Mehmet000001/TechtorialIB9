package HomeWork;

public class Task5HomeWork9 {
    public static void main(String[] args) {
//    Description
//    Write a program in Java to display any number in reverse order.
//    Test Data :
//    Input a number: 12345 (it can be any number like 5 digits or 6 digits etc)
//    Expected Output :
//    The number in reverse order is: 54321
        int number =6578998;
        // Last digit
        // number%10
        // we need to get rid of to last digit of the number
        // number= number/10;
        String reverseDigits= "";
        for (;number>0;){
            reverseDigits+=number%10;
            number = number/10;
        }
        System.out.println(reverseDigits);   }





    }
