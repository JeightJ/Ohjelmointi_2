package Viikko4;
import java.util.Scanner;

// I've renamed the class tentti to T4 so my project files can be managed (just like the previous tasks)

public class T4 {
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

}

class Essee extends T4 {
    private double kielioppi;
    private double oikeinkirjoitus;
    private double pituus;
    private double sisalto;

    public void setArvosana() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Anna kieliopin pisteet (max 30):");
        this.kielioppi = sc.nextDouble();
        System.out.println("Anna oikeinkirjoituksen pisteet (max 20):");
        this.oikeinkirjoitus = sc.nextDouble();
        System.out.println("Anna pituuden pisteet (max 20):");
        this.pituus = sc.nextDouble();
        System.out.println("Anna sisällön pisteet (max 30):");
        this.sisalto = sc.nextDouble();
    }

    @Override
    public int getArvosana() {
        double pisteet = (this.kielioppi) + (this.oikeinkirjoitus) + (this.pituus) + (this.sisalto);
        super.setPisteet(pisteet);
        return super.getArvosana();
    }
}

class test {
    public static void main(String[] args) {
        Essee essee = new Essee();
        essee.setArvosana();
        System.out.println("Arvosana: " + essee.getArvosana());
    }
}