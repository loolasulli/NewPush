package mentor6;

import java.util.Arrays;
import java.util.Scanner;

public class charTask {
    public static void main(String[] args) {
        char[][] charArray = new char[3][8];
        int num = 66;

        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray[i].length; j++) {
                charArray[i][j] = (char) num++;
            }
            for (char[] numbers : charArray) {
                for (char nums : numbers) {
                    System.out.println(nums);
                }
                System.out.println(" --- ");
            }
        }
    }
}