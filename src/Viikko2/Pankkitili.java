package Viikko2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Pankkitili {
    private double vuosikorkoProsentti;
    private double tilinSaldo;

    public Pankkitili(double tilinAlkusaldo) {
        tilinSaldo = tilinAlkusaldo;
    }

    public void setVuosikorkoProsentti(double prosentti) {
        vuosikorkoProsentti = prosentti;
    }

    public void talleta(double maara) {
        tilinSaldo += maara;
    }

    public void nosta(double maara) {
        tilinSaldo -= maara;
    }

    public void lisaaKuukausittainenKorko() {
        double kuukausikorko = vuosikorkoProsentti / 12 / 100 * tilinSaldo;
        tilinSaldo += kuukausikorko;
    }

    public double getSaldo() {
        return tilinSaldo;
    }


    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna tilin alkusaldo: ");
        double tilinAlkusaldo = lukija.nextDouble();

        System.out.print("Anna vuosikorko prosentteina: ");
        double vuosikorkoProsentti = lukija.nextDouble();

        System.out.print("Anna kuukausien määrä: ");
        int kuukausia = lukija.nextInt();

        Pankkitili tili = new Pankkitili(tilinAlkusaldo);
        tili.setVuosikorkoProsentti(vuosikorkoProsentti);

        double talletukset = 0;
        double nostot = 0;
        double korot = 0;

        for (int i = 1; i <= kuukausia; i++) {
            System.out.print("Anna talletettavan rahan määrä kuukaudessa " + i + ": ");
            double talletus = lukija.nextDouble();
            talletukset += talletus;

            System.out.print("Anna nostettavan rahan määrä kuukaudessa " + i + ": ");
            double nostonMaara = lukija.nextDouble();
            nostot += nostonMaara;

            tili.talleta(talletus);
            tili.nosta(nostonMaara);
            tili.lisaaKuukausittainenKorko();
            korot += tili.getSaldo() - tilinAlkusaldo - talletus + nostonMaara;

        }

        System.out.println("Tilin loppusaldo: " + tili.getSaldo());
        System.out.println("Talletusten määrä: " + talletukset);
        System.out.println("Nostojen määrä: " + nostot);
        System.out.println("Korkojen yhteismäärä: " + korot);
        System.out.println("Kiitos rahoistasi, Roope Ankka kiittää.");

        Pankkitili.main2();
    }



    public static void main2() {
        double tilinAlkusaldo = 600.00;
        double vuosikorkoProsentti = 0.2;
        int kuukausia = 4;

        Pankkitili tili = new Pankkitili(tilinAlkusaldo);
        tili.setVuosikorkoProsentti(vuosikorkoProsentti);

        double talletukset = 0;
        double nostot = 0;
        double korkot = 0;

        Scanner lukija = new Scanner(System.in);
        System.out.println("Psst, voit 'Shift' + 'Right clickata' tiedostoa, jolloin voit kopioida sen pathina!");
        System.out.print("Anna talletukset.txt:n absoluuttinen polku: ");
        String talletuksetFile = lukija.nextLine();
        System.out.print("Anna nostot.txt:n absoluuttinen polku: ");
        String nostotFile = lukija.nextLine();

        try {
            BufferedReader talletuksetReader = new BufferedReader(new FileReader(talletuksetFile));
            BufferedReader nostotReader = new BufferedReader(new FileReader(nostotFile));

            for (int i = 1; i <= kuukausia; i++) {
                double talletus = Double.parseDouble(talletuksetReader.readLine());
                talletukset += talletus;
                tili.talleta(talletus);

                double nostonMaara = Double.parseDouble(nostotReader.readLine());
                nostot += nostonMaara;
                tili.nosta(nostonMaara);

                tili.lisaaKuukausittainenKorko();
                korkot += tili.getSaldo() - tilinAlkusaldo - talletus + nostot;
            }

            talletuksetReader.close();
            nostotReader.close();
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }

        System.out.println("Tilin loppusaldo: " + tili.getSaldo());
        System.out.println("Talletusten määrä: " + talletukset);
        System.out.println("Nostojen määrä: " + nostot);
        System.out.println("Korkojen yhteismäärä: " + korkot);
        System.out.println("Kiitos rahoistasi, Roope Ankka kiittää jo toistamiseen.");
    }
}