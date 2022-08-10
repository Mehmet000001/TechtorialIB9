package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Practice2 {
    public static void main(String[] args) {
        /*
        Create Arraylist to store 5 Fruit names
        print out stored element by using traditional fol loop
         */

        ArrayList fruit=new ArrayList();
        fruit.add("apple");
        fruit.add("banana");
        fruit.add("kiwi");
        fruit.add("cherry");
        fruit.add("orange");
        for (int i=0;i<fruit.size();i++){
            System.out.println(fruit.get(i));
        }
        printFruit(fruit);
//        Practice2.printFruit(fruit);
//        Practice2 object=new Practice2();
//         object.printFruit(fruit)




    }
    /*
      create a method that named as print as print fruit
      it takes an arraylist as parameter
      it prints only the element which has 5 or more characters
       */
    public static void printFruit(ArrayList<String> name){


        for (int i=0;i<name.size();i++){
           if(name.get(i).length()>=5){
               System.out.println(name.get(i));
           }
        }


    }



    }

