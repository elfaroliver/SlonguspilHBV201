package hi.verkefni.slonguspil;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SlongurController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}