package mentor14.EBook;

public class EBookReader implements Readable, Downloadable {
    @Override
    public void download() {
        System.out.println("EBook download started 📥");
    }

    @Override
    public void delete() {
        System.out.println("EBook deleted ❌");
    }

    @Override
    public void open() {
        System.out.println("EBook is opened 📖");
    }

    @Override
    public void close() {
        System.out.println("EBook is closed ❌");
    }
}
