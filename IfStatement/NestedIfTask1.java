package IfStatement;

import java.util.Scanner;

public class NestedIfTask1 {
    public static void main(String[] args) {
      /*
      ask user for their city name
- if city is "chicago"
-ask user what is the name of the school/course
-if the school name is "techtorial"
- tell user that "you are lucky to be in the Batch9"
-if city is not chicago
- tell user that "come to chcicago and visit Techtorial"
-if the school name is not 'Techtorial"'
- tell user that "you should visit Techtorial"
Collapse*/

        Scanner input=new Scanner(System.in);
        System.out.println("what is your city");
        String city=input.nextLine();
        if (city.equalsIgnoreCase("chicago")){
            System.out.println("What is your school");
          String school=input.nextLine();
          if (school.equalsIgnoreCase("techtorial")){
              System.out.println("you are luck to be in the batch9");
          } else {
              System.out.println("you should visit Techtorial");
          }
          }else {
            System.out.println("come to chicago and visit Techtorial");
        }












    }
}