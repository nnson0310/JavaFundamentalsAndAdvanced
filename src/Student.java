import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Student {

    private int id;

    private String name;

    private float theoryScore;

    private float practiceScore;

    private static final DecimalFormat df = new DecimalFormat("0.0");

    public Student(int id, String name, float theoryScore, float practiceScore) {
        this.id = id;
        this.name = name;
        this.theoryScore = theoryScore;
        this.practiceScore = practiceScore;
    }

    public String calcScore() {
        df.setRoundingMode(RoundingMode.DOWN);
        return df.format((this.theoryScore + this.practiceScore*2)/3);
    }

    public void showStudentInfo() {
        System.out.println("Student id: " + id + "\nStudent name: " + name + "\nScore: " + calcScore());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getTheoryScore() {
        return theoryScore;
    }

    public void setTheoryScore(float theoryScore) {
        this.theoryScore = theoryScore;
    }

    public float getPracticeScore() {
        return practiceScore;
    }

    public void setPracticeScore(float practiceScore) {
        this.practiceScore = practiceScore;
    }
}
