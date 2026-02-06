import java.util.ArrayList;

public class Subject {
    String name;
    ArrayList<Float> grades;


    Subject(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    void addGrade(float grade) {
        grades.add(grade);
    }

    float average() {
        float sum = 0f;

        for (Float grade : grades) {
            sum += grade;
        }
        float gradeAverage = sum / grades.size();
        return (float) Math.round(gradeAverage * 10) / 10;
    }

}
