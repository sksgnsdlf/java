
import java.time.LocalDate;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class DialogTest extends Application {

	@Override
	public void start(Stage primaryStage) {
		// Create the DatePicker.
		DatePicker datePicker = new DatePicker();
		// Add some action (in Java 8 lambda syntax style).
		datePicker.setOnAction(event -> {
		    LocalDate date = datePicker.getValue();
		    System.out.println("Selected date: " + date);
		});

		// Add the DatePicker to the Stage.
		StackPane root = new StackPane();
		root.getChildren().add(datePicker);
		primaryStage.setScene(new Scene(root, 500, 650));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
