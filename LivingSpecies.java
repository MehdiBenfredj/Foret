package LivingSpecies;

abstract public class LivingSpecies {
    public String name;
    public String familly;
    public String kind;

    public LivingSpecies(String name, String familly, String kind) {
        this.name = name;
        this.familly = familly;
        this.kind = kind;
    }

    abstract public String getName();

    abstract public String getFamilly();

    abstract public String getKind();

    abstract public String breath();

    abstract public String eat();

}
