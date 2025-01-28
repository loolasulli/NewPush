package mentor14.VideoGame;

public class MagicWand extends Weapon {

    public MagicWand(int damage, int range, String type) {
        super(damage, range, type);
    }

    @Override
    void use() {
        System.out.println("Use magic wand.. ");
    }
}
