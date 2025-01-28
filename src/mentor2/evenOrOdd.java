package mentor2;

import java.util.Random;

public class evenOrOdd {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(1, 100);
        System.out.println("Generate a random number between 1 and 100: " + number);
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}
