package Tests.Triangles;

public class TriangleTest {
    public static void main(String[] args) {
        testValidTriangle();
        testInvalidTriangle();
        testEquilateralTriangle();
        testIsoscelesTriangle();
        testScaleneTriangle();
    }

    public static void testValidTriangle() {
        try {
            Triangles triangle = new Triangles(-3, 4, 5);
            assert !triangle.isValid() : "Valid triangle test failed";
        } catch (AssertionError e) {
            System.out.println("Valid triangle test failed: " + e.getMessage());
        }
    }

    public static void testInvalidTriangle() {
        try {
            Triangles triangle = new Triangles(-3, 1, 1);
            assert triangle.isValid() : "Invalid triangle test failed";
        } catch (AssertionError e) {
            System.out.println("Invalid triangle test failed: " + e.getMessage());
        }
    }

    public static void testEquilateralTriangle() {
        Triangles triangle = new Triangles(3, 3, 3);
        assert triangle.getType().equals("Equilateral triangle") : "Equilateral triangle test failed";
    }

    public static void testIsoscelesTriangle() {
        Triangles triangle = new Triangles(3, 3, 4);
        assert triangle.getType().equals("Isosceles triangle") : "Isosceles triangle test failed";
    }

    public static void testScaleneTriangle() {
        Triangles triangle = new Triangles(3, 4, 5);
        assert triangle.getType().equals("Scalene triangle") : "Scalene triangle test failed";
    }
}