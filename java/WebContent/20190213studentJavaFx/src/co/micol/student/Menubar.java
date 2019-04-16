package co.micol.student;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;

public class Menubar implements Initializable {
	@FXML
	private MenuItem btn11;
	@FXML
	private MenuItem btn22;
	@FXML
	private MenuItem btn33;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

		btn11.setOnAction(new EventHandler<ActionEvent>() { // 56~84줄까지 버튼기능

			@Override
			public void handle(ActionEvent event) { // 자바표현식
				handleBtn11Action(event);

			}
		});

		btn22.setOnAction(event -> handleBtn22Action(event)); // 람다표현식
		btn33.setOnAction(event -> handleBtn33Action(event));
	}

	public void handleBtn11Action(ActionEvent event) {
		Platform.exit();
	}

	public void handleBtn22Action(ActionEvent event) {
		Platform.exit();
	}

	public void handleBtn33Action(ActionEvent event) {
		Platform.exit();
	}

}
