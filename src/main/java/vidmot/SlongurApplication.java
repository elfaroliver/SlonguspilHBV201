package vidmot;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import vinnsla.Leikur;

import java.io.IOException;

public class SlongurApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SlongurApplication.class.getResource("snakes.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Slönguspil");
        stage.setScene(scene);
        stage.show();

        //SlongurController controller = fxmlLoader.getController();
        //controller.setLeikur(new Leikur());
    }

    public static void main(String[] args) {
        launch();
    }
}