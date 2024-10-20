import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;


public class Main extends Application {
    public void start(Stage stage) {
        VBox content = new VBox(10);

        VBox nazwa = new VBox(5);
            Label labelNazwa = new Label("NAZWA :");
            TextField inputNazwa = new TextField();
        nazwa.getChildren().addAll(labelNazwa, inputNazwa);

        VBox password = new VBox(5);
            Label labelPassword = new Label("PASSWORD :");
            PasswordField inputPassword = new PasswordField();
        password.getChildren().addAll(labelPassword, inputPassword);

        VBox role = new VBox(5);
            Label labelRole = new Label("ROLE :");
            ToggleGroup toggleRole = new ToggleGroup();
                RadioButton admin = new RadioButton("Admin");
                RadioButton user = new RadioButton("User");
                RadioButton guest = new RadioButton("Guest");
            toggleRole.getToggles().addAll(admin, user, guest);
        role.getChildren().addAll(labelRole, admin, user, guest);

        VBox submit = new VBox(5);
            Button buttonSubmit = new Button("Submit");
        submit.getChildren().addAll(buttonSubmit);

        VBox funny = new VBox(5);
        Button funnyButton = new Button("BRUH");
        funnyButton.setId("fButton");
        funny.getChildren().addAll(funnyButton);



        content.getChildren().addAll(nazwa, password, role, buttonSubmit, funny);

        Scene scene = new Scene(content, 500,500);

        stage.setTitle("Form");
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        launch(args);
    }
}