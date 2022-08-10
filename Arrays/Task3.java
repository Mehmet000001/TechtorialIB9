package Arrays;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        //print numbers which are greater than 10from a given array
        //{4,6,22,40,1,100,43,10,-25}
        int[]  number={4,6,22,40,1,100,43,10,-25};
        int num[]=new int[number.length];///single element print out

        for (int y=0;y<number.length;y++) {
            if (number[y] > 10) {
                num[y]=number[y];
                System.out.println(number[y]);

            }
        }
        System.out.println(Arrays.toString(num));

    }
}
