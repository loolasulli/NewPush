package mentor22;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DifferenceAL {
    public static void main(String[] args) {
        long startTime, endTime;
        List<String> arrayList = new ArrayList<>();
        startTime = System.nanoTime();
        arrayList.add("marakuyya");
        arrayList.add("mango");
        arrayList.add("blueberry");
        arrayList.add("pitaya");

        System.out.println("\nArrayList elements: ");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        arrayList.add(0, "granadilla");
        System.out.println("\nArrayList after adding: ");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        arrayList.remove(1);
        System.out.println("\nArrayList after remove: ");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        endTime = System.nanoTime();
        System.out.println("ArrayList took: " + (endTime - startTime) / 100000 + " ms");


        System.out.println("~~~   ~~~   ~~~   ~~~   ~~~   ~~~");



        List<String> linkedList = new LinkedList<>();
        linkedList.add("marakuyya");
        linkedList.add("mango");
        linkedList.add("blueberry");
        linkedList.add("pitaya");

        System.out.println("\nLinkedList elements: ");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        linkedList.add(0, "granadilla");
        System.out.println("\nLinkedList after adding: ");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        linkedList.remove(1);
        System.out.println("\nLinkedList after remove: ");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        endTime = System.nanoTime();
        System.out.println("LinkedList took: " + (endTime - startTime) / 100000 + " ms");
    }
}
