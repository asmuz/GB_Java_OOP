package characters;
public class Wizard extends Character {
    public Wizard(String name) {
        super(name, 60, 8, 12);
    }

    @Override
    public void attack() {
        System.out.println(name + " производит магическую атаку.");
    }

    @Override
    public void defend() {
        System.out.println(name + " создает магический щит.");
    }

    @Override
    public void heal() {
        System.out.println(name + " использует заклинание исцеления.");
    }

    @Override
    public void specialAbility() {
        System.out.println(name + " вызывает огненный шар.");
    }

    @Override
    public String toString() {
        return "Колдун " + name + ". Здоровье: " + health + ". Сила: " + strength + ". Ловкость: " + agility;
    }
}
