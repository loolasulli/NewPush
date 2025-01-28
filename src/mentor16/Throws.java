package mentor16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Throws {
    public static void main(String[] args) {
        try {
            method();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

        static void method () throws IOException {
            BufferedReader br = new BufferedReader(new FileReader("filepath"));
            String line = br.readLine();
        }
    }

