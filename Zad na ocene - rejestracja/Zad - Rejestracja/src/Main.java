import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.*;
import javafx.scene.Scene;

import java.util.Date;


public class Main extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        HBox hBLogin = new HBox(10);
        Label lLogin = new Label("Login : ");
        TextField inLogin = new TextField();
        hBLogin.getChildren().addAll(lLogin, inLogin);

        HBox hBPass = new HBox(10);
        Label lPass = new Label("Password : ");
        PasswordField inPass = new PasswordField();
        hBPass.getChildren().addAll(lPass, inPass);

        HBox hBDate = new HBox(10);
        Label lDate = new Label("Date of birth : ");
        ComboBox<String> comboDay = new ComboBox<>();
        comboDay.getItems().addAll("1","2","3","4","5","6","7","8","9",
                                        "10","11","12","13","14","15","16","17","18","19",
                                        "20","21","22","23","24","25","26","27","28","29",
                                        "30","31");
        ComboBox<String> comboMonth = new ComboBox<>();
        comboMonth.getItems().addAll("1","2","3","4","5","6","7","8","9","10","11","12");
        ComboBox<String> comboYear = new ComboBox<>();
        comboYear.getItems().addAll("1940","1950","1960","1970","1980","1990","2000","2010","2020");
        hBDate.getChildren().addAll(lDate, comboDay, comboMonth, comboYear);

        HBox hBGender = new HBox(10);
        Label lGender = new Label("Gender : ");
        ToggleGroup tGender = new ToggleGroup();
        RadioButton radioMale = new RadioButton("Male");
        RadioButton radioFemale = new RadioButton("Female");
        radioMale.setToggleGroup(tGender);
        radioFemale.setToggleGroup(tGender);
        hBGender.getChildren().addAll(lGender, radioMale, radioFemale);

        HBox hBSubmit = new HBox(10);
        Button submit = new Button("Submit");
        hBSubmit.getChildren().addAll(submit);

        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(hBLogin, hBPass, hBDate, hBGender, hBSubmit);

        submit.setOnAction(e -> {
            VBox info = new VBox(10);

            if (!inPass.getText().isEmpty()) {
                HBox infoLogin = new HBox(10);
                Label inLog = new Label(inLogin.getText());
                infoLogin.getChildren().addAll(lLogin, inLog);

                HBox infoPass = new HBox(10);
                Label infoP = new Label(inPass.getText());
                infoPass.getChildren().addAll(lPass, infoP);

                HBox infoDate = new HBox(10);
                Label infDate = new Label(comboDay.getValue() + "/" + comboMonth.getValue() + "/" + comboYear.getValue());
                infoDate.getChildren().addAll(lDate, infDate);

                HBox infoGender = new HBox(10);
                RadioButton radGender = (RadioButton) tGender.getSelectedToggle();
                Label infGender = new Label(radGender.getText());
                infoGender.getChildren().addAll(lGender, infGender);

                info.getChildren().addAll(infoLogin, infoPass, infoDate, infoGender);
            }
            else {
                Label noPass = new Label("Please provide the password");
                info.getChildren().addAll(noPass);
            }
            Scene infoScene = new Scene(info, 300, 100);

            Stage newStage = new Stage();

            newStage.setTitle("Login Info");
            newStage.setScene(infoScene);
            newStage.show();
        });

        Scene scene = new Scene(vBox, 300, 300);

        stage.setTitle("Register");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}