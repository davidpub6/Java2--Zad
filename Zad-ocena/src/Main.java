import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.*;

public class Main extends Application{

    @Override
    public void start(Stage stage) {
        GridPane grid = new GridPane();

        GridPane color = new GridPane();
        GridPane.setConstraints(color,2,2);

        ToggleGroup colors = new ToggleGroup();

        RadioButton black = new RadioButton("black");
        RadioButton red = new RadioButton("red");
        RadioButton green = new RadioButton("green");

        GridPane.setRowIndex(black, 1);
        GridPane.setRowIndex(red, 2);
        GridPane.setRowIndex(green, 3);

        black.setToggleGroup(colors);
        red.setToggleGroup(colors);
        green.setToggleGroup(colors);

        color.getChildren().addAll(black,red,green);

        Button submit = new Button("Submit");
        GridPane.setConstraints(submit, 1, 3);

        Button clear = new Button("Clear");

        GridPane.setConstraints(clear, 3, 3);



        grid.getChildren().addAll(color, submit, clear);

        Scene scene = new Scene(grid, 200,200);
        submit.setOnAction(e -> {
            if(black.isSelected()){
                //scene.setUserAgentStylesheet("black.css");
                grid.setStyle("-fx-background-color: black;");
            } else if (red.isSelected()) {
                //scene.setUserAgentStylesheet("red.css");
                grid.setStyle("-fx-background-color: red;");
            } else if (green.isSelected()) {
                //scene.setUserAgentStylesheet("green.css");
                grid.setStyle("-fx-background-color: green;");
            }
        });
        clear.setOnAction(e -> {
            colors.getSelectedToggle().setSelected(false);
            //scene.setUserAgentStylesheet("default.css");
            grid.setStyle("-fx-background-color: default;");

        });
        stage.setTitle("Title");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}