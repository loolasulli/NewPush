package mentor4;

import java.util.Scanner;

public class task3 {
    public static void main (String[] args) {
        System.out.println("Please, enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int product = 1;
        for (int i = 1; i <= 9; i++) {
            product = i * n;
            System.out.println(i + "*" + n + "=" + product);
        }
    }
}
