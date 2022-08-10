package Arrays;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int [] ids=new int[10];
        ids[1]=21;
        ids[5]=51;
        int[] studentIds={11,12,13,14,15,16};//// second way of creating array
                                                //it is useful if know values before hand
        System.out.println(studentIds[2]);//13
        System.out.println(Arrays.toString(studentIds));//[11,12,13,14,15,16] came to in side array[]
        for (int k=0;k<studentIds.length;k++){
            System.out.println(studentIds[k]);///here not come array 11,12,13,14,15,16
        }
       // studentIds[0]=55; you can resing

    }
}
