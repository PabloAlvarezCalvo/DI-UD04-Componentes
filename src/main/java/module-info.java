module com.example.diud04componentes {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.di.componentes to javafx.fxml;
    exports com.di.componentes;
    exports model;
    opens model to javafx.fxml;
}