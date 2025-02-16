module hi.verkefni.vinnsla {
    requires javafx.controls;
    requires javafx.fxml;


    opens vidmot to javafx.fxml;
    exports vidmot;

    opens vinnsla to javafx.fxml;
    exports vinnsla;
}