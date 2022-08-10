package IfStatement;

public class NestedIfPractice {
    public static void main(String[] args) {
       boolean passport=true;
       boolean visa=true;
       boolean ticket=true;
       if (passport){
           if (visa){
               if (ticket){
                   System.out.println("good news you fly to your destination");
               }

           }else{
               System.out.println("you should have visa");
           }

       }else if(!passport){
           System.out.println("you should get passport first");
       }








    }
}
