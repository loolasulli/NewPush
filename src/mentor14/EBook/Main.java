package mentor14.EBook;

public class Main {
    public static void main(String[] args) {
        EBookReader reader = new EBookReader();
        reader.download();
        reader.open();
        reader.close();
        reader.delete();
    }
}
