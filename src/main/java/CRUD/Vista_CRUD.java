package CRUD;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import org.example.crud_basico_pgsql.HelloApplication;
import java.io.IOException;

public class Vista_CRUD extends Application {

    public void start(Stage stage2) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("vista_crud.fxml"));
        Scene scene2 = new Scene(fxmlLoader.load());
        stage2.setTitle("CRUD Básico | PGSQL");
        stage2.setScene(scene2);
        stage2.show();
    }

    @FXML
    public static void mostrarAlertInfo(String texto) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Información");
        alert.setContentText(texto);
        alert.showAndWait();
    }

    @FXML
    public static void mostrarAlertError(String texto) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("Error");
        alert.setContentText(texto);
        alert.showAndWait();
    }

    public static void initializeSpinner(Spinner<Integer> spinner) {
        // Configurar el modelo de valores: inicio, fin y paso
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100, 0, 1);
        spinner.setValueFactory(valueFactory);
    }

}
