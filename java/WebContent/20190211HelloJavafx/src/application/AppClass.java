package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppClass extends Application { //856p

	@Override //재정의 하는 어노테이션
	public void start(Stage primaryStage) throws Exception {
		VBox root = new VBox();
		root.setPrefWidth(350); //윈도우 가로창
		root.setPrefHeight(150); //윈도우 세로창
		root.setAlignment(Pos.CENTER); //가운데정렬
		root.setSpacing(20); //간격이 20px
		
		Label label = new Label(); //글자를 보여주는 객체
		label.setText("Hello, JavaFX"); //set을 통해서 값을 넣어줌
		label.setFont(new Font(50)); //글자크기는 50
		
		Button button = new Button(); //버튼 객체
		button.setText("확인"); //버튼이름
		button.setOnAction(event->Platform.exit()); //버튼을 눌렀을때 종료하도록함
		
		root.getChildren().add(label); //글자와
		root.getChildren().add(button); //버튼을 화면에 출력해줌
		
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("AppMain"); //타이틀이름을 AppMain 정의해주고
		primaryStage.setScene(scene);  //타이틀이름을 출력해주도록함
		primaryStage.show(); //윈도우 창을 출력해줌
	}
	
	public static void main(String[] args) {
		launch(args); //자바 FX 어플리케이션을 실행하는 명령구문
	}

}
