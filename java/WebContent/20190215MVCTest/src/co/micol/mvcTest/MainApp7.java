package co.micol.mvcTest;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainApp7 extends Application {
	private Stage stage;
	
	@Override
	public void start(Stage primaryStage) {
		this.stage = primaryStage;
		this.stage.setTitle("성적처리");
		GradeModel6 model = new GradeModel6();
		this.stage.setScene(model.initLayout());
		this.stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
