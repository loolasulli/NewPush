package mentor21;

import java.util.Scanner;

public class StringLesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();

        System.out.println("Word's length: " + words.length() + "\nFirst 3 characters: " + words.substring(0, 3) +
                "\nUppercase: " + words.toUpperCase());

        if (words.startsWith("Hello")) {
            System.out.println("Word starts with 'Hello'.. ");
        }
    }
}
