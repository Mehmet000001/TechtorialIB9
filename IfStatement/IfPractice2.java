package IfStatement;

import java.util.Scanner;

public class IfPractice2 {
    public static void main(String[] args) {
   /*
   Ask User to enter jis/her score from an exam
-if score is between 90 - 100 --> print A
-if score is between 80 - 89 --> print B
-if score is between 70 - 79 --> print C
-if score is between 60 - 69 --> print D
-if score is between 0 - 60 --> print Failing grade
    */

        Scanner input=new Scanner(System.in);
        System.out.println("please enter score");
        double score=input.nextDouble();
        if (score>=90 && score<100){
            System.out.println("your score is A");
        }
        else if (score>=80 && score<89) {
            System.out.println("your score is B");
        } else if (score>=70 && score<79){
            System.out.println("your score is C");
        }   else if (score>=60 && score<69){
        System.out.println("your score is D");
    }  else if (score>=0 && score<60){
            System.out.println("your failing grade");

        }else{
            System.out.println("Check your number");
    }






}
}
