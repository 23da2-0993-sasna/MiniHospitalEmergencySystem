package hospital;

public class HospitalTest {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("       HOSPITAL SYSTEM TEST PROGRAM");
        System.out.println("==========================================");

        testPatientBST();

        testEmergencyQueue();

        testTreatmentStack();

        testVisitHistory();

        System.out.println();
        System.out.println("==========================================");
        System.out.println("          ALL TESTS COMPLETED");
        System.out.println("==========================================");
    }

    // ==========================================
    // TEST 1 - PATIENT BST
    // ==========================================

    private static void testPatientBST() {

        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("TEST 1: PATIENT BST");
        System.out.println("------------------------------------------");

        PatientBST bst = new PatientBST();

        Patient p1 = new Patient(
                103,
                "Kamal",
                35,
                "0711111111",
                "Fever"
        );

        Patient p2 = new Patient(
                101,
                "Nimal",
                45,
                "0722222222",
                "Diabetes"
        );

        Patient p3 = new Patient(
                105,
                "Saman",
                28,
                "0733333333",
                "Asthma"
        );

        Patient p4 = new Patient(
                102,
                "Amal",
                50,
                "0744444444",
                "Blood Pressure"
        );

        Patient p5 = new Patient(
                104,
                "Sunil",
                60,
                "0755555555",
                "Heart Problem"
        );

        // Test insertion
        bst.insert(p1);
        bst.insert(p2);
        bst.insert(p3);
        bst.insert(p4);
        bst.insert(p5);

        System.out.println("\nPatients in ascending ID order:");

        bst.displayInOrder();

        // Test search
        System.out.println("\nSearching for Patient ID 103:");

        Patient result = bst.search(103);

        if (result != null) {

            System.out.println("PASS - Patient found:");
            System.out.println(result);

        } else {

            System.out.println("FAIL - Patient not found.");
        }

        // Test missing patient
        System.out.println("\nSearching for Patient ID 999:");

        result = bst.search(999);

        if (result == null) {

            System.out.println(
                    "PASS - Non-existing patient correctly not found."
            );

        } else {

            System.out.println(
                    "FAIL - Non-existing patient was found."
            );
        }

        // Test deletion
        System.out.println("\nDeleting Patient ID 102:");

        boolean deleted = bst.delete(102);

        if (deleted) {

            System.out.println(
                    "PASS - Patient deleted successfully."
            );

        } else {

            System.out.println(
                    "FAIL - Patient deletion failed."
            );
        }

        System.out.println("\nPatients after deletion:");

        bst.displayInOrder();
    }

    // ==========================================
    // TEST 2 - EMERGENCY QUEUE
    // ==========================================

    private static void testEmergencyQueue() {

        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("TEST 2: EMERGENCY QUEUE");
        System.out.println("------------------------------------------");

        EmergencyQueue queue =
                new EmergencyQueue();

        Patient p1 = new Patient(
                201,
                "Patient One",
                30,
                "0761111111",
                "Fever"
        );

        Patient p2 = new Patient(
                202,
                "Patient Two",
                40,
                "0762222222",
                "Injury"
        );

        Patient p3 = new Patient(
                203,
                "Patient Three",
                50,
                "0763333333",
                "Chest Pain"
        );

        // Test enqueue
        queue.enqueue(p1);
        queue.enqueue(p2);
        queue.enqueue(p3);

        System.out.println("\nEmergency Queue:");

        queue.display();

        // Test FIFO
        System.out.println(
                "\nRemoving first emergency patient:"
        );

        Patient removed = queue.dequeue();

        if (removed != null &&
            removed.getPatientId() == 201) {

            System.out.println(
                    "PASS - FIFO order works correctly."
            );

        } else {

            System.out.println(
                    "FAIL - FIFO order is incorrect."
            );
        }

        System.out.println("\nRemaining Queue:");

        queue.display();

        // Test empty handling
        queue.dequeue();
        queue.dequeue();

        Patient emptyResult = queue.dequeue();

        if (emptyResult == null) {

            System.out.println(
                    "PASS - Empty queue handled correctly."
            );

        } else {

            System.out.println(
                    "FAIL - Empty queue handling failed."
            );
        }
    }

    // ==========================================
    // TEST 3 - TREATMENT STACK
    // ==========================================

    private static void testTreatmentStack() {

        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("TEST 3: TREATMENT STACK");
        System.out.println("------------------------------------------");

        TreatmentStack stack =
                new TreatmentStack();

        TreatmentRecord record1 =
                new TreatmentRecord(
                        301,
                        "Dr. Silva",
                        "Blood Test",
                        "2026-09-01"
                );

        TreatmentRecord record2 =
                new TreatmentRecord(
                        302,
                        "Dr. Perera",
                        "X-Ray",
                        "2026-09-02"
                );

        TreatmentRecord record3 =
                new TreatmentRecord(
                        303,
                        "Dr. Fernando",
                        "Surgery",
                        "2026-09-03"
                );

        // Test push
        stack.push(record1);
        stack.push(record2);
        stack.push(record3);

        System.out.println("\nTreatment Stack:");

        stack.display();

        // Test LIFO
        System.out.println(
                "\nRemoving latest treatment:"
        );

        TreatmentRecord removed =
                stack.pop();

        if (removed != null &&
            removed.getPatientId() == 303) {

            System.out.println(
                    "PASS - LIFO order works correctly."
            );

        } else {

            System.out.println(
                    "FAIL - LIFO order is incorrect."
            );
        }

        System.out.println("\nRemaining Treatment Stack:");

        stack.display();

        // Test empty handling
        stack.pop();
        stack.pop();

        TreatmentRecord emptyResult =
                stack.pop();

        if (emptyResult == null) {

            System.out.println(
                    "PASS - Empty stack handled correctly."
            );

        } else {

            System.out.println(
                    "FAIL - Empty stack handling failed."
            );
        }
    }

    // ==========================================
    // TEST 4 - VISIT HISTORY
    // ==========================================

    private static void testVisitHistory() {

        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("TEST 4: PATIENT VISIT HISTORY");
        System.out.println("------------------------------------------");

        VisitHistory history =
                new VisitHistory();

        // Patient 401 visits
        Visit visit1 =
                new Visit(
                        1,
                        "2026-09-01",
                        "Dr. Silva",
                        "Fever",
                        "Medicine"
                );

        Visit visit2 =
                new Visit(
                        2,
                        "2026-09-03",
                        "Dr. Perera",
                        "Cough",
                        "Syrup"
                );

        // Patient 402 visits
        Visit visit3 =
                new Visit(
                        3,
                        "2026-09-04",
                        "Dr. Fernando",
                        "Injury",
                        "Bandage"
                );

        // Add visits
        history.addVisit(401, visit1);
        history.addVisit(401, visit2);

        history.addVisit(402, visit3);

        // Display patient 401 history
        System.out.println(
                "\nVisit history for Patient 401:"
        );

        history.displayHistory(401);

        // Display patient 402 history
        System.out.println(
                "\nVisit history for Patient 402:"
        );

        history.displayHistory(402);

        // Test search
        System.out.println(
                "\nSearching Visit ID 2 for Patient 401:"
        );

        Visit result =
                history.searchVisit(401, 2);

        if (result != null) {

            System.out.println(
                    "PASS - Visit found:"
            );

            System.out.println(result);

        } else {

            System.out.println(
                    "FAIL - Visit not found."
            );
        }

        // Test missing visit
        System.out.println(
                "\nSearching for non-existing Visit ID 99:"
        );

        result =
                history.searchVisit(401, 99);

        if (result == null) {

            System.out.println(
                    "PASS - Non-existing visit correctly not found."
            );

        } else {

            System.out.println(
                    "FAIL - Non-existing visit was found."
            );
        }

        // Test removal
        System.out.println(
                "\nRemoving Visit ID 1 from Patient 401:"
        );

        boolean removed =
                history.removeVisit(401, 1);

        if (removed) {

            System.out.println(
                    "PASS - Visit removed successfully."
            );

        } else {

            System.out.println(
                    "FAIL - Visit removal failed."
            );
        }

        System.out.println(
                "\nPatient 401 history after removal:"
        );

        history.displayHistory(401);
    }
}