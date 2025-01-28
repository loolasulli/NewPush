package mentor16;

public class Unchecked {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        try {
            throw new ArrayIndexOutOfBoundsException("Out of bounds");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Hello");
        }
    }
}
