package InterviewQu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterations {
    // Iterate in the map and print all the values and keys from the map
// First do with while loop then do with for loop
//
//
    public static void allValuesAndKeysWithLoops(Map<String, String> map) {
        // How can you print all values and keys with while loop
        // entrySet() method returns and Map.Entry object in there we can get keys and values
        // WIth while loop we need to use iterations
        Iterator iterator = map.entrySet().iterator();
        // hasNext() method this method returns true if there is a next element otherwise it will return false
        // Iterator allows me to go thru all Map.Entry objects in the map
        while (iterator.hasNext()) {
            Map.Entry me = (Map.Entry) iterator.next();
            System.out.println("THe key is " + me.getKey() + " The value is " + me.getValue());
        }
        for (Map.Entry mapEntry : map.entrySet()
        ) {
            System.out.println("THe key is " + mapEntry.getKey() + " The value is " + mapEntry.getValue());
        }
    }

    public static void main(String[] args) {
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("d", "kdd");
        stringMap.put("jlkd", "dkjdfke");
        stringMap.put("yeueie", "dkl;kd");
        allValuesAndKeysWithLoops(stringMap);

    }
}