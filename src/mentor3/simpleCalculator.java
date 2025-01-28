package mentor3;

import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.println("Select an operation: (+, -, *, /) ");
        char operator = scanner.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("Result: " + (number1 + number2));
                break;
            case '-':
                System.out.println("Result: " + (number1 - number2));
                break;
            case '*':
                System.out.println("Result: " + (number1 * number2));
                break;
            case '/':
                System.out.println("Result: " + (number1 / number2));
                break;
            default:
                System.out.println("Error");

        }
    }
}
