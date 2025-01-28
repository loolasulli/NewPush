package mentor11;

public class Main3 {
    public static void main(String[] args) {
       Student student = new Student("Jasmin", 4, 2);
       Student student1 = new Student("Mehru", 2, 2);
       Student student2 = new Student("Afina", 2, 3);
       Student[] students = {student, student1, student2};

       student.addGrade(0, 0, 99);
       student.addGrade(0, 1, 98);
       student.addGrade(1, 0, 97);
       student.addGrade(1, 1, 96);
       student.addGrade(2, 0, 95);
       student.addGrade(2, 1, 94);
       student.addGrade(3, 0, 93);
       student.addGrade(3, 1, 92);

       student1.addGrade(0, 0, 89);
       student1.addGrade(0, 1, 88);
       student1.addGrade(1, 0, 87);
       student1.addGrade(1, 1, 86);

       student2.addGrade(0, 0, 79);
       student2.addGrade(0, 1, 78);
       student2.addGrade(0, 2, 77);
       student2.addGrade(1, 0, 76);
       student2.addGrade(1, 1, 75);
       student2.addGrade(1, 2, 74);

       Exam exam = new Exam("Geometry", 100);
       Exam exam1 = new Exam("Physics", 100);

       for (Student student_: students) {
           System.out.println("Student ID: " + student_.getStudentId() +
                   "\nName: " + student_.getName() + "\nAverage grade: " +
                   student_.calculateAverageGrade());
          System.out.println("~  ~  ~  ~  ~");
       }

       System.out.println("Total students: " + Student.getTotalStudents());
    }
}
