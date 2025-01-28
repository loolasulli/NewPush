package mentor24;

import java.util.HashSet;

public class SetUnique {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(3);
        set1.add(5);
        set1.add(7);

        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);

        HashSet<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println("Union set: " + unionSet);

        HashSet<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        System.out.println("Intersection set: " + intersectionSet);
    }
}
