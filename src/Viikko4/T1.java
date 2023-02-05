package Viikko4;

public class T1 {
    public static double pintaAla(double radius) {
        return Math.PI * radius * radius;
    }

    public static double pintaAla(double radius, double height) {
        return (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
    }

    public static void main(String[] args) {
        double radius = 5.0;
        double height = 10.0;

        System.out.println("Circle area: " + T1.pintaAla(radius));
        System.out.println("Cylinder area: " + T1.pintaAla(radius, height));
    }
}