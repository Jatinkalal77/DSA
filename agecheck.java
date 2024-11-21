import java.util.Scanner;

public class agecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18 && age <= 80) {
            System.out.println("Adult");
        } else if (age < 18) {
            System.out.println("Minor");
        } else {
            System.out.println("Invalid Number because in Today Generation no one can live more than 80 years");
        }

    }
}