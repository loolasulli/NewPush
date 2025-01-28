package mentor3;

import java.util.Scanner;

public class threeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers. First a: ");
        int a = scanner.nextInt();
        String A = "a(" + a + ")";
        System.out.println("b: ");
        int b = scanner.nextInt();
        String B = "b(" + b + ")";
        System.out.println("c: ");
        int c = scanner.nextInt();
        String C = "c(" + c + ")";
        if (a == b && b == c) {
            System.out.println(A + "=" + B + "=" + C);
        } else if (a == b) {
            System.out.println(A + "=" + B + "≠" + C);
        } else if (a == c) {
            System.out.println(A + "=" + C + "≠" + B);
        } else if (b == c) {
            System.out.println(B + "=" + C + "≠" + A);
        } else {
            System.out.println(A + "≠" + B + "≠" + C);
        }
    }
}
