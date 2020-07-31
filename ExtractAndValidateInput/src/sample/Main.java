package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    Stage window;
    Scene scene;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("JavaFX Vladan Cupric");

        // Form
        TextField nameInput = new TextField();

        button = new Button("Click me");
        button.setOnAction(e -> isInt(nameInput, nameInput.getText()));

        // Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(nameInput, button);


        scene = new Scene(layout, 300, 350);
        window.setScene(scene);
        window.show();

    }

    private boolean isInt(TextField input, String message) {
        try {
            int age = Integer.parseInt(input.getText());
            System.out.println(" User is: " + age);
            return true;

        } catch (NumberFormatException ex) {
            System.out.println("Error " + message + " is not a number");
            return false;
        }

    }
}
