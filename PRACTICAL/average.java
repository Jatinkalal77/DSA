

import java.util.Scanner;

public class average {
    public static int Average(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg = Average(a, b, c);

        System.out.println(avg);

    }
}
