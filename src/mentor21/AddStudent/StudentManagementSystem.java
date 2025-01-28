package mentor21.AddStudent;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentManagementSystem {
    List<Student> students = new ArrayList<>();

    static Pattern email1 = Pattern.compile("^[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$");

    public static boolean validateEmail(String email) {
        if (email == null) {
            return false;
        }

        Matcher matcher = email1.matcher(email);
        return matcher.matches();
    }

    static Pattern phone1 = Pattern.compile("^(05[0-3,5-9]{1}[0-9]{6})$");

    public static boolean validatePhoneNumber(String phone) {
        if (phone == null) {
            return false;
        }

        Matcher matcher = phone1.matcher(phone);
        return matcher.matches();
    }

    void addStudent(String name, String email, String phone, String grades) {
        students.add(new Student(name, email, phone, grades));
    }

    Student searchStudent(String name) {
        for (Student student : students) {
            if (student.getName().trim().equalsIgnoreCase(name.trim())) {
                return student;
            }
        }
        System.out.println("Not found..");
        return null;
    }

    void updateStudent(String name, String newEmail, String newPhone, String newGrades) {
        Student student = searchStudent(name);
        if (student != null) {
            student.setEmail(newEmail);
            student.setPhone(newPhone);
            student.setGrades(newGrades);
        System.out.println("Updated version: " + student);
    }
}

    void generateReport() {
        StringBuilder report = new StringBuilder();
        for (Student student: students) {
            report.append(student.toString());
        }
        System.out.println(report.toString());
    }

    void concurrentUpdateDemo(String name, String newGrades) {
        Student student = searchStudent(name);
        if (student != null) {
            Thread t1 = new Thread(() -> {
                String oldGrades = student.getGrades();
                student.setGrades(newGrades);
                System.out.println(Thread.currentThread().getName() + " updated from: " + oldGrades +
                        ", new: " + student.getGrades());
            });

            Thread t2 = new Thread(() -> {
                String oldGrades = student.getGrades();
                student.setGrades(newGrades);
                System.out.println(Thread.currentThread().getName() + " updated from: " + oldGrades +
                        ", new: " + student.getGrades());
            });

            t1.start();
            t2.start();


            try {
                t1.join();
                t2.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
