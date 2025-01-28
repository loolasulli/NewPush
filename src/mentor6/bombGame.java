package mentor6;

import java.util.Arrays;
import java.util.Scanner;

public class bombGame {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int[][] intArray = new int[3][3];
        int rowNumber = scanner.nextInt();
        System.out.println("Please, add the row: ");
        int columnNumber = scanner.nextInt();
        System.out.println("Please, add the column: ");

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                intArray[i][j] = i + j;
                if (intArray[i][j] == 1);
            }
            System.out.println(Arrays.deepToString(intArray));

        }
    }
}

