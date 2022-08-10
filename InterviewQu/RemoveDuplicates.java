package InterviewQu;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
//    input: int a[] = {5, 2, 6, 8, 6, 7, 5, 2, 8};
//    output: [5, 2, 6, 8, 7]
//    This method can be used even if the array is not sorted.
//            Approach:
//            - Take a Set
//- Insert all array elements in the Set.
//- Set does not allow duplicates and sets like LinkedHashSet maintains the order of insertion
//    so it will remove duplicates and elements will be printed in the same order in which it is inserted.
//- Print elements of Set.
public static void main(String[] args) {


    int a[] = {5, 2, 6, 8, 6, 7, 5, 2, 8};
    removeDupl(a);
}
public static void  removeDupl(int [] a){
    LinkedHashSet<Integer>set=new LinkedHashSet<>();
    for (int i=0;i<a.length;i++){
        set.add(a[i]);

    }
    System.out.println(set);
}
}
