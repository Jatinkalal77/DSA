import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(n + " x " + i + " = " + (n*i));
            if ((n*i) % 2 == 0) {
                System.out.println("This is Even");
            }else{
                System.out.println("This is odd");
            }
        }
    }
}
