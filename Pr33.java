import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import java.util.Random;

public class Pr33 extends Application {
    public void start(Stage stage) {
        VBox vbox = new VBox(15);
        vbox.setAlignment(Pos.CENTER);

        Random random = new Random();

        for (int i = 1; i <= 5; i++) {
            Text text = new Text("Text " + i);
            text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));

            Color color = new Color(random.nextDouble(), random.nextDouble(), random.nextDouble(), 1.0);
            text.setFill(color);

            double opacity = 0.3 + (random.nextDouble() * 0.7);
            text.setOpacity(opacity);

            vbox.getChildren().add(text);
        }

        Scene scene = new Scene(vbox, 400, 300);
        stage.setTitle("JavaFX Text VBox");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

/*
Output:
A window appears with five text lines:
Text 1
Text 2
Text 3
Text 4
Text 5

All texts are vertically stacked in center with spacing.
Each text has:
- Font: Times New Roman, Bold Italic, Size 22
- Different random color
- Different opacity between 0.3 and 1.0
*/
