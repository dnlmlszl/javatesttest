package Tests.Circle;

public class CircleTest {
    public static void main(String[] args) {
        testCalculateArea();
        testCalculateCircumference();
        testNegativeRadius();
        testZeroRadius();
    }
    public static void testCalculateArea() {
        Circle circle = new Circle(3.14, 5);
        double actualArea = circle.calculateArea();
        if (actualArea == 78.5)
            System.out.println("Area calculation test passed.");
        else
            System.out.println("Area calculation test failed.");
    }
    public static void testCalculateCircumference() {
        Circle circle = new Circle(3.14, 5);
        double actualCircumference = circle.calculateCircumference();
        if (actualCircumference == 31.4)
            System.out.println("Circumference calculation test passed.");
        else
            System.out.println("Circumference calculation test failed.");
    }
    public static void testNegativeRadius() {
        // Arrange & Act
        Circle circle = new Circle(3.14, -5); // Trying to create a circle with negative radius

        // Assert
        if (circle != null) {
            System.out.println("testNegativeRadius test failed.");
        } else {
            System.out.println("testNegativeRadius test passed.");
        }
    }

    public static void testZeroRadius() {
        // Arrange & Act
        Circle circle = new Circle(3.14, 0); // Trying to create a circle with radius zero

        // Assert
        if (circle != null) {
            System.out.println("testZeroRadius test failed.");
        } else {
            System.out.println("testZeroRadius test passed.");
        }
    }

}
