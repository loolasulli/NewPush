package mentor12.School;

public class Person {
    protected String name;
    protected int ID;

    public Person(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }


    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + ID);
    }
}
