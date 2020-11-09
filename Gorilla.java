package LivingSpecies.Animals.Big;

import LivingSpecies.LivingSpecies;

public class Gorilla extends BigAnimals implements LovelyAnimals {
    public Gorilla(String name, String familly, String kind) {
        super(name, familly, kind);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getFamilly() {
        return familly;
    }

    @Override
    public String getKind() {
        return kind;
    }

    @Override
    public String breath() {
        return "The gorilla is breathing";
    }

    @Override
    public String eat() {
        return "The gorilla is eating.";
    }

    @Override
    public String kill() {
        return "The gorilla killed.";
    }

    @Override
    public String fight() {
        return "The gorilla is fighting";
    }


    @Override
    public String play() {
        return "The gorilla is a lovely player!";
    }

    @Override
    public String bogbog() {
        return null;
    }
}
