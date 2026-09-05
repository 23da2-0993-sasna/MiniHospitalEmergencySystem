package hospital;

import java.util.Scanner;

public class Main {

    private static Scanner scanner =
            new Scanner(System.in);

    private static PatientBST patientBST =
            new PatientBST();

    private static EmergencyQueue emergencyQueue =
            new EmergencyQueue();

    private static TreatmentStack treatmentStack =
            new TreatmentStack();

    private static VisitHistory visitHistory =
            new VisitHistory();

    public static void main(String[] args) {

        boolean running = true;

        while (running) {

            displayMenu();

            int choice =
                    readInt("Enter your choice: ");

            if (choice == 0) {

                running = false;

            } else {

                System.out.println(
                        "Option selected: " + choice
                );
            }
        }

        scanner.close();
    }

    private static void displayMenu() {

        System.out.println();
        System.out.println("================================");
        System.out.println(" MINI HOSPITAL EMERGENCY SYSTEM");
        System.out.println("================================");

        System.out.println("1. Register Patient");
        System.out.println("2. Search Patient");
        System.out.println("3. Delete Patient");
        System.out.println("4. Display Patients");

        System.out.println("5. Add Emergency Patient");
        System.out.println("6. Treat Next Patient");
        System.out.println("7. Display Emergency Queue");

        System.out.println("8. Add Treatment");
        System.out.println("9. Remove Latest Treatment");
        System.out.println("10. Display Treatment History");

        System.out.println("11. Add Visit");
        System.out.println("12. Search Visit");
        System.out.println("13. Remove Visit");
        System.out.println("14. Display Visit History");

        System.out.println("0. Exit");
    }

    private static int readInt(String message) {

        System.out.print(message);

        return Integer.parseInt(
                scanner.nextLine()
        );
    }
}