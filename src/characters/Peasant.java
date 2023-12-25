package characters;
// Крестьянин
public class Peasant extends Character {
    public Peasant(String name) {
        super(name, 50, 5, 7);
    }

    @Override
    public void attack() {
        System.out.println(name + " размахивает вилами.");
    }

    @Override
    public void defend() {
        System.out.println(name + " прячется за щитом.");
    }

    @Override
    public void heal() {
        System.out.println(name + " перевязывает раны.");
    }

    @Override
    public void specialAbility() {
        System.out.println(name + " не обладает никакими особыми способностями.");
    }

    @Override
    public String toString() {
        return "Крестьянин";
    }
}