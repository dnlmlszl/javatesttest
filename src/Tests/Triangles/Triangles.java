package Tests.Triangles;

public class Triangles {
    private double a;
    private double b;
    private double c;

    public Triangles(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isValid() {
        return a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a;
    }

    public String getType() {
        if (!isValid()) {
            return "Invalid triangle";
        }
        if (a == b && b == c) {
            return "Equilateral triangle";
        } else if (a == b || a == c || b == c) {
            return "Isosceles triangle";
        } else {
            return "Scalene triangle";
        }
    }
}
