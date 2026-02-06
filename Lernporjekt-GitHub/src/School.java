import java.util.ArrayList;

public class School {
    String name;
    ArrayList<Subject> subjects;

    School(String name) {
        this.name = name;
        subjects = new ArrayList<>();
    }

    void addSubject(Subject subject) {
        subjects.add(subject);
    }

    float schoolAverage() {
        float sum = 0f;
        for (Subject subject : subjects) {
            sum += subject.average();
        }
        return sum / subjects.size();
    }
}
