package IfStatement;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        /*
        use scanner to get a number from user
        if the number is:
        1->"It is Monday"
        2->"It is Tuesday"
        ....
        7-> "It is Sunday"
      */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number between 1-7");
        int number=scanner.nextInt();
        if(number==1){
            System.out.println(("it is Monday"));
        }
        if(number==2){
            System.out.println(("it is Tuesday"));


        }
        if(number==3){
            System.out.println(("it is Wednesday"));

        }
        if(number==4){
            System.out.println(("it is Thursday"));

        }
        if (number==5){
            System.out.println(("it is Friday"));

        }
        if (number==6){
            System.out.println(("it is Saturday"));

        }
        if (number==7){
            System.out.println(("it is Sunday"));

        }
        // if user enters some other number than your options tell user that there is no matching day for your selection
        if (number>7 || number<1){
            System.out.println("there is no matching day for selection");
        }


    }













}
