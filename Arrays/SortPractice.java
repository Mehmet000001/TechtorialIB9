package Arrays;

import java.util.Arrays;

public class SortPractice {
    public static void main(String[] args) {
        int numbers[]={23,4,5,15,9,45,567,1,33};
        ////1,4,5,9.................,567
        System.out.println("Before sorting "+Arrays.toString(numbers));
        Arrays.sort(numbers);//sort(); it is sorts array's elements in ascending order
        System.out.println("After sorting "+Arrays.toString(numbers));
        System.out.println(numbers[numbers.length-1]);///last number
        String[] cities={"Arizona","chicago","New York","denver","Boston","Dallas","aberta","alabama"};//bc lover case last you can see.
        Arrays.sort(cities);
        System.out.println(Arrays.toString(cities));///elements will be alphabetically sorted
        for (int i=0;i<cities.length;i++){
            cities[i]=cities[i].toUpperCase();///resign
        }
        Arrays.sort(cities);
        System.out.println(Arrays.toString(cities));

    }
}
