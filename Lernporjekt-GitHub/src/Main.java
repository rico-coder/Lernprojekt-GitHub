public class Main {
    public static void main(String[] args) {
        School bms = new School("BMS");

        Subject mathe = new Subject("Mathe");
        Subject chemie = new Subject("Chemie");
        bms.addSubject(mathe);
        bms.addSubject(chemie);

        mathe.addGrade(5.5f);
        mathe.addGrade(4.5f);
        mathe.addGrade(4.5f);

        chemie.addGrade(5.0f);
        chemie.addGrade(5.0f);
        chemie.addGrade(4.0f);



        System.out.println("Schule: " + bms.name);
        System.out.println("---");

        for (Subject subject : bms.subjects) {
            System.out.println("Fach: " + subject.name);
            System.out.println("Noten: " + subject.grades);
            float roundGradeAverage = subject.average();
            System.out.println("Durchschnitt: " + roundGradeAverage);
            System.out.println("---");
        }
        float bmsAverage = bms.schoolAverage();
        System.out.println("Gesamtdurchschnitt: " + bmsAverage);

    }
}
