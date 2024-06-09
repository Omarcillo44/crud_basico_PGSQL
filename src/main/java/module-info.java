module org.example.crud_basico_pgsql {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.crud_basico_pgsql to javafx.fxml;
    exports org.example.crud_basico_pgsql;
    exports CRUD;
    opens CRUD to javafx.fxml;
}