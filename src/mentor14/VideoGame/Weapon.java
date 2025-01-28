package mentor14.VideoGame;

abstract public class Weapon {
    int damage;
    int range;
    String type;


    public Weapon(int damage, int range, String type) {
        this.damage = damage;
        this.range = range;
        this.type = type;
    }

    abstract void use();

}
