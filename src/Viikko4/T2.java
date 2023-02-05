package Viikko4;
/*

I've renamed C to T2 so my project files are in order look neater, so within this file T2 = C
Also because of the written guidelines, you need to run this one in a package (r field)

*/


abstract public class T2 {
    private double q;
    protected double r;

    public double getQ() {
        return q;
    }

    public void setQ(double q) {
        this.q = q;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    abstract public double laske(int a, int b);
}

class D extends T2 {
    public double laske(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        T2 c = new D();
        c.setQ(10.0);
        c.setR(20.0);
        System.out.println("Q: " + c.getQ());
        System.out.println("R: " + c.getR());
        System.out.println("Result: " + c.laske(5, 5));
    }
}