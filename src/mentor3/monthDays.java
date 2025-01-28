package mentor3;

import java.util.Scanner;

public class monthDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a month name: ");
        String monthName = scanner.nextLine();
        int monthDays;

        switch (monthName) {
            case "JANUARY", "MARCH", "MAY", "JULY", "AUGUST", "OCTOBER", "DECEMBER":
                monthDays = 31;
                break;

            case "APRIL", "JUNE", "SEPTEMBER", "NOVEMBER":
                monthDays = 30;
                break;

            case "FEBRUARY":
                monthDays = 28;
                break;

            default:
                monthDays = 0;

        };
        System.out.println("There are " + monthDays + " days in " + monthName);
    }
}
