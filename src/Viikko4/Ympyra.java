package Viikko4;

import java.io.*;
import java.util.Scanner;

public class Ympyra implements Serializable {
    private double sade;
    public Ympyra(double r) {
        sade = r;
    }
    public double getAla() {
        return Math.PI * sade * sade;
    }
    public double getSade() {
        return sade;
    }
    public String toString() {
        return "Ympyrän säde on " + sade + " ja pinta-ala on " + getAla();
    }
    public boolean equals(Ympyra y) {
        if (this.sade == y.getSade())
            return true;
        else
            return false;
    }
    public boolean suurempiKuin(Ympyra y) {
        if (this.getAla() > y.getAla())
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            Ympyra[] ympyrat = new Ympyra[10];
            for (int i = 0; i < 10; i++) {
                System.out.println("Anna ympyrän " + (i + 1) + " säde: ");
                double s = input.nextDouble();
                ympyrat[i] = new Ympyra(s);
            }
            File tiedosto = new File("Ympyrat.dat");
            if (!tiedosto.exists()) {
                tiedosto.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(tiedosto);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Ympyra y : ympyrat) {
                oos.writeObject(y);
            }
            oos.close();
            fos.close();
            FileInputStream fis = new FileInputStream(tiedosto);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Ympyra[] ympyrat2 = new Ympyra[10];
            for (int i = 0; i < 10; i++) {
                ympyrat2[i] = (Ympyra) ois.readObject();
                System.out.println(ympyrat2[i]);
            }
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println("Tiedostoa ei löytynyt.");
        } catch (IOException e) {
            System.out.println("Tiedoston käsittelyssä tapahtui virhe.");
        } catch (ClassNotFoundException e) {
            System.out.println("Luokkaa ei löytynyt.");
        }
    }
}