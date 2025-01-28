package mentor23;

import java.util.ArrayList;
import java.util.List;

public class DifferenceGW {

    public static <T> void methodGeneric (List<T> list) {
        //list.add(list.get(0));
        System.out.println("Generic list: " + list);
    }

    public static void methodWildcard (List<?> list) {
        //list.add(1);
        System.out.println("Wildcard list: " + list);
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();

        stringList.add("purple");
        stringList.add("pink");
        stringList.add("red");

        integerList.add(18);
        integerList.add(11);
        integerList.add(2);

        methodGeneric(stringList);
        methodWildcard(stringList);

        methodGeneric(integerList);
        methodWildcard(integerList);
    }
}