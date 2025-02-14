package hi.verkefni.slonguspil;
import javafx.beans.property.SimpleStringProperty;

public class Leikmadur {
    private SimpleStringProperty nafn;
    private int reitur;
    private int max;

    public Leikmadur() {
        this.reitur = 0;
        this.max = 100;
    }

    /**
     *
     * @param reitur er nýr reitur leikmanns
     * @param max er seinasti reiturinn. Sigurreiturinn
     */
    public void move(/*int reitur, int max*/) {
        Teningur teningur = new Teningur();
        teningur.kasta();
        int kast = teningur.getKast();
        reitur += kast;
        //this.reitur += reitur;
        //System.out.println("Leikmaður færist um " + kast + " reiti.");
        System.out.println("Leikmaður er nú á reit " + this.reitur);
        if (reitur >= max) {
            System.out.println("Leikmaður hefur unnið!");
        }
    }

    public static void main(String[] args) {
        SimpleStringProperty nafn = new SimpleStringProperty();
        Leikmadur leikmadur = new Leikmadur();
        leikmadur.move(/*leikmadur.reitur, leikmadur.max*/);
    }
}
