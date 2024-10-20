import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;


public class Main extends Application {
    public void start(Stage stage) {
        VBox content = new VBox(10);

        HBox row1 = new HBox(10);
        Button drum1 = new Button("1");
        drum1.setId("D1");
        Button drum2 = new Button("2");
        drum2.setId("D2");
        Button drum3 = new Button("3");
        drum3.setId("D3");
        row1.getChildren().addAll(drum1, drum2, drum3);

        HBox row2 = new HBox(10);
        Button drum4 = new Button("4");
        drum4.setId("D4");
        Button drum5 = new Button("5");
        drum5.setId("D5");
        Button drum6 = new Button("6");
        drum6.setId("D6");
        row2.getChildren().addAll(drum4, drum5, drum6);

        HBox row3 = new HBox(10);
        Button drum7 = new Button("7");
        drum7.setId("D7");
        Button drum8 = new Button("8");
        drum8.setId("D8");
        Button drum9 = new Button("9");
        drum9.setId("D9");
        row3.getChildren().addAll(drum7, drum8, drum9);

        content.getChildren().addAll(row1, row2, row3);

        Scene scene = new Scene(content, 500, 500);

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