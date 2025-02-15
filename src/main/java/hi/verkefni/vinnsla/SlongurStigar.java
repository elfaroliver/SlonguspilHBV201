package hi.verkefni.vinnsla;

import java.util.HashMap;

public class SlongurStigar {
    private static HashMap<Integer, Integer> slongurStigar;

    private int reitur;
    private int max;

    public SlongurStigar() {
        slongurStigar = new HashMap<>();

        /**
         * Ssssslöngur fyrir neðan
         */

        slongurStigar.put(98, 78);
        slongurStigar.put(95, 79);
        slongurStigar.put(93, 69);
        slongurStigar.put(78, 33);
        slongurStigar.put(71, 63);
        slongurStigar.put(55, 23);
        slongurStigar.put(31, 18);
        slongurStigar.put(17, 11);

        /**
         * Stigar fyrir neðan
         */
        slongurStigar.put(3, 13);
        slongurStigar.put(12, 32);
        slongurStigar.put(28, 84);
        slongurStigar.put(34, 46);
        slongurStigar.put(42, 50);
        slongurStigar.put(51, 67);
        slongurStigar.put(59, 64);
        slongurStigar.put(72, 92);
        slongurStigar.put(80, 100);
    }

    public HashMap<Integer, Integer> getSlongurStigar() {
        return slongurStigar;
    }

    /**
     *
     */
    public void move(/*int reitur, int max*/) {

        this.reitur = 0;
        this.max = 100;

        Teningur teningur = new Teningur();
        teningur.kasta();
        int kast = teningur.getKast();
        reitur += kast;

    }

    public void move(int currentReitur) {
        if (slongurStigar.containsKey(currentReitur)) {
            int nyReitur = slongurStigar.get(currentReitur);
            System.out.println("Leikmaður færist frá reit " + currentReitur + " til reits " + nyReitur);
            // Breyttu reitnum
            currentReitur = nyReitur;
        } else {
            System.out.println("Leikmaður er á reit " + currentReitur + " og færist ekki.");
        }

        if (reitur >= max) {
            System.out.println("Leikmaður hefur unnið!");
        }
    }

    public static void main(String[] args) {
        Leikmadur leikmadur = new Leikmadur(slongurStigar);
        int reitur = 0;  // Upphafs reitur
        leikmadur.move(reitur);
    }
}
