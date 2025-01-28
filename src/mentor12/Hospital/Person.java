package mentor12.Hospital;

public class Person {
    private String name;
    private int ID;
    private int age;

    public Person(String name, int ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void calculateFee() {
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + ID + ", age: " + age);
    }
}
