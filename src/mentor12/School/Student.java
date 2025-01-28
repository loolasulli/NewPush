package mentor12.School;

public class Student extends Person {
    private int grade;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Student(String name, int ID, int grade) {
        super(name, ID);
        this.grade = grade;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Grade: " + grade);
    }

    public void study() {
        System.out.println(name + " is studying.");
    }
}
