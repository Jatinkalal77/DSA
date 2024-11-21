

import java.util.Scanner;

public class greater {
    public static int GreatherNumber(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = GreatherNumber(a, b);

        System.out.println("Greater Number is " + sum);

    }
}