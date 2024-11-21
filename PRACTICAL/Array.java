import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int Number[] = new int[size];
        int[] marks = new int[3];
        marks[0] = 60; //phy
        marks[1] = 55; //chy
        marks[2] = 67; //eng
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        for(int i = 0; i<size; i++){
            Number[i] = sc.nextInt();
        }


        int x = sc.nextInt();

        for(int i =0;i<Number.length;i++){
            if (Number[i] == x) {
                System.out.println(+i);
            }      
        }
    }
}
