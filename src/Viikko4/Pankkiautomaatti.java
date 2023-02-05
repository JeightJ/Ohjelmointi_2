package Viikko4;

import java.io.*;
import java.util.Scanner;

public class Pankkiautomaatti {
    static int[] tilisaldo = new int[10];
    static Scanner lukija = new Scanner(System.in);
    static File saldotiedosto = new File("tilit.dat");

    public static void main(String[] args) {
        // Check if the file exists, if not, create the file with default saldos
        if (!saldotiedosto.exists()) {
            try {
                saldotiedosto.createNewFile();
                System.out.println("Tilitiedostoa ei löytynyt, luodaan uusi tiedosto oletussaldolla 100 euroa/tili");
                for (int i = 0; i < 10; i++) {
                    tilisaldo[i] = 100;
                }
            } catch (IOException e) {
                System.out.println("Tiedoston luominen epäonnistui");
                e.printStackTrace();
                System.exit(0);
            }
        } else {
            // Read the saldos from the file if it exists
            try {
                Scanner tiedostolukija = new Scanner(saldotiedosto);
                for (int i = 0; i < 10; i++) {
                    tilisaldo[i] = tiedostolukija.nextInt();
                }
                tiedostolukija.close();
            } catch (FileNotFoundException e) {
                System.out.println("Tilitiedostoa ei löytynyt");
                e.printStackTrace();
                System.exit(0);
            }
        }

        // User interaction loop
        boolean jatka = true;
        while (jatka) {
            System.out.println("1. Tilitietojen näyttäminen");
            System.out.println("2. Rahan nostaminen");
            System.out.println("3. Rahan tallettaminen");
            System.out.println("4. Lopetus");
            System.out.print("Valinta: ");
            int valinta = lukija.nextInt();

            switch (valinta) {
                case 1:
                    naytaTilit();
                    break;
                case 2:
                    nostaRahaa();
                    break;
                case 3:
                    talletaRahaa();
                    break;
                case 4:
                    jatka = false;
                    break;
                default:
                    System.out.println("Virheellinen valinta");
                    break;
            }
        }

        // Save the saldos to the file before exiting
        try {
            PrintWriter tiedostokirjoittaja = new PrintWriter(saldotiedosto);
            for (int i = 0; i < 10; i++) {
                tiedostokirjoittaja.println(tilisaldo[i]);
            }
            tiedostokirjoittaja.close();
        } catch (FileNotFoundException e) {
            System.out.println("Tilitiedoston tallentaminen epäonnistui");
            e.printStackTrace();
            System.exit(0);
        }

        System.out.println("Kiitos käynnistä! Tervetuloa uudelleen.");
    }

    public static void naytaTilit() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Tili " + (i + 1) + ": " + tilisaldo[i] + " euroa");
        }
    }

    public static void nostaRahaa() {
        System.out.print("Mistä tililtä (1-10)? ");
        int tili = lukija.nextInt() - 1;
        System.out.print("Kuinka paljon? ");
        int maara = lukija.nextInt();

        if (tili < 0 || tili > 9) {
            System.out.println("Virheellinen tili");
            return;
        }

        if (tilisaldo[tili] < maara) {
            System.out.println("Ei tarpeeksi rahaa");
            return;
        }

        tilisaldo[tili] -= maara;
        System.out.println("Nostettiin " + maara + " euroa tililtä " + (tili + 1));
    }

    public static void talletaRahaa() {
        System.out.print("Mihin tiliin (1-10)? ");
        int tili = lukija.nextInt() - 1;
        System.out.print("Kuinka paljon? ");
        int maara = lukija.nextInt();

        if (tili < 0 || tili > 9) {
            System.out.println("Virheellinen tili");
            return;
        }

        tilisaldo[tili] += maara;
        System.out.println("Talletettiin " + maara + " euroa tiliin " + (tili + 1));
    }
}