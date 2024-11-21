class shape{
    public void area(){
        System.out.println("Display area");
    }
}

class Triangle extends shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }

class EquailvalentTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
}
public class inheritence {
    public static void main(String[] args) {
        System.out.println(Triangle);
    }
}
