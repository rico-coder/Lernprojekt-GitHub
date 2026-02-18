/*
Author: Rico Krenn
Created on: Wed Feb 4 2026 8:04:36 AM
Description: Noten
File: Subject.java
Workspace: Lernprojekt-GitHub
*/

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

    void removeGrade(int index) {
        if (index >= 0 && index < grades.size()) {
            grades.remove(index);
            System.out.println("Note wurde gelöscht.");
        } else {
            System.out.println("Ungültiger Index.");
        }
    }

    void showGrades() {
        if (grades.isEmpty()) {
            System.out.println("Keine Noten vorhanden.");
            return;
        }

        for (int i = 0; i < grades.size(); i++) {
            System.out.println(i + " - " + grades.get(i));
        }
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
