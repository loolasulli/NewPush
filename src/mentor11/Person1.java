package mentor11;

import java.util.UUID;

public class Person1 {
    private final String id;
    private String name;
    private int age;
    private static int population = 0;

    public Person1(String id, String name, int age) {
        this.id = UUID.randomUUID().toString();
        population++;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("no empty name");
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Error");
        }
    }

    public static int getPopulation() {
        System.out.println("Population: " + population);
        return population;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void introduce() {
        System.out.println("Name: " + name + "\nAge: " + age + "\nID: " + id);
    }

}
