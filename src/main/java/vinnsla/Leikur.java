package vinnsla;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.*;

public class Leikur {
    private List<Leikmadur> leikmenn;
    private Teningur teningur;
    private SlongurStigar slongurStigar;
    private int leikmadurIndex = 0;
    private SimpleBooleanProperty leikLokid = new SimpleBooleanProperty(false);
    private SimpleStringProperty sigurvegarinn = new SimpleStringProperty("");
    private SimpleStringProperty nextLeikmadur = new SimpleStringProperty();

    public Leikur(int fjoldiLeikmanna, int maxReitir) {
        leikmenn = new ArrayList<>(); // Leikmenn
        teningur = new Teningur(); // Teningur
        slongurStigar = new SlongurStigar(); // Sækir sssslöngur og stiga
        for (int i = 0; i < fjoldiLeikmanna; i++) {
            leikmenn.add(new Leikmadur("Leikmaður " + (i + 1)));
        } // Bætir við leikmönnum
        nyrLeikur(); // GO!
    }


    public void nyrLeikur() {
        for (Leikmadur leikmadur : leikmenn) {
            leikmadur.move(1, 100);  // Allir byrja á fyrsta reit
        }
        leikmadurIndex = 0;
        leikLokid.set(false); // Default ekki lokið
        sigurvegarinn.set("");
        nextLeikmadur.set(leikmenn.get(leikmadurIndex).getNafn());
    }

    /**
     * Hérna gerist allur leikurinn
     * @return
     */
    public boolean leikaLeik() {
        teningur.kasta();
        Leikmadur leikmadur = leikmenn.get(leikmadurIndex);
        int nyrReitur = leikmadur.getReitur() + teningur.getTala();
        nyrReitur = slongurStigar.finnaLendingarreit(nyrReitur);
        leikmadur.move(nyrReitur, 100);

        if (nyrReitur == 100) {
            leikLokid.set(true);
            sigurvegarinn.set(leikmadur.getNafn());
        }

        leikmadurIndex = (leikmadurIndex + 1) % leikmenn.size();
        nextLeikmadur.set(leikmenn.get(leikmadurIndex).getNafn());

        return leikLokid.get();
    }

    // Main fall til að prófa Leikur
    public static void main(String[] args) {
        Leikur leikur = new Leikur(4, 6);
        leikur.nyrLeikur();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Á næsti leikmaður að gera? ");
        String svar = scanner.next();
        while ("j".equalsIgnoreCase(svar)) {
            if (leikur.leikaLeik()) {
                System.out.println(leikur.sigurvegarinn.get() + " kominn í mark");
                return;
            }
            System.out.print("Á næsti leikmaður að gera?");
            svar = scanner.next();
        }
    }
}
