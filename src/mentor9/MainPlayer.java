package mentor9;

import java.util.Random;
import java.util.Scanner;

import static mentor9.Player.exploreRoom;

public class MainPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add your name: ");
        String name = scanner.nextLine();
        Player player = new Player(name);
        player.showStats();

        boolean gameRunning = true;
        while (gameRunning && player.health > 0) {
            System.out.println("You're exploring rooms. Choose one of them: \n1) move; 2) check stats;" +
                    " 3) exit game. ");

            String action = scanner.nextLine();

            switch (action) {
                case "move":
                    exploreRoom(player);
                    break;
                case "check stats":
                    player.showStats();
                    break;
                case "exit game":
                    System.out.println("Exiting the game! ");
                    gameRunning = false;
                    break;
                default:
                    System.out.println("Invalid action! ");
            }

            if (player.health <= 0) {
                System.out.println("Game over! \nFinal stats: ");
            }
            player.showStats();
        }
    }
}


