package Viikko2;

import java.util.Scanner;

public class Laskuri {
    public int luku1, luku2;
    public String s1;

    //a.
    public Laskuri() {
        luku1 = 0;
        luku2 = 0;
    }

    //b.
    public Laskuri(String s1, String s2) {
        this.s1 = s1 + s2;
    }

    public int kerro(int luku1, int luku2) {
        int tulo = luku1 * luku2;
        return tulo;
    }

    // c.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String s1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String s2 = scanner.nextLine();

        //i.
        Laskuri laskuri = new Laskuri(s1, s2);

        //ii.
        int tulos = laskuri.kerro(23, 99);
        System.out.println("The product of 23 and 99 is: " + tulos);

        //iii.
        System.out.println("The value of s1 is: " + laskuri.s1);
    }
}