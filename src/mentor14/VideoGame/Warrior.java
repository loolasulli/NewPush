package mentor14.VideoGame;

public class Warrior extends Character {

    @Override
    void attack() {
        System.out.println("Warrior attacking.. ");
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
