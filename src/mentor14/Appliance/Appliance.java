package mentor14.Appliance;

abstract public class Appliance {
    String name;
    int ID;

    public Appliance(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    abstract void turnOn();


    abstract void turnOff();
}
