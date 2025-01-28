package mentor5;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        String[] namesArray = new String[3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add the name of the last book you read: ");
        String nameOfBooks = namesArray[0] = scanner.nextLine();
        System.out.println("Add the author of the last book you read : ");
        String author = namesArray[1] = scanner.nextLine();
        System.out.println("Add the year of publication of the last book you read : ");
        String yearOfPublication = namesArray[2] = scanner.nextLine();

        System.out.println("---------------------");
        System.out.println("Title: " + namesArray[0] + "\nAuthor: " + namesArray[1] + "\nYear: " + namesArray[2]);
    }
}
