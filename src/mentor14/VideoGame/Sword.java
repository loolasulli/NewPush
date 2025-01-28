package mentor14.VideoGame;

public class Sword extends Weapon {

    public Sword(int damage, int range, String type) {
        super(damage, range, type);
    }

    @Override
    void use() {
        System.out.println("Use sword.. ");
    }
}
