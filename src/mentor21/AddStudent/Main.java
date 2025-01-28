package mentor21.AddStudent;

public class Main {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();

        sms.addStudent("Maggie", "maggie1@gmail.com", "0509999999", "A");
        sms.addStudent("Arthur", "arthur2@gmail.com", "0518888888", "C");

        sms.generateReport();

        Student student = sms.searchStudent("Arthur");
        if (student != null) {
            System.out.println("Student found: " + student);
        }

        sms.updateStudent("Arthur", "arthur1@gmail.com", "0708888888", "B");
        sms.generateReport();

        sms.concurrentUpdateDemo("Arthur", "A");
    }
}
