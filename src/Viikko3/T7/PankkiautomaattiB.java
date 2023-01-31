package Viikko3.T7;
import java.util.Scanner;

class PankkitiliB {
    private int id;
    private double saldo;

    public PankkitiliB(int id, double saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void tapahtuma(double maara) {
        saldo += maara;
    }
}

public class PankkiautomaattiB {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Pankkitili[] tileja = new Pankkitili[10];
        for (int i = 0; i < 10; i++) {
            tileja[i] = new Pankkitili(i + 1, 100);
        }

        int valittuTili = -1;
        while (valittuTili != 0) {
            System.out.print("Valitse tili (1-10, 0 lopettaa): ");
            valittuTili = lukija.nextInt();
            if (valittuTili < 1 || valittuTili > 10) {
                continue;
            }

            Pankkitili tili = tileja[valittuTili - 1];
            int valinta = -1;
            while (valinta != 4) {
                System.out.println("Tili " + tili.getId());
                System.out.println("1. Saldon tarkistus");
                System.out.println("2. Nosto");
                System.out.println("3. Pano");
                System.out.println("4. Poistu");
                System.out.print("Valintasi: ");
                valinta = lukija.nextInt();
                switch (valinta) {
                    case 1:
                        System.out.println("Tilin " + tili.getId() + " saldo: " + tili.getSaldo());
                        break;
                    case 2:
                        System.out.print("Noston määrä: ");
                        double nostoMaara = lukija.nextDouble();
                        tili.tapahtuma(-nostoMaara);
                        break;
                    case 3:
                        System.out.print("Panon määrä: ");
                        double panoMaara = lukija.nextDouble();
                        tili.tapahtuma(panoMaara);
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Virheellinen valinta");
                }
            }
        }

        System.out.println("Kiitos käynnistä, olipa ihan tosi hauska ja mielenkiintoinen tehtävä! :)");
    }
}