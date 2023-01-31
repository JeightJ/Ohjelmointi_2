package Viikko1;

import java.util.Scanner;
import java.util.Random;

// DISCLAIMER: The errors in the code were from the original .py file we needed to translate to java. The elif rules are wrong by default
//             but as the task was to translate the program 1 to 1, i left the errors in.

public class KiviPaperiSakset {
    public static void main(String[] args) {
        System.out.println("Tämä on kivi-paperi-sakset -peli. Kolmella voitolla voittaa.");
        int tasapelit = 0;
        int koneenVoitot = 0;
        int pelaajanVoitot = 0;

        while (peliEiLoppu(koneenVoitot, pelaajanVoitot)) {
            Random rand = new Random();
            int koneenValinta = rand.nextInt(3) + 1;

            int pelaajanValinta = kysyPelaajanValinta();

            naytaTietokoneenValinta(koneenValinta);

            int voittaja = naytaVoittaja(koneenValinta, pelaajanValinta);
            if (voittaja == 0) {
                System.out.println("Tasapeli\n");
                tasapelit++;
            } else if (voittaja == 1) {
                System.out.println("Tietokone voitti.\n");
                koneenVoitot++;
            } else if (voittaja == 2) {
                System.out.println("Sinä voitit. \n");
                pelaajanVoitot++;
            } else {
                System.out.println("Virhe");
            }
        }
        lopputulos(tasapelit, koneenVoitot, pelaajanVoitot);
    }

    public static int kysyPelaajanValinta() {
        Scanner input = new Scanner(System.in);
        int valinta = 0;
        while (valinta < 1 || valinta > 3) {
            System.out.print("Anna valintasi 1 = kivi, 2 = paperi, 3 = sakset :");
            valinta = input.nextInt();
            if (valinta < 1 || valinta > 3) {
                System.out.println("Virheellinen valinta.");
            }
        }
        return valinta;
    }

    public static void naytaTietokoneenValinta(int valinta) {
        String teksti;
        if (valinta == 1) {
            teksti = "kivi";
        } else if (valinta == 2) {
            teksti = "paperi";
        } else if (valinta == 3) {
            teksti = "sakset";
        } else {
            teksti = "Virhe";
        }
        System.out.println("Tietokoneen valinta on " + teksti);
    }

    public static int naytaVoittaja(int kone, int pelaaja) {

        int voittaja;

        if ((kone == 1) && (pelaaja == 3)) {
            voittaja = 1;
        } else if ((kone == 1) && (pelaaja == 2)) {
            voittaja = 2;
        } else if ((kone == 1) && (pelaaja == 1)) {
            voittaja = 0;
        } else if ((kone == 2) && (pelaaja == 3)) {
            voittaja = 2;
        } else if ((kone == 2) && (pelaaja == 2)) {
            voittaja = 0;
        } else if ((kone == 2) && (pelaaja == 1)) {
            voittaja = 1;
        } else if ((kone == 3) && (pelaaja == 3)) {
            voittaja = 0;
        } else if ((kone == 3) && (pelaaja == 2)) {
            voittaja = 2;
        } else if ((kone == 3) && (pelaaja == 1)) {
            voittaja = 1;
        } else {
            voittaja = -1;
        }
        return voittaja;
    }

    public static boolean peliEiLoppu(int koneenVoitot, int pelaajanVoitot) {
        if (koneenVoitot == 3 || pelaajanVoitot == 3) {
            return false;
        } else {
            return true;
        }
    }

    public static void lopputulos(int tasapelit, int koneenVoitot, int pelaajanVoitot) {
        System.out.println("Pelit loppuivat.");
        System.out.println("Tasapelejä: " + tasapelit);
        System.out.println("Tietokoneen voitot: " + koneenVoitot);
        System.out.println("Sinun voitot: " + pelaajanVoitot);
        if (koneenVoitot > pelaajanVoitot) {
            System.out.println("Tietokone voitti.");
        } else if (koneenVoitot < pelaajanVoitot) {
            System.out.println("Sinä voitit.");
        } else {
            System.out.println("Tasapeli.");
        }
    }
}