package hi.verkefni.slonguspil;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Leikur {
    public Leikur(int i, int i1) {
    }

    public static void main(String[] args) {
        Leikur leikur = new Leikur(4, 6);
        leikur.nyrLeikur();
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.print("Á næsti leikmaður að gera? ");
        String svar = scanner.next();
        while ("j".equalsIgnoreCase(svar)) {
            if (leikur.leikaLeik()) {
                System.out.println(leikur.getLeikmadur() + "kominn í mark");
                return;
            }

            System.out.print("Á næsti leikmaður að gera?");
            svar = scanner.next();
        }
    }

    private boolean getLeikmadur() {
        return false;
    }

    private boolean leikaLeik() {
        return false;
    }

    private void nyrLeikur() {
    }
}
