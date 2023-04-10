public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0, "red");
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());

        Cylinder cylinder = new Cylinder(2.0, "blue", 4.0);
        System.out.println(cylinder);
        System.out.println("Volume: " + cylinder.getVolume());
    }
}