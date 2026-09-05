package hospital;

public class TreatmentStack {

    private class Node {

        TreatmentRecord record;
        Node next;

        Node(TreatmentRecord record) {
            this.record = record;
        }
    }

    private Node top;

    // PUSH
    public void push(TreatmentRecord record) {

        if (record == null) {
            return;
        }

        Node newNode = new Node(record);

        newNode.next = top;

        top = newNode;
    }

    // POP
    public TreatmentRecord pop() {

        if (top == null) {
            return null;
        }

        TreatmentRecord record = top.record;

        top = top.next;

        return record;
    }

    // DISPLAY
    public void display() {

        if (top == null) {

            System.out.println("Treatment history is empty.");

            return;
        }

        Node current = top;

        while (current != null) {

            System.out.println(current.record);

            current = current.next;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }
}