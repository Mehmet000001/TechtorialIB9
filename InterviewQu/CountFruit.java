package InterviewQu;

import java.util.HashMap;

public class CountFruit {
    public static void main(String[] args) {
        ////interview qc
        // how many apple ,pears
        String[] arrayOfarray = {"Apple", "Banana", "Grape", "Pear", "Pear"};
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arrayOfarray.length; i++) {
            if (!map.containsKey(arrayOfarray[i])) {
                map.put(arrayOfarray[i], 1);

            } else {
                map.put(arrayOfarray[i], 1 + 1);
            }
        }
        System.out.println(map);
    }
}
