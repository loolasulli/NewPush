package mentor13.Library;

public class Student extends LibraryUser {
    int count;

    public Student(String name, int userId, int count) {
        super(name, userId);
        this.count = count;
    }

    @Override
    int getMaxBooksAllowed() {
        System.out.println("Maximum books student can borrow: ");
        return count;
    }
}
