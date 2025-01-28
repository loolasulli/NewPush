package mentor9;

import java.util.Scanner;

public class MainCodeLand {
    public static void main(String[] args) {
        System.out.println("Add your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
//        Character player = new Character(name);
//        player.toString();
        int[][] map = {
                {0, 1, 0, 0},
                {2, 0, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 2}
        };

        boolean gameRunning = true;
        int x = 0, y = 0;

        while (gameRunning) {
            System.out.println("You're in this location: " + x + ", " + y);
            int counter = map[x][y];
            switch (counter) {
                case 1:
                    System.out.println("A treasure! 🎁");
                    break;
                case 2:
                    System.out.println("An enemy! 🧟‍♀️");
                    break;
                default:
                    System.out.println("Empty zone! ");
            }
            }
        }
    }
