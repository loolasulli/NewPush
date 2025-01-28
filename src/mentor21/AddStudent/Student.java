package mentor21.AddStudent;

public class Student {
    private String name;
    private String email;
    private String phone;
    private String grades;

    public Student(String name, String email, String phone, String grades) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", grades='" + grades + '\'' +
                '}';
    }
}

