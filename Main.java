import LivingSpecies.Animals.Big.BigAnimals;
import LivingSpecies.Animals.Big.Gorilla;
import LivingSpecies.Animals.Big.Tiger;
import LivingSpecies.Animals.Small.Cat;
import LivingSpecies.Humans.Human;

public class Main {
    public static void main(String[] args) {
        Gorilla gorilla1 = new Gorilla("Gogo", "Big animals", "Lovely nimal");
        Tiger tiger1 = new Tiger("Djajou", "Big animals", "Killer");
        Cat cat1 = new Cat("Miaws", "Small Animals", "Lovely animal");
        Human human1 = new Human("Mehdi", "Human", "human kind");


        System.out.println(gorilla1.breath());
        System.out.println(gorilla1.fight());
        System.out.println(tiger1.kill());
        System.out.println(cat1.hide());
        System.out.println(human1.speak());
        System.out.println(gorilla1.play());
        System.out.println(cat1.eat());



    }
}
