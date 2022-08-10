package IfStatement;

import java.util.Scanner;

public class Task2 {
  /*  -Ask user to enter first letter of the day
    Ask user to enter first letter of the day
if the letter is: M print "your day is Monday"
            if the letter is: T print "your day is Tesday or Thursday"
            if the letter is: W print "your day is Wednesday"
            if the letter is: F print "your day is Friday"
            if the letter is: S print "your day is Saturday or Sunday"
            
   */

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("please enter first letter of a day");
        String letter=input.nextLine();
        letter=letter.toUpperCase();
        char ch=letter.charAt(0);
         String str="";
        str+=ch;

        if (str.equals("M")){
            System.out.println("your day is Monday");
        }
        if (str.equals("T")) {
            System.out.println("your day is Tuesday or Thursday");
        }
        if (str.equals("W")){
            System.out.println("your day is Wednesday");
        }

        if (str.equals("F")){
            System.out.println("your day is Friday");
        }
        if (str.equals("S")){
            System.out.println("your day is saturday or sunday");
        }
    }
    
    
    /*
    char firstChar=input.next().chartAt(0);
    if(firstChar=="m" || firstChar=="m"){
                System.out.println("your day is Monday");


    }
     */
    
    
    
    
}
