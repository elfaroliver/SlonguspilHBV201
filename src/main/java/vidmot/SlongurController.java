package vidmot;

import javafx.event.ActionEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import vinnsla.*;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.util.List;

import static javafx.application.Application.launch;

public class SlongurController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private Button fxTeningur;
    @FXML
    private Button fxNyrLeikur;
    @FXML
    private Label fxSkilabod1;
    @FXML
    private Label fxSkilabod2;
    @FXML
    private GridPane fxBord;
    private Leikur leikur;
    private Teningur teningur;
    private Circle leikmadur;
    private int reitur = 0; // Staðsetning leikmanns
    private final int max = 100; // Lokareitur
    private SlongurStigar slongurStigar = new SlongurStigar(); // Slöngur og stigar

    @FXML
    public void initialize() {
        // Listi af reitum á borðinu
        List<Node> reitir = fxBord.getChildren();

        fxTeningur.disableProperty();

        fxTeningur.setText("Teningur");
        fxNyrLeikur.setText("Nýr leikur");
        fxSkilabod1.setText("Góðan daginn");
        fxSkilabod2.setText("Skilaboð 2");
        if (teningur == null) {
            teningur = new Teningur(); // Teningur settur
        }
        leikur = new Leikur(2, 100);

        //this.leikur = new Leikur();
        //this.leikur.setTeningur(new Teningur());
        fxBord.setStyle("-fx-border-color: black;");
    }

    public void setLeikur(Leikur leikur) {
        this.leikur = leikur;
        if (this.leikur != null) {
            this.teningur = new Teningur(); // Setja teninginn ef leikurinn er ekki null
            this.leikur.setTeningur(teningur);  // Setur teninginn í leikinn
        }
    }

    public void fxNyrLeikur(ActionEvent event) {
        if (leikur != null) {
            leikur.nyrLeikur();
            fxSkilabod1.setText("Leikur er hafinn");
        } else {
            System.out.println("Leikur er ekki uppsettur!");
        }
    }

    public void setTeningur(Teningur teningur) {
        this.teningur = teningur;
    }

    public void fxTeningur(ActionEvent event) {
        if (teningur != null) {
            int utkoma = teningur.kasta();
            fxSkilabod2.setText("Kastið er: " + utkoma);
        } else {
            fxSkilabod2.setText("Teningur er ekki uppsettur!");
        }
    }

    public void move() {
        Teningur teningur = new Teningur();
        teningur.kasta();
        int kast = teningur.getKast();
        int gamliReitur = reitur; // Gamli staðurinn
        reitur += kast;

        // Athuga slöngur og stiga
        this.reitur = slongurStigar.finnaLendingarreit(reitur);

        if (slongurStigar.containsKey(reitur)) {
            reitur = slongurStigar.finnaLendingarreit(reitur);
        }

        // Skilaboð ef leikmaður vinnur
        if (reitur >= max) {
            System.out.println("Leikmaður hefur unnið!");
        }
    }
}