package mentor12.Hospital;

public class Patient extends Person {
    String type;
    String[] types = {"Regular", "Emergency", "Surgery"};

    public Patient(String name, int ID, int age, String type) {
        super(name, ID, age);
        this.type = type;
    }

    public  void calculateFee() {
        if (type == types[0]) {
            
        }
    }
}
