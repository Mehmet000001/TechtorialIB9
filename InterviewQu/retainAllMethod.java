package InterviewQu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class retainAllMethod {
    public static void main(String[] args) {
        Set<Integer> num=new HashSet<>(Arrays.asList(1,7,3,8,9));
        Set<Integer>num2=new HashSet<>(Arrays.asList(7,8,3,4));////retailAll() first and second  capraz the same number show you
        System.out.println(num);
        num.retainAll(num2);
        System.out.println(num);

    }
}
