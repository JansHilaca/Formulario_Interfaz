package Main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AllControls extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        // Set fixed width for the first column
        ColumnConstraints column1 = new ColumnConstraints();
        column1.setPrefWidth(150);
        gridPane.getColumnConstraints().add(column1);

        Label buttonLabel = new Label("Button:");
        Button button = new Button("Button");
        gridPane.add(buttonLabel, 0, 0);
        gridPane.add(button, 1, 0);

        Label checkBoxLabel = new Label("CheckBox:");
        CheckBox checkBox = new CheckBox("CheckBox");
        gridPane.add(checkBoxLabel, 0, 1);
        gridPane.add(checkBox, 1, 1);

        Label hyperlinkLabel = new Label("Hyperlink:");
        Hyperlink hyperlink = new Hyperlink("Hyperlink");
        gridPane.add(hyperlinkLabel, 0, 2);
        gridPane.add(hyperlink, 1, 2);

        Label toggleButtonLabel = new Label("ToggleButton:");
        ToggleButton toggleButton = new ToggleButton("ToggleButton");
        gridPane.add(toggleButtonLabel, 0, 3);
        gridPane.add(toggleButton, 1, 3);

        Label radioButtonLabel = new Label("RadioButton:");
        RadioButton radioButton = new RadioButton("RadioButton");
        gridPane.add(radioButtonLabel, 0, 4);
        gridPane.add(radioButton, 1, 4);

        Label labelLabel = new Label("Label:");
        Label label = new Label("Label");
        gridPane.add(labelLabel, 0, 5);
        gridPane.add(label, 1, 5);

        Label textFieldLabel = new Label("TextField:");
        TextField textField = new TextField("some text...");
        gridPane.add(textFieldLabel, 0, 6);
        gridPane.add(textField, 1, 6);

        Label passwordFieldLabel = new Label("PasswordField:");
        PasswordField passwordField = new PasswordField();
        passwordField.setText("password");
        gridPane.add(passwordFieldLabel, 0, 7);
        gridPane.add(passwordField, 1, 7);

        Label textAreaLabel = new Label("TextArea:");
        TextArea textArea = new TextArea("This is very long text that will wrap to several lines.");
        textArea.setWrapText(true);
        gridPane.add(textAreaLabel, 0, 8);
        gridPane.add(textArea, 1, 8);

        Label progressIndicatorLabel = new Label("ProgressIndicator:");
        ProgressIndicator progressIndicator = new ProgressIndicator(0.49);
        Label progressIndicatorValue = new Label("49%");
        gridPane.add(progressIndicatorLabel, 0, 9);
        gridPane.add(progressIndicator, 1, 9);
        gridPane.add(progressIndicatorValue, 2, 9);

        Label progressBarLabel = new Label("ProgressBar:");
        ProgressBar progressBar = new ProgressBar(0.9);
        gridPane.add(progressBarLabel, 0, 10);
        gridPane.add(progressBar, 1, 10);

        Label sliderLabel = new Label("Slider:");
        Slider slider = new Slider();
        gridPane.add(sliderLabel, 0, 11);
        gridPane.add(slider, 1, 11);

        Scene scene = new Scene(gridPane, 700, 560);
        primaryStage.setTitle("All Controls");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
