package mentor22;

public class PriorityQueue {
    public static void main(String[] args) {
        java.util.PriorityQueue<Integer> numbers = new java.util.PriorityQueue<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(6);

        for (int number : numbers) {
            System.out.println(number);
        }

        java.util.PriorityQueue<String> things = new java.util.PriorityQueue<>();
        things.add("grapes");
        things.add("apples");
        things.add("oranges");

        for (String thing : things) {
            System.out.println(thing);
        }
    }
}
