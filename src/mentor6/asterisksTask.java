package mentor6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class asterisksTask {
    public static void main(String[] args) {
        char[][] charArray = new char[4][4];
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray[i].length; j++) {
                System.out.println( "*");
            }
        }
    }
}


