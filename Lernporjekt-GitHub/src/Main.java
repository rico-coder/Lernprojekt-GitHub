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

            }  else if (choice == 0) {
                running = false;
                System.out.println("Programm beendet.");
            }
        }

        scanner.close();
    }
}
