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

    public int finnaLendingarreit(int reitur) {
        return slongurStigar.getOrDefault(reitur, reitur);
    }

    public HashMap<Integer, Integer> getSlongurStigar() {
        return slongurStigar;
    }

    /**
     *
     */
    public void move() {
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
    }

    public boolean containsKey(int reitur) {
        return true;
    }
}
