package Arrays;

import java.util.Arrays;

public class FindingMissingNumber {
    public static void main(String[] args) {
        // find missing number from given array
        //{10,11,12,14,15}        interview qc// 13 is missing number
        int [] number={10,11,12,14,15};
        int sum1=0;///85
        int sum2=0;///72
        for (int i=10;i<=15;i++){
            sum1+=i;

        }
        for (int i=0;i<number.length;i++){
            sum2+=number[i];

        }
        System.out.println(sum1-sum2);




    }
}
