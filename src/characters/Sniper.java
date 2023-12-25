package characters;

public class Sniper extends Character {
    public Sniper(String name) {
        super(name, 60, 10, 15);
    }

    @Override
    public void attack() {
        System.out.println(name + " производит точный выстрел из снайперской винтовки.");
    }

    @Override
    public void defend() {
        System.out.println(name + " находит укрытие, чтобы спрятаться.");
    }

    @Override
    public void heal() {
        System.out.println(name + " использует аптечку.");
    }

    @Override
    public void specialAbility() {
        System.out.println(name + " активирует режим невидимости.");
    }

    @Override
    public String toString() {
        return "Снайпер " + name + ". Здоровье: " + health + ". Сила: " + strength + ". Ловкость: " + agility;
    }
}