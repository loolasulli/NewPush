package mentor4;

public class task1 {
    public static void main (String[] args) {
        int number = 0;
        int total = 0;
        while (number < 20) {
            number++;
            if (number % 2 != 0) {
                total += number;
            }
        }
        System.out.println("Total: " + total);

    }
}
