import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HomeScreen extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane root = new GridPane();
        primaryStage.setTitle("TwitterActivism");
        TextField search = new TextField();
        search.setPrefWidth(150);
        search.setMaxWidth(150);
        search.setAlignment(Pos.TOP_LEFT);
        search.setEditable(true);
        search.relocate(100, 100);
        Button button = new Button();
        button.setText("Search");
        button.setLayoutX(100);
        button.setLayoutY(200);
        root.getChildren().addAll(search, button);
        primaryStage.setScene(new Scene(root, 450, 650));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
