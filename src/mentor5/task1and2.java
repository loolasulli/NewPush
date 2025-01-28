package mentor5;

import java.util.Random;

public class task1and2 {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        Random random = new Random();
        int minNum = intArray[0];
        int maxNum = intArray[0];

        int total = 0;
        for (int i = 0; i < 10; i++) {
            intArray[i] = random.nextInt(0, 100);
            total += intArray[i];
            if (intArray[i] > maxNum) {
                maxNum = intArray[i];
            } else if (intArray[i] < minNum) {
                minNum = intArray[i];
            }
        }
        System.out.println("Max num: " + maxNum + " ; " + "Min num: " + minNum);
        for (int arr : intArray) {
            System.out.println(arr);
        }
        System.out.println("Total: " + total / intArray.length);
    }
}
