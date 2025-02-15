package hi.verkefni.vinnsla;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Teningur {
    private static final int MAX = 6;
    private final IntegerProperty talaProperty = new SimpleIntegerProperty(MAX);
    private int tala;
    private int kast;

    public Teningur() {
        //IntegerProperty tala = new SimpleIntegerProperty((6) + 1);
        //this.tala = 6;
    }

    public String toString() {
        return "Kast: " + kast;
    }

    public void kasta() {
        //new Teningur();
        //System.out.println(new Teningur());

        kast = (int)(Math.random() * MAX) + 1;
        System.out.println(this);
    }

    public int getKast() {
        return kast;
    }

    public static void main(String[] args) {
        Teningur teningur = new Teningur();
        teningur.kasta();
    }

    public int getTalaProperty() {
        return talaProperty.get();
    }

    public IntegerProperty talaPropertyProperty() {
        return talaProperty;
    }
}
