package mentor1;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add day: ");
        int day = scanner.nextInt();
        int weeks = day / 7;
        int months = day / 30;
        int years = day / 365;
        System.out.println("Convert a days into months, weeks and years: " + "Years:" + years + ", Months:" +
                months + ", Weeks:" + weeks);

    }
}
