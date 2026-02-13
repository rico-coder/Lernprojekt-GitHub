import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        School school = new School("BBW");

        boolean running = true;

        while (running) {

            System.out.println("\n--- MENÜ ---");
            System.out.println("1 - Fach hinzufügen");
            System.out.println("2 - Note hinzufügen");
            System.out.println("3 - Alle Fächer anzeigen");
            System.out.println("4 - Gesamtdurchschnitt anzeigen");
            System.out.println("0 - Beenden");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Name des Fachs: ");
                String subjectName = scanner.nextLine();

                Subject subject = new Subject(subjectName);
                school.addSubject(subject);

                System.out.println("Fach hinzugefügt.");

            } else if (choice == 2) {
                System.out.println("Fächer:");
                for (Subject subject : school.subjects){
                    System.out.println(subject.name);
                }

                System.out.print("Name des Fachs: ");
                String subjectName = scanner.nextLine();

                Subject found = null;

                for (Subject subject : school.subjects) {
                    if (subject.name.equals(subjectName)) {
                        found = subject;
                    }
                }

                if (found != null) {
                    System.out.print("Note eingeben: ");
                    float grade = scanner.nextFloat();
                    scanner.nextLine();

                    found.addGrade(grade);
                    System.out.println("Note hinzugefügt.");
                } else {
                    System.out.println("Fach nicht gefunden.");
                }

            } else if (choice == 3) {

                for (Subject subject : school.subjects) {
                    System.out.println("Fach: " + subject.name);
                    System.out.println("Noten: " + subject.grades);
                    System.out.println("Durchschnitt: " + subject.average());
                }

            } else if (choice == 4) {

                if (!school.subjects.isEmpty()) {
                    System.out.println("Gesamtdurchschnitt: " + school.schoolAverage());
                } else {
                    System.out.println("Keine Fächer vorhanden.");
                }

            } else if (choice == 0) {
                running = false;
                System.out.println("Programm beendet.");
            }
        }

        scanner.close();
    }
}
