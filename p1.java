package practice;

import java.util.Scanner;

public class p1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            // Calculate the series
            long[] series = new long[n];
            for (int j = 0; j < n; j++) {
                series[j] = a;
                for (int k = 0; k <= j; k++) {
                    series[j] += (long) Math.pow(2, k) * b;
                }
            }

            // Print the series
            for (int j = 0; j < n; j++) {
                System.out.print(series[j] + " ");
            }
            System.out.println();
        }
    }
}

