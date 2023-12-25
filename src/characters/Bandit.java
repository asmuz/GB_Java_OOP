package characters;

public class Bandit extends Character {
    public Bandit(String name) {
        super(name, 70, 8, 10);
    }

    @Override
    public void attack() {
        System.out.println(name + " наносит удар кинжалом.");
    }

    @Override
    public void defend() {
        System.out.println(name + " уклоняется от атак.");
    }

    @Override
    public void heal() {
        System.out.println(name + " использует зелье исцеления.");
    }

    @Override
    public void specialAbility() {
        System.out.println(name + " исчезает в тени.");
    }

    @Override
    public String toString() {
        return "Бандит " + name + ". Здоровье: " + health + ". Сила: " + strength + ". Ловкость: " + agility;
    }
}
