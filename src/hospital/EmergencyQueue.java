package hospital;

public class EmergencyQueue {

    private class Node {

        Patient patient;
        Node next;

        Node(Patient patient) {
            this.patient = patient;
        }
    }

    private Node front;
    private Node rear;

    // ENQUEUE
    public void enqueue(Patient patient) {

        if (patient == null) {
            return;
        }

        Node newNode = new Node(patient);

        if (rear == null) {

            front = newNode;
            rear = newNode;

        } else {

            rear.next = newNode;
            rear = newNode;
        }
    }

    // DEQUEUE
    public Patient dequeue() {

        if (front == null) {
            return null;
        }

        Patient patient = front.patient;

        front = front.next;

        if (front == null) {
            rear = null;
        }

        return patient;
    }

    // DISPLAY
    public void display() {

        if (front == null) {

            System.out.println("Emergency queue is empty.");

            return;
        }

        Node current = front;

        while (current != null) {

            System.out.println(current.patient);

            current = current.next;
        }
    }

    public boolean isEmpty() {
        return front == null;
    }
}