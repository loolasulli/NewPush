package mentor2;

import java.util.Scanner;

public class doesDogBark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, write answers to questions:");
        System.out.println("Question1: Does dog bark?");
        String isBarking = scanner.nextLine();

        System.out.println("Question2: Is it night?");
        String isNight = scanner.nextLine();
        if (isBarking.equals("yes")) {
            if (isNight.equals("yes")) {
                System.out.println("Go check what has happened.");
            } else {
                System.out.println("Dog is hungry.");
            }
        } else {
            System.out.println("Life is beautiful.");
        }
    }
}
