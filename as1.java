class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void insertNode(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    boolean hasCycle() {
        if (head == null || head.next == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}

public class as1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertNode(10);
        list.insertNode(20);
        list.insertNode(40);
        list.head.next.next = list.head;

        if (list.hasCycle()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
