package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

public class Principal extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        TabPane tabPane = (TabPane) FXMLLoader.load(this.getClass().getResource("Principal.fxml"));
        Scene scn = new Scene(tabPane);

        primaryStage.setScene(scn);
        primaryStage.setTitle("CRUD Professor Disciplina");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
