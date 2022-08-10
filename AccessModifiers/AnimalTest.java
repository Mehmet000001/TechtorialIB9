package AccessModifiers;

public class AnimalTest {
    public static void main(String[] args) {
        Animal cat1=new Animal();
        System.out.println(cat1.age);
      cat1.speakDefault("English");
      cat1.speakPublic();
    }
}
