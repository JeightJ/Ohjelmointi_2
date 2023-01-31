package Viikko3.T1;

import java.util.Scanner;

public class Ympyra {

    private double sade;

    public Ympyra(double r){
        sade = r;
    }

    public double getAla() {
        return Math.PI * sade * sade;
    }

    public void getSade() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Anna säde: ");
        sade = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "Säde: " + sade + " ja ala: " + getAla();
    }

    public boolean equals(Ympyra other) {
        return this.sade == other.sade;
    }

    public boolean suurempiKuin(Ympyra other) {
        return this.getAla() > other.getAla();
    }

    public static void main(String[] args) {
        Ympyra y1 = new Ympyra(2.0);
        Ympyra y2 = new Ympyra(3.0);

        y1.getSade();
        y2.getSade();

        System.out.println(y1);
        System.out.println(y2);

        System.out.println("y1 and y2 equal? " + y1.equals(y2));
        System.out.println("y1 is larger than y2? " + y1.suurempiKuin(y2));
    }
}