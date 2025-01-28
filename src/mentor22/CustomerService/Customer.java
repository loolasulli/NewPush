package mentor22.CustomerService;

public class Customer {
    private String name;
    private int accountNumber;
    private int priority;

    public Customer(String name, int accountNumber, int priority) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                '}';
    }
}
