package mentor12.School;

public class School {
    Teacher[] teachers = new Teacher[2];
    Student[] students = new Student[2];
    int teacherCount = 0;
    int studentCount = 0;

    public School() {
    }

    public School(Teacher[] teachers, Student[] students) {
        this.teachers = teachers;
        this.students = students;
    }

    public void addTeacher(Teacher teacher) {
        if(teacher != null && teacherCount < teachers.length) {
            teachers[teacherCount++] = teacher;
        } else {
            System.out.println("No empty place to add teacher");
        }
    }

    public void addStudent(Student student) {
        if(student != null && studentCount < students.length) {
            students[studentCount++] = student;
        } else {
            System.out.println("No empty place to add student");
        }
    }


    public void displayAllPeople() {
        System.out.println("Teachers: ");
        for (Teacher teacher: teachers) {
            teacher.displayInfo();
        }
        System.out.println("Students: ");
        for (Student student: students) {
            student.displayInfo();
        }
    }
}
