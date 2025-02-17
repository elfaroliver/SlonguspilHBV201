package vinnsla;

import java.util.HashMap;

public class SlongurStigar {
    private HashMap<Integer, Integer> slongurStigar;

    private int reitur;
    private int max;

    public SlongurStigar() {
        slongurStigar = new HashMap<>();

        /**
         * Ssssslöngur fyrir neðan
         */

        slongurStigar.put(23, 14);
        slongurStigar.put(16, 11);
        slongurStigar.put(15, 5);

        /**
         * Stigar fyrir neðan
         */
        slongurStigar.put(3, 13);
        slongurStigar.put(12, 17);
        slongurStigar.put(13, 18);
    }

    public int finnaLendingarreit(int reitur) {
        return slongurStigar.getOrDefault(reitur, reitur);
    }

    public HashMap<Integer, Integer> getSlongurStigar() {
        return slongurStigar;
    }

    /**
     *
     */
    /*public void move() {
        this.reitur = 0;
        this.max = 100;

        Teningur teningur = new Teningur();
        teningur.kasta();
        int kast = teningur.getKast();
        reitur += kast;

        if (slongurStigar.containsKey(reitur)) {
            reitur = slongurStigar.get(reitur); // Færir leikmann eftir sssslöngu/stiga
        }

        if (reitur >= max) {
            System.out.println("Leikmaður hefur unnið!");
        }
    }*/

    public boolean containsKey(int reitur) {
        return true;
    }
}
