package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String[] args) {
        Object [] objects={true,false,10,"test"};
        //the object is the parent class of other objects in java .
        //that's why we can store the different data types.
        //how to convert array to arraylist?
        List<Object> objs= Arrays.asList(objects);
        List<Integer>nums=new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        List<Integer> numbers=Arrays.asList(1,2,3,4);
        //numbers.add(5);///*****when we convert to arraylist the arraylist is fixed size .you can not add the value and you can not remove the value from arraylist.

    }
}
