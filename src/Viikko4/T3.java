package Viikko4;

interface Nimeava {
    public void setNimi(String n);
    public String getNimi();
}

class Henkilo implements Nimeava {
    private String nimi;

    public void setNimi(String n) {
        this.nimi = n;
    }

    public String getNimi() {
        return nimi;
    }
}

class Main {
    public static void main(String[] args) {
        Henkilo henkilo = new Henkilo();
        henkilo.setNimi("John Doe");
        System.out.println(henkilo.getNimi());
    }
}