module CRUD {
        requires javafx.controls;
        requires javafx.fxml;
        requires java.sql;

        exports CRUD;
        opens CRUD to javafx.fxml;
}
