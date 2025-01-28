package mentor24;

import java.util.HashMap;
import java.util.Map;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Map<Integer, Person> map1 = new HashMap<>();
        map1.put(111, new Person("Lala", 28));
        map1.put(113, new Person("Gulsum", 26));
        map1.put(112, new Person("Aytac", 26));

        Map<Integer, Person> map2 = new HashMap<>();
        map2.put(115, new Person("Aysel", 24));
        map2.put(114, new Person("Shafiga", 25));

        Map<Integer, Person> totalMap = new HashMap<>(map1);
        totalMap.putAll(map2);

        for (Map.Entry<Integer, Person> entry: totalMap.entrySet()){
            System.out.println(entry);
        }
    }
}
