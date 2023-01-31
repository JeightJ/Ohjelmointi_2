package Viikko3.T3;


/*
This is the main program that should be outside of the C -class.

As commented already in the code, referring to a doesnt work as its private part of the C. If we ignore a or comment it away,
the program should work as intended.

We can still refer to b, as it can be accessed from the package, but even that is considered somewhat
of a bad practice.
*/

public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.setA(1);
        obj.setB(2);

    //    System.out.println("Field a (direct): " + obj.a); // Not recommended, a is private. If you undo the commenting, you can see that the program doesnt work
        System.out.println("Field b (direct): " + obj.b); // b is protected, but not recommended
        System.out.println("Field a (via method): " + obj.getA());
        System.out.println("Field b (via method): " + obj.getB());
    }
}