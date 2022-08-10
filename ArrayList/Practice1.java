package ArrayList;

import java.util.ArrayList;

public class Practice1 {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        ArrayList list1=new ArrayList(10);
        ArrayList list2=new ArrayList(list1);
        ArrayList<Integer> list3=new ArrayList<>();
        ArrayList<Integer> list5=new ArrayList<Integer>();
        System.out.println(list);
        System.out.println(list1);

        //add()--->it will add element to the arraylist
        list1.add("Red");
        System.out.println(list1);
        list1.add("Blue");
        list1.add("Purple");
        list1.add("Violet");
        list1.add("Pink");
        System.out.println(list1);
        //get-->it will return element from given index
        System.out.println(list1.get(2));
        System.out.println(list1.get(4));

        //size()---it will return the size of arraylist(count of elements)

        System.out.println(list1.size());
        System.out.println(list1.get(list1.size()-1));
       // System.out.println(list1.get(list1.size()));//indexoutofboundsexception

        System.out.println(list1.get(0));

        System.out.println(list1);
        list1.add(2,"Yellow");///means first and second element stay location after yellow add others move next location
        System.out.println(list1);
        list1.add(list1.size()-1,"White");
        System.out.println(list1);
        list1.add(list1.size(),"Green");
        System.out.println(list1);
       // list1.add(15,"Black");indexoutofboundsexception
        System.out.println(list1.size());
        list1.add(8,"Orange");
        System.out.println(list1);
        for (int i=0;i<list1.size();i++){
            String color="";
            color+=list1.get(i);
            System.out.println(color.toUpperCase());
        }
        for (Object cl:list1){
            System.out.println(cl);
        }




    }
}
