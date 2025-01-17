import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

import javafx.scene.control.*;





public class Main extends Application{

    @Override
    public void start(Stage stage) throws Exception {

        Label tLable = new Label("TextField");
        TextField textField = new TextField();

        Label pLable = new Label("PasswordField");
        PasswordField passwordField = new PasswordField();

        Label rLable = new Label("RadioButton");
        ToggleGroup plec = new ToggleGroup();
        RadioButton radioButtonM = new RadioButton("Male");
        RadioButton radioButtonF = new RadioButton("F");
        radioButtonM.setToggleGroup(plec);
        radioButtonF.setToggleGroup(plec);


        Label cLable = new Label("ComboBox");
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("Option 1", "Option 2", "Option 3");

        Label bLabel = new Label("Button");
        Button button = new Button("Button");

        VBox vBox = new VBox(10);
        Insets inset = new Insets(10,10,10,10);

        vBox.setPadding(inset);
        vBox.getChildren().addAll(
                tLable, textField,
                pLable, passwordField,
                rLable, radioButtonM, radioButtonF,
                cLable, comboBox,
                bLabel, button);

        Scene scene = new Scene(vBox, 400, 400);

        stage.setTitle("Formularz");
        stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}