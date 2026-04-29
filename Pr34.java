import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Pr34 extends Application {
    public void start(Stage stage) {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);

        Label l1 = new Label("Roll No:");
        Label l2 = new Label("Name:");
        Label l3 = new Label("Age:");
        Label l4 = new Label("Email:");

        TextField t1 = new TextField();
        TextField t2 = new TextField();
        TextField t3 = new TextField();
        TextField t4 = new TextField();

        Button submit = new Button("Submit");

        grid.add(l1, 0, 0);
        grid.add(t1, 1, 0);
        grid.add(l2, 0, 1);
        grid.add(t2, 1, 1);
        grid.add(l3, 0, 2);
        grid.add(t3, 1, 2);
        grid.add(l4, 0, 3);
        grid.add(t4, 1, 3);
        grid.add(submit, 1, 4);

        submit.setOnAction(e -> {
            String roll = t1.getText();
            String name = t2.getText();
            String age = t3.getText();
            String email = t4.getText();

            try {
                int r = Integer.parseInt(roll);
                int a = Integer.parseInt(age);

                if (!email.contains("@") || !email.contains(".")) {
                    throw new Exception("Invalid Email");
                }

                FileChooser fc = new FileChooser();
                fc.setTitle("Save Data");
                File file = fc.showSaveDialog(stage);

                if (file != null) {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                    bw.write("Roll No: " + r + "\nName: " + name + "\nAge: " + a + "\nEmail: " + email);
                    bw.close();
                }

                Alert success = new Alert(Alert.AlertType.INFORMATION);
                success.setTitle("Success");
                success.setHeaderText("Registration Successful");
                success.setContentText("Roll No: " + r + "\nName: " + name + "\nAge: " + a + "\nEmail: " + email);
                success.showAndWait();

            } catch (NumberFormatException ex) {
                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setTitle("Error");
                error.setHeaderText("Invalid Input");
                error.setContentText("Roll No and Age must be integers");
                error.showAndWait();
            } catch (Exception ex) {
                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setTitle("Error");
                error.setHeaderText("Validation Failed");
                error.setContentText(ex.getMessage());
                error.showAndWait();
            }
        });

        Scene scene = new Scene(grid, 400, 300);
        stage.setTitle("Registration Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

/*
Output:
A window appears with a registration form having fields:
Roll No, Name, Age, Email and a Submit button.

If Roll No and Age are not integers → Error Alert shown.
If Email does not contain @ and . → Error Alert shown.

On valid input:
- File save dialog opens to store data.
- After saving, a confirmation alert displays entered details.
*/
