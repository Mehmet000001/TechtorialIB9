package AccessModifiers;

public class Animal {
    public String name;
    private String color;
    protected String gender;
    int age;
    public  void speakPublic(){
        System.out.println("Animal is speaking");
    }
    private void speakPrivate(int hours){

    }
    protected void speakProtected(double energy){

    }
    void speakDefault(String language){
        System.out.println("animal is speaking Default language");
    }

    public static void main(String[] args) {
        Animal animal=new Animal();
        System.out.println(animal.color);///null bc no assign

    }

    }
    class  example{
    public static void main(String[] args) {
        Animal animal2=new Animal();
        animal2.speakProtected(3.4);

    }
}
