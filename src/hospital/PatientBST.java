package hospital;

public class PatientBST {

    private class Node {

        Patient patient;
        Node left;
        Node right;

        Node(Patient patient) {
            this.patient = patient;
        }
    }

    private Node root;

    // INSERT
    public void insert(Patient patient) {

        if (patient == null) {
            return;
        }

        root = insertRecursive(root, patient);
    }

    private Node insertRecursive(Node current, Patient patient) {

        if (current == null) {
            return new Node(patient);
        }

        if (patient.getPatientId() < current.patient.getPatientId()) {

            current.left =
                    insertRecursive(current.left, patient);

        } else if (patient.getPatientId() > current.patient.getPatientId()) {

            current.right =
                    insertRecursive(current.right, patient);

        } else {

            System.out.println("Patient ID already exists.");
        }

        return current;
    }

    // SEARCH
    public Patient search(int patientId) {

        Node result = searchRecursive(root, patientId);

        if (result == null) {
            return null;
        }

        return result.patient;
    }

    private Node searchRecursive(Node current, int patientId) {

        if (current == null) {
            return null;
        }

        if (patientId == current.patient.getPatientId()) {
            return current;
        }

        if (patientId < current.patient.getPatientId()) {
            return searchRecursive(current.left, patientId);
        }

        return searchRecursive(current.right, patientId);
    }

    // DELETE
    public boolean delete(int patientId) {

        if (search(patientId) == null) {
            return false;
        }

        root = deleteRecursive(root, patientId);

        return true;
    }

    private Node deleteRecursive(Node current, int patientId) {

        if (current == null) {
            return null;
        }

        if (patientId < current.patient.getPatientId()) {

            current.left =
                    deleteRecursive(current.left, patientId);

        } else if (patientId > current.patient.getPatientId()) {

            current.right =
                    deleteRecursive(current.right, patientId);

        } else {

            // No child
            if (current.left == null &&
                current.right == null) {

                return null;
            }

            // Right child
            if (current.left == null) {
                return current.right;
            }

            // Left child
            if (current.right == null) {
                return current.left;
            }

            // Two children
            Node successor =
                    findMinimum(current.right);

            current.patient = successor.patient;

            current.right =
                    deleteRecursive(
                            current.right,
                            successor.patient.getPatientId()
                    );
        }

        return current;
    }

    private Node findMinimum(Node current) {

        while (current.left != null) {
            current = current.left;
        }

        return current;
    }

    // IN-ORDER
    public void displayInOrder() {

        if (root == null) {

            System.out.println("No patients registered.");

            return;
        }

        displayInOrderRecursive(root);
    }

    private void displayInOrderRecursive(Node current) {

        if (current != null) {

            displayInOrderRecursive(current.left);

            System.out.println(current.patient);

            displayInOrderRecursive(current.right);
        }
    }
}