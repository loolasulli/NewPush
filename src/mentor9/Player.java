package mentor9;

import javax.swing.*;
import java.util.Random;

public class Player {
    String name;
    int health;
    int coins;

    String[] inventory;

    public Player(String name) {
        this.name = name;
        health = 100;
        coins = 0;
        this.inventory = new String[10];
    }

    public void showStats() {
        System.out.println("Player stats: " + "\nPlayer's name: " + name + "; Health: " + health +
                "; Coins: " + coins);
    }

    public static void exploreRoom (Player player) {
        System.out.println("You enter a new room! ");
        Random random = new Random();
        int choice = random.nextInt(0, 3);

        switch (choice) {
            case 0:
                System.out.println("An enemy! 🧟‍♀️");
                player.health -= 15;
                break;
            case 1:
                System.out.println("A treasure! 🎁");
                player.coins += 15;
                break;
            case 2:
                System.out.println("Empty room! 🕳️");
                break;
            default:
                System.out.println("Invalid choice! ");
        }
    }

}


