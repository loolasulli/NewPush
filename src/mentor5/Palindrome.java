package mentor5;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt(), numberDeyisen = number, reverseNumber = 0;

        while (numberDeyisen != 0) {
            int qaliq = numberDeyisen % 10;
            reverseNumber = reverseNumber * 10 + qaliq;
            numberDeyisen = numberDeyisen / 10;
        }

        if (number == reverseNumber) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}
