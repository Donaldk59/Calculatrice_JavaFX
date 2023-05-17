package textduc;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller();

        controller.setModel(model);
        controller.setView(view);

        view.setController(controller);

        view.initialize(primaryStage);
    }
}
