package LivingSpecies.Animals.Big;

import LivingSpecies.LivingSpecies;

abstract public class BigAnimals extends LivingSpecies {
    public BigAnimals(String name, String familly, String kind) {
        super(name, familly, kind);
    }

    abstract public String kill();
    abstract public String fight();

}
