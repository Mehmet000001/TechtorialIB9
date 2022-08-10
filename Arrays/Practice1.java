package Arrays;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        int [] number= new int[4];
        ///int number1 []=new int[5];another way of creating array
        number[0]=11;///
        number[1]=22;/////we have 4 space we use index number 0 to 3 index 2 we kept empty
        number[3]=44;
        //System.out.println(number);///hesh code show you your box location
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);///if you empty java give you 0
        System.out.println(number[3]);
       // number[4]=55;
       // System.out.println(number[4]);arrayindexoutofboundsexception
        number[0]=12;//you can reasing
        System.out.println(Arrays.toString(number));
        System.out.println("=============");
        for (int i=0;i<number.length;i++){///array we use length ---------> length() not the same///number.length show us box number we have 4 number
            System.out.println(number[i]);
        }
    }
}
