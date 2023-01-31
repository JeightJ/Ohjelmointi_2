package Viikko2;

class Biisi {
    private String nimi;
    private String saveltaja;
    private String sanoittaja;
    private String esittaja;
    private int spotifySoittomaara;

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setSaveltaja(String saveltaja) {
        this.saveltaja = saveltaja;
    }

    public void setSanoittaja(String sanoittaja) {
        this.sanoittaja = sanoittaja;
    }

    public void setEsittaja(String esittaja) {
        this.esittaja = esittaja;
    }

    public void setSpotifySoittomaara(int spotifySoittomaara) {
        this.spotifySoittomaara = spotifySoittomaara;
    }

    public String getNimi() {
        return nimi;
    }

    public String getSaveltaja() {
        return saveltaja;
    }

    public String getSanoittaja() {
        return sanoittaja;
    }

    public String getEsittaja() {
        return esittaja;
    }

    public int getSpotifySoittomaara() {
        return spotifySoittomaara;
    }

    public void alustaja(String nimi, String saveltaja, String sanoittaja, String esittaja, int spotifySoittomaara) {
        setNimi(nimi);
        setSaveltaja(saveltaja);
        setSanoittaja(sanoittaja);
        setEsittaja(esittaja);
        setSpotifySoittomaara(spotifySoittomaara);
    }
}

public class T2 {
    public static void main(String[] args) {
        Biisi biisi1 = new Biisi();
        biisi1.alustaja("Mopedilla seinään", "Rauno Repomies", "Rauno Repomies", "Repomies, Rauno", 420);

        Biisi biisi2 = new Biisi();
        biisi2.alustaja("Timantit on ikuisia", "Cheekin kamu", "Cheek", "Cheek", 6969);

        Biisi biisi3 = new Biisi();
        biisi3.alustaja("En jaksa", "Keksiä Näitä", "Tekobiisejä", "Cheek", 1);

        System.out.println("Song1: ");
        System.out.println("Name: " + biisi1.getNimi());
        System.out.println("Composer: " + biisi1.getSaveltaja());
        System.out.println("Lyricist: " + biisi1.getSanoittaja());
        System.out.println("Performer: " + biisi1.getEsittaja());
        System.out.println("Spotify Plays: " + biisi1.getSpotifySoittomaara());
        System.out.println();

        System.out.println("Song2: ");
        System.out.println("Name: " + biisi2.getNimi());
        System.out.println("Composer: " + biisi2.getSaveltaja());
        System.out.println("Lyricist: " + biisi2.getSanoittaja());
        System.out.println("Performer: " + biisi2.getEsittaja());
        System.out.println("Spotify Plays: " + biisi2.getSpotifySoittomaara());
        System.out.println();

        System.out.println("Song3: ");
        System.out.println("Name: " + biisi3.getNimi());
        System.out.println("Composer: " + biisi3.getSaveltaja());
        System.out.println("Lyricist: " + biisi3.getSanoittaja());
        System.out.println("Performer: " + biisi3.getEsittaja());
        System.out.println("Spotify Plays: " + biisi3.getSpotifySoittomaara());
    }
}
