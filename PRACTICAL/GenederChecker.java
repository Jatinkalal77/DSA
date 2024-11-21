import java.util.Scanner;

public class GenederChecker {
    public static void main(String[] args) {
        System.out.println("Hi, how can I help you?");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select an option:");
        System.out.println("1. Check Gender Using name");
        int option = sc.nextInt();
        sc.nextLine();

        switch (option) {
            case 1:
                System.out.println("Please enter name");
                String name = sc.nextLine();
                determineGender(name);
                break;
            default:
                System.out.println("Invalid option");
        }
    }

    private static void determineGender(String name) {
        if (name.equalsIgnoreCase("Deepak")) {
            System.out.println(name + " is likely a Male Name ");
        } else if (name.endsWith("a") || name.endsWith("i") || name.endsWith("e" )) {
            System.out.println(name + " is likely a Female name");
        } else {
            System.out.println(name + " is likely a Male name");
        }
    }
}