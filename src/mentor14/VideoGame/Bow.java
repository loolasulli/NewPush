package mentor14.VideoGame;

public class Bow extends Weapon {

    public Bow(int damage, int range, String type) {
        super(damage, range, type);
    }

    @Override
    void use() {
        System.out.println("Use bow.. ");
    }
}
