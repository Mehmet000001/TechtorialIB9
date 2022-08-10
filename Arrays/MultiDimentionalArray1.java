package Arrays;

import java.util.Arrays;

public class MultiDimentionalArray1 {
    public static void main(String[] args) {
        String[] cities={"chicago","Denver","St. Louis","Colombus"};
        String[][] states={{"IL","MO","CA"},{"LA","NC"},{"TX","PA"},{"NY"}};
        System.out.println(Arrays.deepToString(states));
        System.out.println(states[3][0]);
        for (String[] str:states){
           // System.out.println(Arrays.toString(str));
            for (String st:str){
                System.out.println(st);
            }
        }
        for (int x=0;x<states.length;x++){////second way
            for (int y=0;y<states[x].length;y++){
                System.out.println(states[x][y]);
            }
        }

    }
}
