package mentor24;

import java.util.HashMap;
import java.util.Scanner;

public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userAnswer = scanner.nextLine();

        HashMap<Character, Integer> freaquencyCounter = new HashMap<>();

        for (char c: userAnswer.toLowerCase().toCharArray()) {
            freaquencyCounter.put(c, freaquencyCounter.getOrDefault(c, 0) + 1);
        }
        System.out.println(freaquencyCounter);
    }
}
