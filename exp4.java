import java.util.Scanner;

public class exp4 {
    int front = -1;
    int rear = -1;
    int[] queue = new int[10];
    int size = queue.length;

    public void addKaro(int data_) {
        if ((rear + 1) % size == front) {
            System.out.println("Cannot add any customer! Queue is full.");
        } else if (front == -1 && rear == -1) {
            front = 0;
            rear = 0;
            queue[rear] = data_;
            System.out.println("ADD Successfully!");
        } else {
            rear = (rear + 1) % size;
            queue[rear] = data_;
            System.out.println("ADD Successfully!");
        }
    }

    public int hatado() {
        if (rear == -1 && front == -1) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int ele;
        if (front == rear) {
            ele = queue[front];
            front = -1;
            rear = -1;
            System.out.println("Customer deleted ID: " + ele);
            return ele;
        } else {
            ele = queue[front];
            System.out.println("Customer deleted ID: " + ele);
            front = (front + 1) % size;
            return ele;
        }
    }

    public void dikhao() {
        if (front == -1) {
            System.out.println("Queue is empty!");
            return;
        }
        int i = front;
        while (i != rear) {
            System.out.println((i + 1) + ". Customer: " + queue[i]);
            i = (i + 1) % size;
        }
        System.out.println((i + 1) + ". Customer: " + queue[rear]);
        System.out.println();
    }

    public static void main(String[] args) {
        exp4 cq = new exp4();
        Scanner sc = new Scanner(System.in);

        System.out.println("*****************************************");
        System.out.println("1. ADD A CUSTOMER");
        System.out.println("2. DELETE A CUSTOMER");
        System.out.println("3. SHOW ALL CUSTOMERS");
        System.out.println("4. EXIT");
        System.out.println("*****************************************");

        while (true) {
            System.out.print("\nEnter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Customer Id: ");
                    int id = sc.nextInt();
                    cq.addKaro(id);
                    break;
                case 2:
                    cq.hatado();
                    break;
                case 3:
                    cq.dikhao();
                    break;
                case 4:
                    System.out.println("Thank you for your visit! 😊");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Enter a valid choice!");
                    break;
            }
        }
    }
}
