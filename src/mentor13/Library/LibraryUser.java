package mentor13.Library;

abstract public class LibraryUser {
    private String name;
    private int userId;

    public LibraryUser(String name, int userId) {
        this.name = name;
        this.userId = userId;
    }

    abstract int getMaxBooksAllowed();

    String userDetails() {
        return "User's name: " + name + ", User ID: " + userId;
    }
}
