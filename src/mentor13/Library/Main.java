package mentor13.Library;

public class Main {
    public static void main(String[] args) {
        LibraryUser[] libraryUsers = new LibraryUser[3];
        libraryUsers[0] = new Student("Lala", 111, 3);
        libraryUsers[1] = new Student("Diana", 112, 3);
        libraryUsers[2] = new Teacher("Anar", 11, 10);

        for (LibraryUser libraryuser: libraryUsers) {
            System.out.println(libraryuser.userDetails());
            System.out.println(libraryuser.getMaxBooksAllowed());
        }
    }
}
