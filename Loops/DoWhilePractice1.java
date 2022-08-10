package Loops;

import java.util.Scanner;

public class DoWhilePractice1 {
    public static void main(String[] args) {
        /*
        please use do while loop ask user to enter 2 integer numbers and find the total(sum) of the number in that range
        num1:1
        num2:7
         */
        Scanner input=new Scanner(System.in);
        System.out.println("please enter first  number");
        int firstNumber=input.nextInt();
        System.out.println("please enter second  number which is larger than the first number");
        int secondNumber =input.nextInt();
        int total=0;
        do {
            total=total+firstNumber;
            firstNumber++;
        }while (firstNumber<=secondNumber);
        System.out.println("the total is"+total);






    }
}
