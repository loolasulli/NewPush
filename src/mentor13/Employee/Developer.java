package mentor13.Employee;

public class Developer extends Employee implements Workable {

    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    double getSalary() {
        return salary;
    }

    @Override
    public void work() {
        System.out.println(name + " writing code..");
    }

}
