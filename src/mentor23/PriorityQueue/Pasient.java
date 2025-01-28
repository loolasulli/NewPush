package mentor23.PriorityQueue;

public class Pasient {
    private String name;
    private int emergencies;

    public Pasient(String name, int emergencies) {
        this.name = name;
        this.emergencies = emergencies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmergencies() {
        return emergencies;
    }

    public void setEmergencies(int emergencies) {
        this.emergencies = emergencies;
    }

    @Override
    public String toString() {
        return "PriorityQueue{" +
                "name='" + name + '\'' +
                '}';
    }
}
