public class Calculator {
    public static void main(String[] args){
        // Circle
        double radius = 10;
        double PI = 3.14;

        double cirCir = 2 * PI * radius;

        double cirArea = PI * radius * radius; 

        double length = 17;
        double width = 14;

        double recPerim = 2 * (length + width);
        double recArea = length * width;

        System.out.print("Circle Circumference: " + cirCir);
        System.out.println("Circle Area: " + cirArea);
        System.out.println("Rectangle Perimeter: " + recPerim);
        System.out.println("Rectangle Area: " + recArea);
    }
}
