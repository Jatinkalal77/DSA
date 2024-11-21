class Node {
    int coeff; 
    int exp; 
    Node next;

    Node(int coeff, int exp) {
        this.coeff = coeff;
        this.exp = exp;
        this.next = null;
    }
}

class Polynomial {
    Node header;

    Polynomial() {
        header = new Node(0, -1);
    }

    void insert(int coeff, int exp) {
        Node newNode = new Node(coeff, exp);
        Node temp = header;
        while (temp.next != null && temp.next.exp > exp) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void display() {
        Node temp = header.next;
        if (temp == null) {
            System.out.println("0");
            return;
        }
        while (temp != null) {
            System.out.print(temp.coeff + "x^" + temp.exp);
            if (temp.next != null) {
                System.out.print(" + ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    Polynomial add(Polynomial p2) {
        Node temp1 = this.header.next;
        Node temp2 = p2.header.next;
        Polynomial result = new Polynomial();

        while (temp1 != null && temp2 != null) {
            if (temp1.exp > temp2.exp) {
                result.insert(temp1.coeff, temp1.exp);
                temp1 = temp1.next;
            } else if (temp2.exp > temp1.exp) {
                result.insert(temp2.coeff, temp2.exp);
                temp2 = temp2.next;
            } else {
                int sumCoeff = temp1.coeff + temp2.coeff;
                if (sumCoeff != 0) {
                    result.insert(sumCoeff, temp1.exp);
                }
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }

        while (temp1 != null) {
            result.insert(temp1.coeff, temp1.exp);
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            result.insert(temp2.coeff, temp2.exp);
            temp2 = temp2.next;
        }

        return result;
    }
}

public class exp6 {
    public static void main(String[] args) {
        Polynomial p1 = new Polynomial();
        Polynomial p2 = new Polynomial();

        p1.insert(4, 3);
        p1.insert(3, 2);
        p1.insert(2, 1);

        p2.insert(3, 4);
        p2.insert(5, 2);    
        p2.insert(6, 1);

        System.out.print("Polynomial 1: ");
        p1.display();

        System.out.print("Polynomial 2: ");
        p2.display();

        Polynomial result = p1.add(p2);

        System.out.print("Resultant Polynomial: ");
        result.display();
    }
}
