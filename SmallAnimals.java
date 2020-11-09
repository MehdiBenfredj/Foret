package LivingSpecies.Animals.Small;

import LivingSpecies.LivingSpecies;

abstract public class SmallAnimals extends LivingSpecies {

    public SmallAnimals(String name, String familly, String kind) {
        super(name, familly, kind);
    }

    abstract public String hide();

}
