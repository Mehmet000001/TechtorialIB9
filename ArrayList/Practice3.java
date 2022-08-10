package ArrayList;

import java.util.ArrayList;///if you import arraylist and list delete put *; java accept every think.
import java.util.List;

public class Practice3 {
    public static void main(String[] args) {


        ArrayList<String> cities = new ArrayList<String>();
        cities.add("chicago");
        cities.add("new york");
        cities.add("columbus");
        cities.add("springfield");
        cities.add("dallas");
        System.out.println(cities);
        //remove()--->it will remove/delete element
        cities.remove("dallas");
        System.out.println(cities);
        cities.remove(1);
        System.out.println(cities);
        cities.remove(cities.size()-1);
        System.out.println(cities);

        ////removeAll you have to specific list clear
        cities.removeAll(cities);
        System.out.println(cities);
        cities.add("chicago");
        cities.add("new york");
        cities.add("columbus");
        ////clear method clear every think
        cities.clear();
        System.out.println(cities);

        ArrayList<String> states = new ArrayList<String>();
        states.add("IL");
        states.add("OH");
        states.add("TX");
        states.add("NY");

        //addAll
        cities.addAll(states);
        System.out.println("this is cities arraylist "+cities);
        System.out.println(states);//original values stay
        ArrayList<Integer> zipCode=new ArrayList<>();
        zipCode.add(100);
        zipCode.add(200);
        zipCode.add(300);
        System.out.println(zipCode);
        //zipCode.addAll(states)this will not compile bc of object/Data type


        //set()----> it will replace the element at given index
        zipCode.set(1,555);
        System.out.println(zipCode);

        //contains()/isEmpty()
        System.out.println( states.contains("IL"));
        System.out.println(states.isEmpty());
        states.clear();
        System.out.println(states.isEmpty());


        List<String> list1=new ArrayList<>();



    }
}