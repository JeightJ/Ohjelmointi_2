package Viikko4;

/*
I've renamed class Tentti to T5 for the same reason as previous files.
Also since the task required you to only use the same class Tentti as in previous, I took it to mean *strictly* the unmodified tentti-class
from moodle.
 */

import java.util.Scanner;

interface Huippu {
    boolean onkoHuippu();
}

public class T5 implements Huippu {
    private double pisteet;

    public void setPisteet(double p){
        this.pisteet = p;
    }

    public double getPisteet(){
        return this.pisteet;
    }

    public int getArvosana(){
        int arvosana;

        if (this.pisteet >= 90) {
            arvosana = 5;
        }
        else if (this.pisteet >= 80) {
            arvosana = 4;
        }
        else if (this.pisteet >= 70) {
            arvosana = 3;
        }
        else if (this.pisteet >= 60) {
            arvosana = 2;
        }
        else if (this.pisteet >= 50) {
            arvosana = 1;
        }
        else {
            arvosana = 0;
        }
        return arvosana;
    }

    @Override
    public boolean onkoHuippu() {
        return this.getArvosana() == 5;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        T5 tentti = new T5();
        System.out.print("Enter exam score aka total points: ");
        tentti.setPisteet(scan.nextDouble());

        System.out.println("Exam grade: " + tentti.getArvosana());
        System.out.println("Is it a top grade? " + tentti.onkoHuippu());
        scan.close();
    }
}
