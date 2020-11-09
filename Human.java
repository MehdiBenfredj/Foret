package LivingSpecies.Humans;
import LivingSpecies.LivingSpecies;

public class Human extends LivingSpecies {

    public Human(String name, String familly, String kind) {
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
        return "I am breathing oxygen";
    }

    @Override
    public String eat() {
        return "Miam yaam...good food!";
    }

    public String speak(){
        return "Hello I am a: " + getName() + ". I am " + getKind() + ". My familly is: " + getFamilly();
    }
}
