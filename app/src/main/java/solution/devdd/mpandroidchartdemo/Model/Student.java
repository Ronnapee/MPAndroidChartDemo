package solution.devdd.mpandroidchartdemo.Model;

import java.util.ArrayList;

public class Student {
    float score;
    String name;

    public Student(float score, String name) {
        this.score = score;
        this.name = name;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ArrayList<Student> getSampleStudentData(int size) {
        ArrayList<Student> student = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            student.add(new Student((float) Math.random() * 100, "Android v"+i));
        }
        return student;
    }
}
