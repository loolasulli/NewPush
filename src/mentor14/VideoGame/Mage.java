package mentor14.VideoGame;

public class Mage extends Character {

    @Override
    void attack() {
        System.out.println("Mage attacking.. ");
    }

    @Override
    void defend() {
        System.out.println("Defending..");
    }

    @Override
    void completeQuest() {
        System.out.println("Complete quest..");
    }
}
