package mentor11;

import java.util.UUID;

public class Exam {
    private String examId;
    private String subject;
    private int maxMarks;

    public Exam(String subject, int maxMarks) {
        this.examId = UUID.randomUUID().toString();
        this.subject = subject;
        this.maxMarks = maxMarks;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }
}
