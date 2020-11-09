package LivingSpecies.Animals.Small;

import LivingSpecies.Animals.Big.LovelyAnimals;
import LivingSpecies.LivingSpecies;

public class Cat extends SmallAnimals implements LovelyAnimals {
    public Cat(String name, String familly, String kind) {
        super(name, familly, kind);
    }

    @Override
    public String hide() {
        return "The cat is hidden";
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
        return "The cat is breathing";
    }

    @Override
    public String eat() {
        return "Soft milk <3...";
    }


    @Override
    public String play() {
        return "Le chat joue";
    }

    @Override
    public String bogbog() {
        return null;
    }
}
