package Viikko3.T6;
import java.util.Objects;
import java.util.Scanner;

/**
 * Here is the generated javadoc:  https://i.imgur.com/AIJ44YP.png
 * If needed, you can just go to "Tools" > "Generate javadoc" and should work like a charm
 */
class Asiakas {
    private String nimi;
    private String osoite;
    private double kengännumero;
    private int hatunkoko;

    /**
     * Constructor to initialize the customer information
     * @param nimi name of the customer
     * @param osoite address of the customer
     * @param kengännumero shoe size of the customer
     * @param hatunkoko hat size of the customer
     */
    public Asiakas(String nimi, String osoite, double kengännumero, int hatunkoko) {
        this.nimi = nimi;
        this.osoite = osoite;
        this.kengännumero = kengännumero;
        this.hatunkoko = hatunkoko;
    }

    /**
     * Get method for customer name
     * @return name of the customer
     */
    public String getNimi() {
        return nimi;
    }

    /**
     * Set method for customer name
     * @param nimi name of the customer to be set
     */
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    /**
     * Get method for customer address
     * @return address of the customer
     */
    public String getOsoite() {
        return osoite;
    }

    /**
     * Set method for customer address
     * @param osoite address of the customer to be set
     */
    public void setOsoite(String osoite) {
        this.osoite = osoite;
    }

    /**
     * Get method for customer shoe size
     * @return shoe size of the customer
     */
    public double getKengännumero() {
        return kengännumero;
    }

    /**
     * Set method for customer shoe size
     * @param kengännumero shoe size of the customer to be set
     */
    public void setKengännumero(double kengännumero) {
        this.kengännumero = kengännumero;
    }

    /**
     * Get method for customer hat size
     * @return hat size of the customer
     */
    public int getHatunkoko() {
        return hatunkoko;
    }

    /**
     * Set method for customer hat size
     * @param hatunkoko hat size of the customer to be set
     */
    public void setHatunkoko(int hatunkoko) {
        this.hatunkoko = hatunkoko;
    }

    /**
     * Method to compare two customers and check if their information is equal
     * @param o object to be compared with the current customer object
     * @return true if both objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asiakas asiakas = (Asiakas) o;
        return Double.compare(asiakas.kengännumero, kengännumero) == 0 &&
                hatunkoko == asiakas.hatunkoko &&
                Objects.equals(nimi, asiakas.nimi) &&
                Objects.equals(osoite, asiakas.osoite);
    }

    /**
     * Method to return a copy of the current customer object
     * @return copy of the current customer object
     */
    public Asiakas copy() {
        return new Asiakas(nimi, osoite, kengännumero, hatunkoko);
    }

    /**
     * Method to return a string representation of the customer object
     * @return string representation of the customer object
     */
    @Override
    public String toString() {
        return "Asiakas{" +
                "nimi='" + nimi + '\'' +
                ", osoite='" + osoite + '\'' +
                ", kengännumero=" + kengännumero +
                ", hatunkoko=" + hatunkoko +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer 1 name: ");
        String nimi1 = sc.nextLine();
        System.out.print("Enter customer 1 address: ");
        String osoite1 = sc.nextLine();
        System.out.print("Enter customer 1 shoe size: ");
        double kengännumero1 = sc.nextDouble();
        System.out.print("Enter customer 1 hat size: ");
        int hatunkoko1 = sc.nextInt();

        System.out.print("Enter customer 2 name: ");
        sc.nextLine();
        String nimi2 = sc.nextLine();
        System.out.print("Enter customer 2 address: ");
        String osoite2 = sc.nextLine();
        System.out.print("Enter customer 2 shoe size: ");
        double kengännumero2 = sc.nextDouble();
        System.out.print("Enter customer 2 hat size: ");
        int hatunkoko2 = sc.nextInt();

        Asiakas asiakas1 = new Asiakas(nimi1, osoite1, kengännumero1, hatunkoko1);
        Asiakas asiakas2 = new Asiakas(nimi2, osoite2, kengännumero2, hatunkoko2);
        Asiakas asiakas3 = asiakas2.copy();

        System.out.println("Is customer 1 and customer 2 equal: " + asiakas1.equals(asiakas2));
        System.out.println("Is customer 2 and customer 3 equal: " + asiakas2.equals(asiakas3));
        System.out.println("Customer 1 information: " + asiakas1.toString());
        System.out.println("Customer 2 information: " + asiakas2.toString());
        System.out.println("Customer 3 information: " + asiakas3.toString());
    }
}

