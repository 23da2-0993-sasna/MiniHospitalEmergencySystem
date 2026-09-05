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

        System.out.println();
        System.out.println("==========================================");
        System.out.println("     MINI HOSPITAL EMERGENCY SYSTEM");
        System.out.println("==========================================");

        while (running) {

            displayMenu();

            int choice =
                    readInt("Enter your choice: ");

            switch (choice) {

                case 1:
                    registerPatient();
                    break;

                case 2:
                    searchPatient();
                    break;

                case 3:
                    deletePatient();
                    break;

                case 4:
                    displayPatients();
                    break;

                case 5:
                    addEmergencyPatient();
                    break;

                case 6:
                    treatNextPatient();
                    break;

                case 7:
                    displayEmergencyQueue();
                    break;

                case 8:
                    addTreatment();
                    break;

                case 9:
                    removeLatestTreatment();
                    break;

                case 10:
                    displayTreatmentHistory();
                    break;

                case 11:
                    addVisit();
                    break;

                case 12:
                    searchVisit();
                    break;

                case 13:
                    removeVisit();
                    break;

                case 14:
                    displayVisitHistory();
                    break;

                case 0:

                    running = false;

                    System.out.println(
                            "\nHospital system closed."
                    );

                    break;

                default:

                    System.out.println(
                            "\nInvalid choice. Try again."
                    );
            }
        }

        scanner.close();
    }

    // ==========================================
    // MENU
    // ==========================================

    private static void displayMenu() {

        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("                 MAIN MENU");
        System.out.println("------------------------------------------");

        System.out.println("1.  Register Patient");
        System.out.println("2.  Search Patient");
        System.out.println("3.  Delete Patient");
        System.out.println("4.  Display All Patients");

        System.out.println("5.  Add Emergency Patient");
        System.out.println("6.  Treat Next Patient");
        System.out.println("7.  Display Emergency Queue");

        System.out.println("8.  Add Treatment Record");
        System.out.println("9.  Remove Latest Treatment");
        System.out.println("10. Display Treatment History");

        System.out.println("11. Add Patient Visit");
        System.out.println("12. Search Patient Visit");
        System.out.println("13. Remove Patient Visit");
        System.out.println("14. Display Patient Visit History");

        System.out.println("0.  Exit");

        System.out.println("------------------------------------------");
    }

    // ==========================================
    // PATIENT BST
    // ==========================================

    private static void registerPatient() {

        System.out.println();
        System.out.println("--- Register Patient ---");

        int patientId =
                readInt("Patient ID: ");

        if (patientBST.search(patientId) != null) {

            System.out.println(
                    "Patient ID already exists."
            );

            return;
        }

        String name =
                readString("Patient Name: ");

        int age =
                readInt("Age: ");

        String contact =
                readString("Contact Number: ");

        String condition =
                readString("Medical Condition: ");

        Patient patient =
                new Patient(
                        patientId,
                        name,
                        age,
                        contact,
                        condition
                );

        patientBST.insert(patient);

        System.out.println(
                "Patient registered successfully."
        );
    }

    private static void searchPatient() {

        System.out.println();
        System.out.println("--- Search Patient ---");

        int patientId =
                readInt("Patient ID: ");

        Patient patient =
                patientBST.search(patientId);

        if (patient == null) {

            System.out.println(
                    "Patient not found."
            );

        } else {

            System.out.println();
            System.out.println("Patient found:");
            System.out.println(patient);
        }
    }

    private static void deletePatient() {

        System.out.println();
        System.out.println("--- Delete Patient ---");

        int patientId =
                readInt("Patient ID: ");

        boolean deleted =
                patientBST.delete(patientId);

        if (deleted) {

            System.out.println(
                    "Patient deleted successfully."
            );

        } else {

            System.out.println(
                    "Patient not found."
            );
        }
    }

    private static void displayPatients() {

        System.out.println();
        System.out.println("--- All Patients ---");

        patientBST.displayInOrder();
    }

    // ==========================================
    // EMERGENCY QUEUE
    // ==========================================

    private static void addEmergencyPatient() {

        System.out.println();
        System.out.println(
                "--- Add Emergency Patient ---"
        );

        int patientId =
                readInt("Patient ID: ");

        Patient patient =
                patientBST.search(patientId);

        if (patient == null) {

            System.out.println(
                    "Patient must be registered first."
            );

            return;
        }

        emergencyQueue.enqueue(patient);

        System.out.println(
                "Patient added to emergency queue."
        );
    }

    private static void treatNextPatient() {

        System.out.println();
        System.out.println(
                "--- Treat Next Patient ---"
        );

        Patient patient =
                emergencyQueue.dequeue();

        if (patient == null) {

            System.out.println(
                    "Emergency queue is empty."
            );

            return;
        }

        System.out.println();
        System.out.println(
                "Patient selected for treatment:"
        );

        System.out.println(patient);

        String doctor =
                readString("Doctor Name: ");

        String treatment =
                readString("Treatment: ");

        String date =
                readString("Treatment Date: ");

        TreatmentRecord record =
                new TreatmentRecord(
                        patient.getPatientId(),
                        doctor,
                        treatment,
                        date
                );

        treatmentStack.push(record);

        System.out.println(
                "Treatment completed."
        );

        System.out.println(
                "Treatment record stored."
        );
    }

    private static void displayEmergencyQueue() {

        System.out.println();
        System.out.println(
                "--- Emergency Queue ---"
        );

        emergencyQueue.display();
    }

    // ==========================================
    // TREATMENT STACK
    // ==========================================

    private static void addTreatment() {

        System.out.println();
        System.out.println(
                "--- Add Treatment Record ---"
        );

        int patientId =
                readInt("Patient ID: ");

        Patient patient =
                patientBST.search(patientId);

        if (patient == null) {

            System.out.println(
                    "Patient not found."
            );

            return;
        }

        String doctor =
                readString("Doctor Name: ");

        String treatment =
                readString("Treatment: ");

        String date =
                readString("Treatment Date: ");

        TreatmentRecord record =
                new TreatmentRecord(
                        patientId,
                        doctor,
                        treatment,
                        date
                );

        treatmentStack.push(record);

        System.out.println(
                "Treatment record added."
        );
    }

    private static void removeLatestTreatment() {

        System.out.println();
        System.out.println(
                "--- Remove Latest Treatment ---"
        );

        TreatmentRecord record =
                treatmentStack.pop();

        if (record == null) {

            System.out.println(
                    "Treatment history is empty."
            );

        } else {

            System.out.println(
                    "Removed treatment record:"
            );

            System.out.println(record);
        }
    }

    private static void displayTreatmentHistory() {

        System.out.println();
        System.out.println(
                "--- Treatment History ---"
        );

        treatmentStack.display();
    }

    // ==========================================
    // PATIENT VISIT LINKED LIST
    // ==========================================

    private static void addVisit() {

        System.out.println();
        System.out.println(
                "--- Add Patient Visit ---"
        );

        int patientId =
                readInt("Patient ID: ");

        Patient patient =
                patientBST.search(patientId);

        if (patient == null) {

            System.out.println(
                    "Patient not found."
            );

            return;
        }

        int visitId =
                readInt("Visit ID: ");

        if (visitHistory.searchVisit(
                patientId,
                visitId) != null) {

            System.out.println(
                    "Visit ID already exists for this patient."
            );

            return;
        }

        String date =
                readString("Visit Date: ");

        String doctor =
                readString("Doctor Name: ");

        String diagnosis =
                readString("Diagnosis: ");

        String treatment =
                readString("Treatment: ");

        Visit visit =
                new Visit(
                        visitId,
                        date,
                        doctor,
                        diagnosis,
                        treatment
                );

        visitHistory.addVisit(
                patientId,
                visit
        );

        System.out.println(
                "Visit added to patient's history."
        );
    }

    private static void searchVisit() {

        System.out.println();
        System.out.println(
                "--- Search Patient Visit ---"
        );

        int patientId =
                readInt("Patient ID: ");

        if (patientBST.search(patientId) == null) {

            System.out.println(
                    "Patient not found."
            );

            return;
        }

        int visitId =
                readInt("Visit ID: ");

        Visit visit =
                visitHistory.searchVisit(
                        patientId,
                        visitId
                );

        if (visit == null) {

            System.out.println(
                    "Visit not found."
            );

        } else {

            System.out.println();
            System.out.println("Visit found:");
            System.out.println(visit);
        }
    }

    private static void removeVisit() {

        System.out.println();
        System.out.println(
                "--- Remove Patient Visit ---"
        );

        int patientId =
                readInt("Patient ID: ");

        if (patientBST.search(patientId) == null) {

            System.out.println(
                    "Patient not found."
            );

            return;
        }

        int visitId =
                readInt("Visit ID: ");

        boolean removed =
                visitHistory.removeVisit(
                        patientId,
                        visitId
                );

        if (removed) {

            System.out.println(
                    "Visit removed successfully."
            );

        } else {

            System.out.println(
                    "Visit not found."
            );
        }
    }

    private static void displayVisitHistory() {

        System.out.println();
        System.out.println(
                "--- Patient Visit History ---"
        );

        int patientId =
                readInt("Patient ID: ");

        if (patientBST.search(patientId) == null) {

            System.out.println(
                    "Patient not found."
            );

            return;
        }

        visitHistory.displayHistory(patientId);
    }

    // ==========================================
    // INPUT METHODS
    // ==========================================

    private static int readInt(String message) {

        while (true) {

            System.out.print(message);

            String input =
                    scanner.nextLine();

            try {

                return Integer.parseInt(input);

            } catch (NumberFormatException e) {

                System.out.println(
                        "Please enter a valid number."
                );
            }
        }
    }

    private static String readString(String message) {

        System.out.print(message);

        return scanner.nextLine();
    }
}