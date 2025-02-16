package hi.verkefni.vinnsla;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

import java.util.Random;

public class Teningur {
    private static final int MAX = 6;
    private final IntegerProperty talaProperty = new SimpleIntegerProperty(MAX);
    private final Random random = new Random();
    private int tala;
    private int kast;

    public String toString() {
        return "Kast: " + kast;
    }

    public void kasta() {
        int tala = random.nextInt(MAX) + 1;
        talaProperty.set(tala);  // Uppfærir talaProperty með nýju tölunni
    }

    public int getKast() {
        return kast;
    }

    public static void main(String[] args) {
        Teningur teningur = new Teningur();
        teningur.kasta();
    }

    public int getTala() {
        return talaProperty.get();
    }

    public IntegerProperty talaProperty() {
        return talaProperty;
    }
}
