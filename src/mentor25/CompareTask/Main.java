package mentor25.CompareTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student2 = new Student("Lola", 28);
        Student student1 = new Student("Rana", 24);
        students.add(student1);
        students.add(student2);
        Collections.sort(students);

        List<Student> students1 = new ArrayList<>();
        Student student3 = new Student("Aytac", 26);
        Student student4 = new Student("Aysel", 24);
        students1.add(student3);
        students1.add(student4);
        Collections.sort(students1, new StudentComparator());

        for (Student student: students) {
            System.out.println(student);
        }

        System.out.println("----------------------------");

        for (Student s: students1) {
             System.out.println(s);
          }
    }
}
