package mentor11;

import java.util.Arrays;
import java.util.UUID;

public class Student {
    private String studentId;
    private String name;
    private int[][] grades;

    static int totalStudents = 0;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[][] getGrades() {
        return grades;
    }

    public void setGrades(int[][] grades) {
        this.grades = grades;
    }

    public Student() {
        this.name = null;
        this.studentId = UUID.randomUUID().toString();
        this.grades = new int[0][0];
        totalStudents++;
    }

    public Student(String name, int subjectIndex, int assessmentIndex) {
        this.name = name;
        this.studentId = UUID.randomUUID().toString();
        this.grades = new int[subjectIndex][assessmentIndex];
        totalStudents++;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    public void addGrade(int subjectIndex, int assessmentIndex, int grade) {
        if (subjectIndex >= 0 && subjectIndex < grades.length && assessmentIndex >= 0 &&
                assessmentIndex < grades[subjectIndex].length) {
            grades[subjectIndex][assessmentIndex] = grade;
        } else {
            System.out.println("Error");
        }
    }

    public double calculateAverageGrade() {
        int totalGrades = 0;
        int totalAssessments = 0;
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                totalGrades += grades[i][j];
                totalAssessments++;
            }
        }
        if (totalAssessments == 0) {
            return 0.0;
        } else {
            return (double) totalGrades / totalAssessments;
        }
    }
}
