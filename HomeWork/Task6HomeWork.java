package HomeWork;

public class Task6HomeWork {
    public static void main(String[] args) {
        String str="Civic";
        String reverse="";
        for (int i=str.length()-1;i>=0;i--){
            reverse+=str.toLowerCase().charAt(i);


        }
        System.out.println(reverse);
    }
}
