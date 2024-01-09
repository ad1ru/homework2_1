public class HeroesGrandfather {
    private String name;
    private int age;
    private Association association;
    private SuperAbility superAbility;

    public HeroesGrandfather(String name, int age, Association association, SuperAbility superAbility) {
        this.name = name;
        this.age = age;
        this.association = association;
        this.superAbility = superAbility;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Association getAssociation() {
        return association;
    }

    public SuperAbility getSuperAbility() {
        return superAbility;
    }

    public String getInfo(){
        return "Name - " + name +
                "\nAge - " + age +
                "\nSuper Ability - " + superAbility +
                "\nAssociation name - " + association.getName() +
                "\nAssociation tier - " + association.getTier();
    }
}
