package Arrays;

import java.util.Arrays;

public class MultiDimentionalArray {
    public static void main(String[] args) {
        int [] [] example= new int[3][4];
        int[] arr=new int[3];
        arr[0]=11;
        arr[2]=33;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(example));
        example[0][0]=11;//bc we have 3 box first one index 0 each box 4 element first one 0 index
        example[2][3]=88;///
        example[0][1]=12;
        example[0][2]=13;
        example[0][3]=14;

        System.out.println(example[2][3]);//if you not for loop sout inside put like this give value
       // System.out.println(example[2][5]);exception bc we do not have 5 element
       // System.out.println(example[3][1]);exception run time error
        for (int i=0;i<example.length;i++){
            for (int k=0;k<example[i].length;k++){///example[i] first element
                System.out.println(example[i][k]);

            }
        }
        System.out.println(Arrays.deepToString(example));/// new method
    }
}
