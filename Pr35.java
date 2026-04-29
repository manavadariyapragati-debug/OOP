import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class Pr35 extends Application {
    public void start(Stage stage) {
        HBox root = new HBox(30);
        root.setAlignment(Pos.BOTTOM_CENTER);

        VBox v1 = new VBox(5);
        v1.setAlignment(Pos.BOTTOM_CENTER);
        Rectangle r1 = new Rectangle(60, 20 * 5);
        r1.setFill(Color.RED);
        Text t1 = new Text("Projects - 20%");
        v1.getChildren().addAll(r1, t1);

        VBox v2 = new VBox(5);
        v2.setAlignment(Pos.BOTTOM_CENTER);
        Rectangle r2 = new Rectangle(60, 10 * 5);
        r2.setFill(Color.BLUE);
        Text t2 = new Text("Quizzes - 10%");
        v2.getChildren().addAll(r2, t2);

        VBox v3 = new VBox(5);
        v3.setAlignment(Pos.BOTTOM_CENTER);
        Rectangle r3 = new Rectangle(60, 30 * 5);
        r3.setFill(Color.GREEN);
        Text t3 = new Text("Midterm Exams - 30%");
        v3.getChildren().addAll(r3, t3);

        VBox v4 = new VBox(5);
        v4.setAlignment(Pos.BOTTOM_CENTER);
        Rectangle r4 = new Rectangle(60, 40 * 5);
        r4.setFill(Color.ORANGE);
        Text t4 = new Text("Final Exam - 40%");
        v4.getChildren().addAll(r4, t4);

        root.getChildren().addAll(v1, v2, v3, v4);

        Scene scene = new Scene(root, 500, 300);
        stage.setTitle("Grade Distribution Bar Chart");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

/*
Output:
A window appears showing four vertical bars arranged horizontally.

Bars:
Projects - 20% (Red)
Quizzes - 10% (Blue)
Midterm Exams - 30% (Green)
Final Exam - 40% (Orange)

Each bar has proportional height and label displayed below it.
*/
