package mentor13.Employee;

public class Manager extends Employee implements Workable {
    double fixedBonus = 999;

    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    double getSalary() {
        return salary + fixedBonus;
    }

    @Override
    public void work() {
        System.out.println(name + " managing the team.");
    }
}
