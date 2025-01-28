package mentor3;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();
        if (year > 0) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println("It's a leap year.");
            } else {
                System.out.println("It is not a leap year");
            }
        } else {
            System.out.println("Year cannot be negative");
        }
    }
}
