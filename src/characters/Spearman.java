package characters;

public class Spearman extends Character {
    public Spearman(String name) {
        super(name, 80, 12, 8);
    }

    @Override
    public void attack() {
        System.out.println(name + " атакует копьем.");
    }

    @Override
    public void defend() {
        System.out.println(name + " стоит на защите со щитом.");
    }

    @Override
    public void heal() {
        System.out.println(name + " принимает зелье заживления.");
    }

    @Override
    public void specialAbility() {
        System.out.println(name + " использует мощный выпад.");
    }

    @Override
    public String toString() {
        return "Копейщик " + name + ". Здоровье: " + health + ". Сила: " + strength + ". Ловкость: " + agility;
    }
}
