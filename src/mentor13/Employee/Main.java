package mentor13.Employee;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        Developer developer = new Developer("Linus", 12500);
        Developer developer1 = new Developer("Bill", 33000);
        Manager manager = new Manager("Steve", 9000);
        Manager manager1 = new Manager("Elon", 8000);
        Manager manager2 = new Manager("Jeff", 7000);

        company.addDevelopers(developer);
        company.addDevelopers(developer1);
        company.addManagers(manager);
        company.addManagers(manager1);
        company.addManagers(manager2);

        company.calculateTotalSalary();
        developer.work();
        manager.work();

    }
}
