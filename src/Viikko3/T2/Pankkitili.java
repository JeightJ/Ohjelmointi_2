package Viikko3.T2;

/**
 *  Class models a Bank Account with a certain interest rate and balance.
 * @author epesonen
 */
public class Pankkitili {
    private double vuosiKorko;
    private double saldo;
    /**
     * Bank account with initial balance.
     * @param saldo
     */
    public Pankkitili(double saldo) {
        this.saldo = saldo;
    }
    /**
     * Setting the annual interest rate
     * @param vuosiKorko
     */
    public void setVuosiKorko(double vuosiKorko) {
        this.vuosiKorko = vuosiKorko;
    }

    /**
     * Depositing an amount to the account.
     * @param summa
     */
    public void talleta(double summa) {
        if (summa > 0){
            this.saldo += summa;
            System.out.println("Deposited " + summa);
        }
        else
            System.out.println("Amount must be a positive value!");
    }
    /**
     * Withdrawing an amount from the account.
     * @param summa
     */
    public void nosta(double summa) {
        if (summa < 0)
            System.out.println("Amount must be a positive value!");
        else if (summa <= this.saldo) {
            this.saldo -= summa;
            System.out.println("Withdrew " + summa);
        }
        else {
            System.out.println("Insufficient funds on the account.");
            System.out.println("Withdrew " + this.saldo);
            this.saldo = 0;
        }
    }
    /**
     * Adding monthly interest.
     */
    public void lisaaKorko() {
        this.saldo += (this.saldo * this.vuosiKorko / 100.0) / 12;
    }
    /**
     * Checking the balance.
     * @return
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * New constructor that takes a Pankkitili object as a parameter and creates a new object with the same balance as this Pankkitili object.
     * @param tili
     */
    public Pankkitili(Pankkitili tili) {
        this.saldo = tili.saldo;
    }

    public static void main(String[] args) {
        // Test the new constructor by creating a new bank account and copying the balance from another account
        Pankkitili tili1 = new Pankkitili(1000);
        Pankkitili tili2 = new Pankkitili(tili1);

        System.out.println("Account 1 balance: " + tili1.getSaldo());
        System.out.println("Account 2 balance: " + tili2.getSaldo());
    }
}