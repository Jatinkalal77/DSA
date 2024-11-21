public class Polynomial {
    static class Node {
        int coeff;
        int exp;
        Node next;

        Node(int coeff, int exp) {
            this.coeff = coeff;
            this.exp = exp;
            this.next = null;
        }
    }

    static Node createHeaderNode() {
        Node header = new Node(0, -1);
        return header;
    }

    static void insert(Node header, int coeff, int exp) {
        Node newNode = new Node(coeff, exp);

        Node temp = header;
        while (temp.next != null && temp.next.exp > exp) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    static void display(Node header) {
        Node temp = header.next;

        if (temp == null) {
            System.out.println("0");
            return;
        }

        while (temp != null) {
            System.out.print(temp.coeff + "x^" + temp.exp + " + ");
            temp = temp.next;
        }
        System.out.println();
    }

    static void addPolynomials(Node p1, Node p2) {
        Node result = createHeaderNode();

        Node temp1 = p1.next;
        Node temp2 = p2.next;

        while (temp1 != null && temp2 != null) {
            if (temp1.exp > temp2.exp) {
                insert(result, temp1.coeff, temp1.exp);
                temp1 = temp1.next;
            } else if (temp1.exp < temp2.exp) {
                insert(result, temp2.coeff, temp2.exp);
                temp2 = temp2.next;
            } else {
                insert(result, temp1.coeff + temp2.coeff, temp1.exp);
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }

        while (temp1 != null) {
            insert(result, temp1.coeff, temp1.exp);
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            insert(result, temp2.coeff, temp2.exp);
            temp2 = temp2.next;
        }

        display(result);
    }

    public static void main(String[] args) {
        Node p1 = createHeaderNode();
        Node p2 = createHeaderNode();

        System.out.println("\nFor Polynomial 1:");
        insert(p1, 2, 3); // 4x^3
        insert(p1, 3, 2); // 3x^2
        insert(p1, 5, 1); // 5x^1
        insert(p1, 1, 0); // 1
        display(p1);

        System.out.println("\nFor Polynomial 2:");
        insert(p2, 8, 3); // 2x^3
        insert(p2, 4, 1); // 1x^2
        insert(p2, 3, 2); // 3x^1
        insert(p2, 5, 0); // 4x^0
        display(p2);

        addPolynomials(p1, p2);
    }
}