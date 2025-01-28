package mentor12.School;

public class Main3 {
    public static void main(String[] args) {
        School school = new School();
        Teacher teacher1 = new Teacher("Anar", 1, "Java");
        Teacher teacher2 = new Teacher("Ramin", 2, "Java");
        Student student1 = new Student("Lala", 101, 5);
        Student student2 = new Student("Gulsum", 102, 6);

        school.addTeacher(teacher1);
        school.addTeacher(teacher2);
        school.addStudent(student1);
        school.addStudent(student2);
        school.displayAllPeople();
        System.out.println("~  ~  ~  ~");
        teacher1.teach();
        student1.study();
    }
}
