import java.util.Scanner;

public class class2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Age = sc.nextInt();
        if (Age>18) {
            System.out.println("Adult");
        }else{
            System.out.println("Not Adult");
        }
    }
}
