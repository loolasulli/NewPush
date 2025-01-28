package mentor24;

import java.util.HashSet;
import java.util.Objects;

public class UniqueTest {
    private String name;
    private int fin;

    public UniqueTest(int fin, String name) {
        this.fin = fin;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    @Override
    public String toString() {
        return "UniqueTest{" +
                "name='" + name + '\'' +
                ", fin=" + fin +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UniqueTest that = (UniqueTest) o;
        return fin == that.fin && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, fin);
    }

    public static void main(String[] args) {
        HashSet<Object> set = new HashSet<>();
        set.add(new UniqueTest(12345, "Lola"));
        set.add(new UniqueTest(12345, "Diana"));
        set.add(new UniqueTest(12345, "Diana"));

        System.out.println(set);
    }
}
