package mentor12.Hospital;

public class Doctor extends Person {
    String specialization;
    String[] patients;

    public Doctor(String name, int ID, int age, String specialization) {
        super(name, ID, age);
        this.specialization = specialization;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization: " + specialization);
    }

    public void calculateFee(int hours) {
        int consultationFee = hours * 100;
        System.out.println(consultationFee);
    }
}
