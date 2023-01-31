package Viikko3.T3;

/*
This is the class C file with its own main file, here we can definitely use the fields and parameters as we use,
but in the main down there i've added my thoughts about the means in which we do this.
*/

public class C {
    private int a;
    protected int b;

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public static void main(String[] args) {
        C obj = new C();
        obj.setA(1);
        obj.setB(2);

        System.out.println("Field a (direct): " + obj.a); // Not recommended, a is private
        System.out.println("Field b (direct): " + obj.b); // b is protected, but not recommended
        System.out.println("Field a (via method): " + obj.getA());
        System.out.println("Field b (via method): " + obj.getB());
    }
}

