// class pen {
//     String color;
//     String type;
//     int price;

//     public void write() {
//         System.out.println("Pen is use to write Something");
//     }

//     public void printColor() {
//         System.out.println("Pen color is " + this.color);
//     }

//     public void printPrice() {
//         System.out.println("Pen price is " + this.price);
//     }

    
// }
class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class OppsFirst {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Jatin";
        s1.age = 20;

        Student s2 = new Student();
        s2.name = "Aditya";
        s2.age = 19;

        Student s3 = new Student();
        s3.name = "Hitesh";
        s3.age = 21;

        s1.printInfo();
        s2.printInfo();
        s3.printInfo();

    }

}
