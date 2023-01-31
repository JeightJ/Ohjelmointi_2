package Viikko3.T7;

class Pankkitili {
    private int id;
    private double saldo;

    public Pankkitili(int id, double saldo) {
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

public class Pankkiautomaatti {
    public static void main(String[] args) {
        Pankkitili[] tileja = new Pankkitili[10];
        for (int i = 0; i < 10; i++) {
            tileja[i] = new Pankkitili(i + 1, 100);
        }

        tileja[0].tapahtuma(50);
        tileja[1].tapahtuma(-25);
        tileja[2].tapahtuma(10);
        // ... add more transactions ...

        for (Pankkitili tili : tileja) {
            System.out.println("Tilin " + tili.getId() + " saldo: " + tili.getSaldo());
        }
    }
}