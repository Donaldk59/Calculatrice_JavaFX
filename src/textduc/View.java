package textduc;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import textduc.Controller;

public class View {
    private TextField number1Field;
    private TextField number2Field;
    private Label sumLabel;
    private Button calculateButton;

    private Controller controller;

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void initialize(Stage primaryStage) {
        primaryStage.setTitle("Somme de deux nombres");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setHgap(10);
        grid.setVgap(10);

        number1Field = new TextField();
        number2Field = new TextField();
        sumLabel = new Label();
        calculateButton = new Button("Calculer");
        calculateButton.setOnAction(e -> controller.calculateSum());

        grid.add(new Label("Nombre 1:"), 0, 0);
        grid.add(number1Field, 1, 0);
        grid.add(new Label("Nombre 2:"), 0, 1);
        grid.add(number2Field, 1, 1);
        grid.add(calculateButton, 0, 2);
        grid.add(new Label("Somme:"), 0, 3);
         grid.add(sumLabel, 1, 3);

        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public int getNumber1() {
        try {
            return Integer.parseInt(number1Field.getText());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public int getNumber2() {
        try {
            return Integer.parseInt(number2Field.getText());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public void setSum(int sum) {
        sumLabel.setText(Integer.toString(sum));
    }
}