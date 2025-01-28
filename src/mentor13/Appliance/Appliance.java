package mentor13.Appliance;

abstract public class Appliance {
    private String name;
    private int ID;

    public Appliance(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    void showDetails() {
        System.out.println("Name: " + name + ", ID: " + ID);
    }
}
