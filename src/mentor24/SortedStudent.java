package mentor24;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedStudent {
    public static void main(String[] args) {
        SortedMap<String, Integer> scores = new TreeMap<>();
        int lower = 50, upper = 90;

        scores.put("A", 75);
        scores.put("B", 45);
        scores.put("C", 55);
        scores.put("D", 65);
        scores.put("E", 95);

        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            if (entry.getValue() >= lower && entry.getValue() <= upper) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
