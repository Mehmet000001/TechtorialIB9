package HomeWork;

import java.util.Scanner;

public class Task2HomeWork9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your last number");
        int lNumber=input.nextInt();

        for (int i=1;i<lNumber;i++){
            int sum=0;/// it will give sum of proper divisors
            for (int k=1;k<=i/2;k++){
                if (i%k==0){
                    sum+=k;
                }
                // we should wait this loop to finish to find correct sum
            }
            if (i==sum){
                System.out.println(i+" is perpect number");
            }

        }




    }
}
