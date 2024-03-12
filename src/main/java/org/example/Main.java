package org.example;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4, 5);
        Cube cube = new Cube(5);
        Sphere sphere = new Sphere(3);

        System.out.println("Circle:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Area in square meters: "
                + CentimetersToMeters.squareCentimetersToSquareMeters(rectangle.calculateArea()));
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

        System.out.println("\nTriangle:");
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());

        System.out.println("\nCube:");
        System.out.println("Volume: " + cube.calculateVolume());

        System.out.println("\nSphere:");
        System.out.println("Volume: " + sphere.calculateVolume());
    }
}