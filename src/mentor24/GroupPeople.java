package mentor24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupPeople {

    private static void addPeopleNames(HashMap<Integer, List<String>> map, String name, int age) {
        map.putIfAbsent(age, new ArrayList<>());
        map.get(age).add(name);
    }

    public static void main(String[] args) {
        HashMap<Integer, List<String>> groupAges = new HashMap<>();

        addPeopleNames(groupAges, "Lala", 28);
        addPeopleNames(groupAges, "Diana", 2);
        addPeopleNames(groupAges, "Mehru", 2);
        addPeopleNames(groupAges, "Gulsum", 26);
        addPeopleNames(groupAges, "Aytac", 26);

        for (Map.Entry<Integer, List<String>> entry : groupAges.entrySet()) {
            Integer age = entry.getKey();
            List<String> name = entry.getValue();
            System.out.println("Age: " + age + ", Names: " + name);
        }
    }
}
