package Viikko2;

import java.util.Scanner;

public class Kuukausikulut {
    private String nimi;
    private double opintotuki;
    private double palkkatulot;
    private double asunnonKuukausivuokra;
    private double ruokaostokset;
    private double vaateostokset;
    private double huvitukset;

    // constructor that takes in a name as a parameter
    public Kuukausikulut(String nimi) {
        this.nimi = nimi;
    }

    // get and set methods for all fields
    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public double getOpintotuki() {
        return opintotuki;
    }

    public void setOpintotuki(double opintotuki) {
        this.opintotuki = opintotuki;
    }

    public double getPalkkatulot() {
        return palkkatulot;
    }

    public void setPalkkatulot(double palkkatulot) {
        this.palkkatulot = palkkatulot;
    }

    public double getAsunnonKuukausivuokra() {
        return asunnonKuukausivuokra;
    }

    public void setAsunnonKuukausivuokra(double asunnonKuukausivuokra) {
        this.asunnonKuukausivuokra = asunnonKuukausivuokra;
    }

    public double getRuokaostokset() {
        return ruokaostokset;
    }

    public void setRuokaostokset(double ruokaostokset) {
        this.ruokaostokset = ruokaostokset;
    }

    public double getVaateostokset() {
        return vaateostokset;
    }

    public void setVaateostokset(double vaateostokset) {
        this.vaateostokset = vaateostokset;
    }

    public double getHuvitukset() {
        return huvitukset;
    }

    public void setHuvitukset(double huvitukset) {
        this.huvitukset = huvitukset;
    }

    // method that returns the sum of all expenses and income, as well as the monthly balance (expenses - income)
    public double summaJaSaldo() {
        double tulot = opintotuki + palkkatulot;
        double menot = asunnonKuukausivuokra + ruokaostokset + vaateostokset + huvitukset;
        double saldo = tulot - menot;
        return saldo;
    }

    // toString method that prints all field values and the sum of expenses and income, as well as the monthly balance
    @Override
    public String toString() {
        return "Kuukausikulut [nimi=" + nimi + ", opintotuki=" + opintotuki + ", palkkatulot=" + palkkatulot
                + ", asunnonKuukausivuokra=" + asunnonKuukausivuokra + ", ruokaostokset=" + ruokaostokset
                + ", vaateostokset=" + vaateostokset + ", huvitukset=" + huvitukset + "]";
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // prompt the user to enter their name
        System.out.print("Enter your name: ");
        String nimi = scanner.nextLine();

        // create an object of the Kuukausikulut class using the constructor that takes in the user's name
        Kuukausikulut kk = new Kuukausikulut(nimi);

        // prompt the user to enter their income and expenses for the month
        System.out.print("Enter your study grant: ");
        double opintotuki = scanner.nextDouble();
        kk.setOpintotuki(opintotuki);

        System.out.print("Enter your salary: ");
        double palkkatulot = scanner.nextDouble();
        kk.setPalkkatulot(palkkatulot);

        System.out.print("Enter your rent: ");
        double asunnonKuukausivuokra = scanner.nextDouble();
        kk.setAsunnonKuukausivuokra(asunnonKuukausivuokra);

        System.out.print("Enter your grocery expenses: ");
        double ruokaostokset = scanner.nextDouble();
        kk.setRuokaostokset(ruokaostokset);

        System.out.print("Enter your clothing expenses: ");
        double vaateostokset = scanner.nextDouble();
        kk.setVaateostokset(vaateostokset);

        System.out.print("Enter your entertainment expenses: ");
        double huvitukset = scanner.nextDouble();
        kk.setHuvitukset(huvitukset);

        // calculate the sum of expenses and income, as well as the monthly balance
        double saldo = kk.summaJaSaldo();
        System.out.println("The sum of expenses and income is: " + saldo);
        System.out.println(kk);
    }
}