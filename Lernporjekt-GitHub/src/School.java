/*
Author: Rico Krenn
Created on: Wed Feb 4 2026 8:04:14 AM
Description: Noten
File: School.java
Workspace: Lernprojekt-GitHub
*/

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
