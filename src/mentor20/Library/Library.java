package mentor20.Library;

public class Library {
    private int books = 3;


    public synchronized void borrow(int book) {
        if (book == 1 && books > 0) {
            books--;
            System.out.println(Thread.currentThread().getName() + " borrow " + book +
                    " book. Remaining books: " + books);
        } else if (book > 1) {
            System.out.println("You can only borrow 1 book!");
        } else {
            System.out.println("Not enough books");
        }
    }

    public int getBooks() {
        return books;
    }
}
