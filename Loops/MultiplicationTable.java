package Loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        /*
        use nested for loop to create a multiplication table for 5s
        5*1=5
        5*2=10
        5*12=60
         */

        for (int num1=1;num1<=5;num1++){
            for (int num2=1;num2<=12;num2++){
                System.out.println(num1+"*"+num2+"="+num1*num2);
            }

        }
    }
}
