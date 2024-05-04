package Tests.Circle;

public class Circle {
     private double pi;
     private double r;
     public Circle(double pi, double r) {
         this.pi = pi;
         this.r = r;
     }
    public double calculateArea() {
        return pi * r * r;
    }
    public double calculateCircumference() {
         if (r < 0) {
             return 2 * pi;
         } else {
             return 2 * pi * r;
         }
    }

    public double getR() {
        return r;
    }
    public double getPi() {
        return pi;
    }
    @Override
    public String toString() {
        return String.format("Circle with radius %2f and pi value %2f", r, pi);
    }
}
