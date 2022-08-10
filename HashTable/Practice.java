package HashTable;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Practice {
    public static void main(String[] args) {
        Hashtable<String,Integer>classes=new Hashtable<>();
        classes.put("Technical",108);
        classes.put("SoftSkill",109);
        classes.put("Project",110);
        classes.put("Mentoring",111);
        System.out.println(classes);
        //classes.put(null,112);//nullpointerException bc you can not store null key in a hashTable
        System.out.println(classes);
       // classes.put("History",null);//nullpointerException bc you can not store null key in a hashTable
        System.out.println(classes);

        // get all keys from this hashtable and store them in a set and print use entrySet() to retrieve values only
        System.out.println(classes.keySet());
        for (Map.Entry<String,Integer>someThing:classes.entrySet()){
            System.out.println(someThing.getValue());
            System.out.println(someThing);
        }





    }
}
