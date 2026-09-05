package hospital;

import java.util.HashMap;

public class VisitHistory {

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

    public void addVisit(int patientId, Visit visit) {

        PatientHistory history = findPatientHistory(patientId);

        if (history == null) {

            history = new PatientHistory(patientId);

            history.next = patients;

            patients = history;
        }

        VisitNode newNode = new VisitNode(visit);

        if (history.head == null) {

            history.head = newNode;

        } else {

            VisitNode current = history.head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }
    }

    private PatientHistory findPatientHistory(int patientId) {

        PatientHistory current = patients;

        while (current != null) {

            if (current.patientId == patientId) {
                return current;
            }

            current = current.next;
        }

        return null;
    }
}