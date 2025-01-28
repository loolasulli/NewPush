package mentor13.Employee;

public class Company {
    Developer[] developers;
    Manager[] managers;
    double totalSalaryDevelopers = 0;
    double totalSalaryManagers = 0;
    int managerCount = 0;
    int developerCount = 0;

    public Company() {
        developers = new Developer[2];
        managers = new Manager[3];
    }

    void addManagers (Manager manager) {
        if (manager != null && managerCount < managers.length) {
            managers[managerCount++] = manager;
        } else {
            System.out.println("No empty place to add manager.");
        }
    }

    void addDevelopers (Developer developer) {
        if (developer != null && developerCount < developers.length) {
            developers[developerCount++] = developer;
        } else {
            System.out.println("No empty place to add developer.");
        }
    }


    double calculateTotalSalaryDevelopers() {
        for (Developer developer: developers) {
            totalSalaryDevelopers += developer.getSalary();
        }
        return totalSalaryDevelopers;
    }
    double calculateTotalSalaryManagers() {
        for (Manager manager: managers) {
            totalSalaryManagers += manager.getSalary();
        }
        return totalSalaryManagers;
    }


    double calculateTotalSalary() {
        return totalSalaryManagers + totalSalaryDevelopers;
    }
}