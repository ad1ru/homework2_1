public class HeroesFather extends HeroesGrandfather {
    public HeroesFather(String name, int age, Association association, SuperAbility superAbility) {
        super(name, age, association, superAbility);
    }

    final public void SavingPeople(){
        System.out.println(getName() + " спас много жизней");
    }
    public void SavingPeople(int amount){
        System.out.println("Опытный " + getName() + " спас " + amount + " жизней");
    }
}
