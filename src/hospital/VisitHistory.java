package hospital;

public class VisitHistory {

    /*
     * One PatientHistory object represents one patient's
     * singly linked list of visits.
     */

    private class VisitNode {

        Visit visit;
        VisitNode next;

        VisitNode(Visit visit) {
            this.visit = visit;
        }
    }

    private class PatientHistory {

        int patientId;
        VisitNode head;
        PatientHistory next;

        PatientHistory(int patientId) {
            this.patientId = patientId;
        }
    }

    private PatientHistory patients;

    // ================================
    // ADD VISIT
    // ================================

    public void addVisit(int patientId, Visit visit) {

        if (visit == null) {
            return;
        }

        PatientHistory history =
                findPatientHistory(patientId);

        if (history == null) {

            history = new PatientHistory(patientId);

            history.next = patients;

            patients = history;
        }

        VisitNode newNode =
                new VisitNode(visit);

        if (history.head == null) {

            history.head = newNode;

        } else {

            VisitNode current =
                    history.head;

            while (current.next != null) {

                current = current.next;
            }

            current.next = newNode;
        }
    }

    // ================================
    // SEARCH VISIT
    // ================================

    public Visit searchVisit(int patientId, int visitId) {

        PatientHistory history =
                findPatientHistory(patientId);

        if (history == null) {
            return null;
        }

        VisitNode current =
                history.head;

        while (current != null) {

            if (current.visit.getVisitId() == visitId) {

                return current.visit;
            }

            current = current.next;
        }

        return null;
    }

    // ================================
    // REMOVE VISIT
    // ================================

    public boolean removeVisit(int patientId, int visitId) {

        PatientHistory history =
                findPatientHistory(patientId);

        if (history == null ||
            history.head == null) {

            return false;
        }

        // Remove first node
        if (history.head.visit.getVisitId() == visitId) {

            history.head = history.head.next;

            return true;
        }

        VisitNode current =
                history.head;

        while (current.next != null) {

            if (current.next.visit.getVisitId() == visitId) {

                current.next =
                        current.next.next;

                return true;
            }

            current = current.next;
        }

        return false;
    }

    // ================================
    // DISPLAY PATIENT HISTORY
    // ================================

    public void displayHistory(int patientId) {

        PatientHistory history =
                findPatientHistory(patientId);

        if (history == null ||
            history.head == null) {

            System.out.println(
                    "No visit history for this patient."
            );

            return;
        }

        VisitNode current =
                history.head;

        while (current != null) {

            System.out.println(current.visit);

            current = current.next;
        }
    }

    // ================================
    // FIND PATIENT HISTORY
    // ================================

    private PatientHistory findPatientHistory(int patientId) {

        PatientHistory current =
                patients;

        while (current != null) {

            if (current.patientId == patientId) {

                return current;
            }

            current = current.next;
        }

        return null;
    }
}