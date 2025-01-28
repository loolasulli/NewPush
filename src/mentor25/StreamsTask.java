package mentor25;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamsTask {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "baux", "alex", "box");

        Predicate<String> filtered = (word) -> word.startsWith("b") && word.endsWith("x");

        for (String f : words) {
            if (filtered.test(f)) {
                System.out.println(f);
            }
        }
    }
}