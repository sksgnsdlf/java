package co.micol.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HboxControl extends Application implements Initializable {

	@FXML private Button btn1;
	@FXML private Button btn2;
	@FXML private Button btn3;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) { //자바표현식
				handleBtn1Action(event);
				
			}
		});
		
		btn2.setOnAction(event -> handleBtn2Action(event)); //람다표현식
		btn3.setOnAction(event -> handleBtn3Action(event));
	}

	public void handleBtn1Action(ActionEvent event) {
		System.out.println("버튼 1누름");
	}
	public void handleBtn2Action(ActionEvent event) {
		System.out.println("버튼 2누름");
	}
	public void handleBtn3Action(ActionEvent event) {
		System.out.println("버튼 3누름");
	}
	
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub

	}
}
