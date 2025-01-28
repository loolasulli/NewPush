package mentor16;

public class Throw {
    public static void main(String[] args) {
        int age = -1;

        try {
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be below 0");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
