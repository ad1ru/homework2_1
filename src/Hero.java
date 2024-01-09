public final class Hero extends HeroesFather {
    public Hero(String name, int age, Association association, SuperAbility superAbility) {
        super(name, age, association, superAbility);
    }

    public void SavingPeople(int amount){
        System.out.println("Неопытный " + getName() + " спас " + amount + " жизней");
    }
}
