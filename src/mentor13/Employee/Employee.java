package mentor13.Employee;

public abstract class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract double getSalary();

    void displayInfo() {
        System.out.println("Name: " + name + ", salary: " + salary);
    }
}
