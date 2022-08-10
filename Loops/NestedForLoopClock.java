package Loops;

public class NestedForLoopClock {
    public static void main(String[] args) {
        ///print seconds minutes and hours
        ///-for the hours from 1 to 12
        /// hour 1
        //1,2,3,...minutes
        //2
        //1,2.........
        for (int hour=0;hour<12;hour++){

            for (int min=0;min<60;min++){

                for (int sec=0;sec<60;sec++){
                    System.out.println(hour+":"+min+":" + sec);

                }
            }
        }



    }
}
