package mentor23.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Pasient> pasients = new PriorityQueue<>(new Comparator<Pasient>() {
            @Override
            public int compare(Pasient o1, Pasient o2) {
                return Integer.compare(o1.getEmergencies(), o2.getEmergencies());
            }
        });
        Pasient pasient1 = new Pasient("Pasient1", 2);
        Pasient pasient2 = new Pasient("Pasient2", 3);
        Pasient pasient3 = new Pasient("Pasient3", 1);

        pasients.add(pasient1);
        pasients.add(pasient2);
        pasients.add(pasient3);

        while(!pasients.isEmpty()) {
            Pasient pasient = pasients.poll();
            System.out.println(pasient);
        }
    }
}