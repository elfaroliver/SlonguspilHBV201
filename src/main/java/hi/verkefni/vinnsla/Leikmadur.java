package hi.verkefni.vinnsla;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Leikmadur {
    private final StringProperty nafn = new SimpleStringProperty();
    private final IntegerProperty reitur = new SimpleIntegerProperty();
    //private int reitur = 0;
    private final int max = 100;

    public Leikmadur(String nafn) {
        this.nafn.set(nafn);  // Geymir nafnið í nafn-property
        this.reitur.set(1);    // Byrjar á reit 1
    }

    public void move(int kast, int max) {
        int nyrReitur = this.reitur.get() + kast;
        if (nyrReitur <= max) {
            this.reitur.set(nyrReitur);
        } else {
            this.reitur.set(max);
        }
    }

    public String getNafn() {
        return nafn.get();
    }

    public int getReitur() {
        return reitur.get();
    }

    public IntegerProperty reiturProperty() {
        return reitur;
    }

    public StringProperty nafnProperty() {
        return nafn;
    }

    public static void main(String[] args) {
        Leikmadur leikmadur = new Leikmadur("Elfar");
        System.out.println(leikmadur.getNafn() + " er á reit " + leikmadur.getReitur());
        leikmadur.move(36, 30);
        System.out.println(leikmadur.getNafn() + " er á reit " + leikmadur.getReitur());
    }
}

/**
 * @param max    er seinasti reiturinn. Sigurreiturinn
 * @param reitur er nýr reitur leikmanns
 */
    /*public void move(int reitur, int max) {
        Teningur teningur = new Teningur();
        teningur.kasta();
        int kast = teningur.getKast();
        Leikmadur.reitur += kast;
        //this.reitur += reitur;
        //System.out.println("Leikmaður færist um " + kast + " reiti.");
        //System.out.println("Leikmaður er nú á reit " + this.reitur);
        if (this.reitur >= max) {
            System.out.println("Leikmaður hefur unnið!");
        }
    }*/
