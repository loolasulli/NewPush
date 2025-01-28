package mentor4;

import java.util.Random;

public class task4 {
    public static void main(String[] args) {
        Random random = new Random();

        while (true) {
            int num = random.nextInt (0,50);
            if (num % 2 == 0 && num > 25) {
                break;
            }
            System.out.println(num);
        }
    }
}
