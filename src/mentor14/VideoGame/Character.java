package mentor14.VideoGame;

abstract public class Character {
    int health;
    int strength;
    String agility;

    abstract void attack();

    abstract void defend();

    abstract void completeQuest();
}
