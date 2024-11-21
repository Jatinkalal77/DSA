import java.util.Scanner;

public class twodarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int columns = sc.nextInt();

        int[][] numbers = new int[row][columns];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println(numbers[i][j] + " ");
            }
        }
            System.out.println();
        
    }
}
