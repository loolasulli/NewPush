package mentor30;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibrarySystem {
    private static List<Book> books;
    private static List<User> users;
    private Scanner scanner;

    public LibrarySystem(List<Book> books, List<User> users, Scanner scanner) {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void addBook() {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Author: ");
        String author = scanner.nextLine();
        System.out.print("Year: ");
        int year = scanner.nextInt();
        System.out.print("Available copies: ");
        int copies = scanner.nextInt();
        scanner.nextLine();
        books.add(new Book(title, author, year, copies));
        System.out.println("Book added.. ");
    }

    public void listBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void registerUser() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        users.add(new User());
        System.out.println("Register user.. ");
    }

    public void listUsers() {
        for (User user : users) {
            System.out.println(user);
        }
    }

    public void borrowBook() {
        System.out.print("Enter book's ID: ");
        String bookId = scanner.nextLine();
        scanner.nextLine();
        for (Book book : books) {
            if (book.getUniqueID() == bookId) {
                System.out.println("Book borrowed.. ");
            } else {
                    System.out.println("Not available.. ");
                }
                return;
            }
        System.out.println("Book not found.. ");
    }

    public void returnBook() {
        System.out.print("Enter book's ID: ");
        String bookId = scanner.nextLine();
        scanner.nextLine();
        for (Book book : books) {
            if (book.getUniqueID() == bookId) {
                System.out.println("Returned book..");
                return;
            }
        }
        System.out.println("Not found.. ");
    }

    public void searchBookByName() {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println(book);
                return;
            }
        }
        System.out.println("Not found.. ");
    }


    public void removeUserByEmail() {
        System.out.print("Enter user's ID: ");
        String userId = scanner.nextLine();
        scanner.nextLine();
        users.removeIf(user -> user.getUniqueID() == userId);
        System.out.println("Deleted user..");
    }

    public void menuLibrary() {
        while (true) {
            System.out.println("\n1. Add book\n2. List books\n3. Register User\n4. " +
                    "List Users\n5. Borrow book\n6. Return book\n7. Find book\n8. Delete User\n9. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> addBook();
                case 2 -> listBooks();
                case 3 -> registerUser();
                case 4 -> listUsers();
                case 5 -> borrowBook();
                case 6 -> returnBook();
                case 7 -> searchBookByName();
                case 8 -> removeUserByEmail();
                case 9 -> {
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Error.. ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("\uD83D\uDCDA Library Management System");
        new LibrarySystem(books, users, new Scanner(System.in)).menuLibrary();
    }
}






