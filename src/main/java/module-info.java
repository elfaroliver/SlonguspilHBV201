module hi.verkefni.slonguspil {
    requires javafx.controls;
    requires javafx.fxml;


    opens hi.verkefni.slonguspil to javafx.fxml;
    exports hi.verkefni.slonguspil;
}