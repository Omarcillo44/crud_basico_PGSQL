module org.example.crud_basico_pgsql {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.crud_basico_pgsql to javafx.fxml;
    exports org.example.crud_basico_pgsql;
}