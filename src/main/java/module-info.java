module com.example.diud04componentes {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.diud04componentes to javafx.fxml;
    exports com.example.diud04componentes;
}