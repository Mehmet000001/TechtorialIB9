package Loops;

public class ForLoopPractice {
    public static void main(String[] args) {

        ///print number btwn 0 to 5 by using while loop
       // while (a>=0){
          //  System.out.println(a);
          //  a--;
       // }


        for (int i=5;i>=0;i--){///for(variable;condition;conditionUpdate){
            System.out.println(i);
        }
        int a=5;
        for ( ;a>0;a--){
            System.out.println("this is other for loop");
        }
        int b=10;
        for (; b==10;){
            System.out.println("b is my number");
            b++;

        }
        //infinite for loop
//        for (;;){
//            System.out.println("this is infinite FOR LOOP");//to stop the loop you can use break;

        //}
    }
}
