package mentor24;

import java.util.TreeMap;

public class SortedExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> sortedMap = new TreeMap<>();

        sortedMap.put(2, "granadilla");
        sortedMap.put(4, "pomelo");
        sortedMap.put(3, "kiwano");

        sortedMap.subMap(2, true, 4, false);
        System.out.println(sortedMap);
    }
}
