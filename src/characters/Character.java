package characters;

public abstract class Character {
    protected String name;
    protected int health;
    protected int strength;
    protected int agility;

    public Character(String name, int health, int strength, int agility) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.agility = agility;
    }

    public abstract void attack();

    public abstract void defend();

    public abstract void heal();

    public abstract void specialAbility();
}
