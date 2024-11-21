import java.util.Scanner;

public class function {
    public static void CalculateMultiply(int a) {
        if (a<0) {
            System.out.println("Invalid Number");
            return ;
        }
        int f = 1;
        for(int i=a;i>=1;i--){
            f = f * i;
        }
        System.out.println(f);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        CalculateMultiply(a);
    }
}
