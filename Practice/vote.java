

import java.util.Scanner;

public class vote {
    public static String ageEligibleVote(int age) {
        if (age > 18) {
            return "Eligible";
        } else {
            return "Not Eligible";

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(ageEligibleVote(age));

    }
}
