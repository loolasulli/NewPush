package mentor13.Library;

public class Teacher extends LibraryUser {
    int count;

    public Teacher(String name, int userId, int count) {
        super(name, userId);
        this.count = count;
    }

    @Override
    int getMaxBooksAllowed() {
        System.out.println("Maximum books teacher can borrow: ");
        return count;

    }
}
