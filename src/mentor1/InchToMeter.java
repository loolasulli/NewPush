package mentor1;

import java.util.Scanner;

public class InchToMeter {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add a number: ");
        int inch = scanner.nextInt();
        double meters = 0.0254;
        double meter = inch * meters;
        System.out.println("Converts it into meters: " + meter);
    }
}
