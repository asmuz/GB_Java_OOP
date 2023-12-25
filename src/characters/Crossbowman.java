package characters;
public class Crossbowman extends Character {
    public Crossbowman(String name) {
        super(name, 65, 9, 10);
    }

    @Override
    public void attack() {
        System.out.println(name + " стреляет арбалетом.");
    }

    @Override
    public void defend() {
        System.out.println(name + " уклоняется от атак.");
    }

    @Override
    public void heal() {
        System.out.println(name + " использует аптечку.");
    }

    @Override
    public void specialAbility() {
        System.out.println(name + " прицеливается для сильной атаки.");
    }

    @Override
    public String toString() {
        return "Арбалетчик " + name + ". Здоровье: " + health + ". Сила: " + strength + ". Ловкость: " + agility;
    }
}