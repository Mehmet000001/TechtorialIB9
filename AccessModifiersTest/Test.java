package AccessModifiersTest;

import AccessModifiers.Animal;

public class Test extends Animal {
    public static void main(String[] args) {
        Animal bird=new Animal();
        bird.speakPublic();
        bird.name="Tweeter";
        System.out.println(bird.name);
        Test bird2=new Test();
        bird2.gender="Female";
        System.out.println(bird2.gender);
        bird2.speakProtected(5.6);
    }
}
