
public class LinkedList {

    Node head; // Head of list

    public void print() {
        Node n = head; // 'n' will be used to traverse the list

        while (n.next != null) { // While there is something after current node
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data); // Print last node
    }

    public void insert(int data) {
        Node node = new Node();
        node.data = data;

        if (head == null) { // If there is no head (list is empty) new node is head
            head = node;
        } else {
            Node n = head;

            while (n.next != null) { // While there is still something after the current node, advance
                n = n.next;
            }
            n.next = node; // First empty node = new node
        }

    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;

        node.next = head; // New node pointing at current head
        head = node; // Head = new node
    }

    public void insertAtIndex(int index, int data) {
        Node node = new Node();
        node.data = data;

        if (index == 0) {
            insertAtStart(data);
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) { // Loop until you get to the node before the index you are inserting at
                n = n.next;
            }
            node.next = n.next;
            n.next = node; 

        }

    }

    public void delete(int index) {
        Node node = head;

        if (index == 0) { // If you delete the head reassign the head to the next node
            head = head.next;
        }
        for (int i = 0; i < index - 1; i++) {
            node = node.next;
        }
        Node n = node.next;
        node.next = n.next;
    }

}
