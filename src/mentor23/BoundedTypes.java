package mentor23;

public class BoundedTypes <T extends String> {
    private T names;

    public T getNames() {
        return names;
    }

    public void setNames(T names) {
        this.names = names;
    }

    public static void main(String[] args) {
        BoundedTypes<String> names = new BoundedTypes<>();
        names.setNames("Lola");

        System.out.println(names.getNames());
    }
}
