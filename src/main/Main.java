package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("client.fxml"));
        primaryStage.setTitle("SIMPLE CHAT");
        primaryStage.getIcons().add(new Image("logo.png"));
        primaryStage.centerOnScreen();
        primaryStage.setScene(new Scene(root, 720, 600));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
