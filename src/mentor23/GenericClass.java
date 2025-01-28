package mentor23;

import java.util.ArrayList;
import java.util.List;

public class GenericClass<T> {
    List<T> elements = new ArrayList<>();

    public List<T> getElements() {
        return elements;
    }

    public void setElements(List<T> elements) {
        this.elements = elements;
    }

    public void sendTypes(T element) {
        elements.add(element);
    }

    public static void main(String[] args) {
        GenericClass<String> names = new GenericClass<>();
        names.sendTypes("Lola");
        names.sendTypes("Diana");
        names.sendTypes("Ashraf");

        GenericClass<Integer> numbers = new GenericClass<>();
        numbers.sendTypes(18);
        numbers.sendTypes(11);
        numbers.sendTypes(2);

        System.out.println(names.getElements() + "\n" + numbers.getElements());
    }
}
