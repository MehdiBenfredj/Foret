package LivingSpecies.Animals.Big;

import LivingSpecies.LivingSpecies;

public class Tiger extends BigAnimals {

    public Tiger(String name, String familly, String kind) {
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
        return "The tiger is breathing";
    }

    @Override
    public String eat() {
        return "The tiger is eating.";
    }

    @Override
    public String kill() {
        return "The tiger killed.";
    }

    @Override
    public String fight() {
        return "The tiger is fighting";
    }


}
