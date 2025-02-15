package hi.verkefni.vinnsla;
import javafx.beans.property.SimpleStringProperty;

import java.util.HashMap;

public class Leikmadur {
    private SimpleStringProperty fyrstaNafn;
    private SimpleStringProperty seinnaNafn;
    private final HashMap<Integer, Integer> slongurStigar;
    private int reitur = 0;
    private int max = 100;

    public Leikmadur(HashMap<Integer, Integer> slongurStigar) {
        this.slongurStigar = slongurStigar;
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

    public void move(int currentReitur) {
        Teningur teningur = new Teningur();
        teningur.kasta();
        int kast = teningur.getKast();
        this.reitur += kast;
        //this.reitur += reitur;
        //System.out.println("Leikmaður færist um " + kast + " reiti.");
        //System.out.println("Leikmaður er nú á reit " + this.reitur);
        if (this.reitur >= max) {
            System.out.println("Leikmaður hefur unnið!");
        }
        if (currentReitur >= max) {
            System.out.println("Leikmaður hefur unnið!");
        }

        HashMap<Object, Object> slongurStigar = new HashMap<>();
        if (slongurStigar.containsKey(currentReitur)) {  // Notaðu this.reitur
            int nyReitur = (int) slongurStigar.get(this.reitur);  // Uppfærir reit leikmanns ef það er slanga/stigi
            System.out.println("Leikmaður færist frá reit " + this.reitur + " til reits " + nyReitur);
            this.reitur = nyReitur;  // Uppfærir reitinn
        } else {
            System.out.println("Leikmaður er á reit " + this.reitur + " og færist ekki með slöngu eða stiga.");
        }

        if (currentReitur == 98) {
            currentReitur = 78;
        }
    }

    public static void main(String[] args) {
        SimpleStringProperty nafn = new SimpleStringProperty();
        SlongurStigar slongurStigar = new SlongurStigar();
        Leikmadur leikmadur = new Leikmadur(slongurStigar.getSlongurStigar());
        int reitur = 0;
        leikmadur.move(reitur);
    }
}
