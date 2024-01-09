public class Main {
    public static void main(String[] args) {
        Association fatherAssociation = new Association("Pop-It", 1);
        Association heroAssociation = new Association("Superios", 2);

        HeroesFather heroesFather = new HeroesFather("Robb", 47, fatherAssociation, SuperAbility.LEVITATION);
        Hero hero = new Hero("Bobby", 23, heroAssociation, SuperAbility.SPEED);
        Hero hero2 = new Hero("Charlie", 18, heroAssociation, SuperAbility.LEVITATION);

        System.out.println(heroesFather.getInfo());
        heroesFather.SavingPeople();
        heroesFather.SavingPeople(41);

        System.out.println("-----------");

        System.out.println(hero.getInfo());
        hero.SavingPeople(20);

        System.out.println("-----------");

        System.out.println(hero2.getInfo());
        hero2.SavingPeople(9);
    }
}