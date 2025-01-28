package mentor20.Library;

public class Books {
    public static void main(String[] args) throws InterruptedException {
        Library library = new Library();
        Thread student1 = new Thread(() -> library.borrow(1));
        Thread student2 = new Thread(() -> library.borrow(2));
        Thread student3 = new Thread(() -> library.borrow(1));
        Thread student4 = new Thread(() -> library.borrow(1));
        Thread student5 = new Thread(() -> library.borrow(1));

        Thread[] threads = new Thread[] {student1, student2, student3, student4, student5};
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
            threads[i].join();
        }

        System.out.println("Final books: " + library.getBooks());

    }
}
