package HomeWork;

import java.util.Scanner;

public class Task1HomeWork9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your repeating number");
        int nTerm=input.nextInt();///how many times
        int sum=0;
        int num=1;
        for (int i=0;i<nTerm;i++){
            sum+=num;
            num=(num*10)+1;
        }
        System.out.println(sum);

//        int [] number={1,11,111,1111,11111};
//        int sum=0;
//        for (int i=0;i<number.length;i++){
//            sum+=number[i];
//
//        }
//        System.out.println(sum);

    }
}
