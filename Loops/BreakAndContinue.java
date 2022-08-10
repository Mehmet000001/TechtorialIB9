package Loops;

public class BreakAndContinue {
    public static void main(String[] args) {
        OUTER:
        for (int i=0;i<7;i++){
            INNER:
            for (int k=0;k<10;k++){
                if (k==3)//if run 3 times we have to do
                    break OUTER;///we do break label block which want to stop loop

                System.out.println(k);

            }
         }
        for (int i = 0; i <10 ; i++) {
            if (i>3&&i<7){
                continue;
            }
            System.out.println("i:"+i);

        }

    }
}
