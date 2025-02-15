module hi.verkefni.slonguspil {
    requires javafx.controls;
    requires javafx.fxml;


    opens hi.verkefni.vinnsla to javafx.fxml;
    exports hi.verkefni.vinnsla;
}