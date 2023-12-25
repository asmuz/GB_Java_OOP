package characters;

public class Monk extends Character {
    public Monk(String name) {
        super(name, 70, 10, 12);
    }

    @Override
    public void attack() {
        System.out.println(name + " использует боевое искусство.");
    }

    @Override
    public void defend() {
        System.out.println(name + " медитирует, уклоняясь от ударов.");
    }

    @Override
    public void heal() {
        System.out.println(name + " лечит раны с помощью целительных знаний.");
    }

    @Override
    public void specialAbility() {
        System.out.println(name + " вызывает внутреннюю силу для защиты.");
    }

    @Override
    public String toString() {
        return "Монах " + name + ". Здоровье: " + health + ". Сила: " + strength + ". Ловкость: " + agility;
    }
}
