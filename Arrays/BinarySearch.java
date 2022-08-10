package Arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        // binary search will return index number of element of element in array
        //*** array has to be sorting before applying binary search
        //if the element is not present in the array it will possible place for that element with a negative number.

        int [] number={4,65,12,15,6,10};///[4,6,10,12,15,65]
        Arrays.sort(number);
        int indexOf65= Arrays.binarySearch(number,65);
        System.out.println(Arrays.toString(number));
        System.out.println(indexOf65);///binary number [4,6,10,12,15,65] show it 5
        int indexOf6=Arrays.binarySearch(number,6);
        System.out.println(indexOf6);
        int indexOf5=Arrays.binarySearch(number,5);
        System.out.println(indexOf5);
        int placeOf150=Arrays.binarySearch(number,150);//[4,6,10,12,15,65] bc we have 150 7s element it will be show -7
        System.out.println(placeOf150);
        int placeOf1=Arrays.binarySearch(number,1);
        System.out.println(placeOf1);// it will show -1 bc first element
    }

}
