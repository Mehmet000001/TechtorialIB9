package IfStatement;

public class ElseTask1 {
    public static void main(String[] args) {
        /*
        when your order is more than $1000 or more you will get %20 off
        otherwise you will get %5 off
        calculate how much are you going to pay i each case
         */
        //100*.2---->20%
        //100*.05-----5%
        double purchase=999.99;
        if (purchase>=1000){
            System.out.println("this is the amount %20 off" +(purchase-(purchase*0.2)));
        }else{
            System.out.println("this is the amount after %5 off"+( purchase-(purchase*0.05)));
        }


    }
}
