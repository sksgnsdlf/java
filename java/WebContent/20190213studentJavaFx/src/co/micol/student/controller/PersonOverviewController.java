package co.micol.student.controller;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import co.micol.student.MainApp;
import co.micol.student.PersonBean;
import co.micol.student.StudentBean;
import co.micol.student.dao.Dao;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PersonOverviewController implements Initializable {

	@FXML
	private TableView<PersonBean> tableView;
	@FXML
	private TableColumn<PersonBean, String> tStudentId;
	@FXML
	private TableColumn<PersonBean, String> tStudentName;
	@FXML
	private TextField lstudentId;
	@FXML
	private TextField lstudentName;
	@FXML
	private TextField lstudentAddr;
	@FXML
	private TextField lstudentTel;
	
	private Stage dialogStage;
	private PersonBean PersonBean;
	private boolean okClicked = false;
	
	@FXML
	private Button btn1;
	@FXML
	private Button btn2;
	@FXML
	private Button btn3;
	@FXML
	private Button btn4;

	private MainApp mainApp;
	
	// 이벤트 메소드 구현
	public void setMainApp(MainApp mainApp) { 
		this.mainApp = mainApp;

		// 테이블에 observable 리스트 데이터를 추가한다.
		tableView.setItems(mainApp.getPersonData());
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {  //53~54줄 DB값 이동
		tStudentId.setCellValueFactory(cellData -> cellData.getValue().StudentId());
		tStudentName.setCellValueFactory(cellData -> cellData.getValue().StudentName());
	
	

		btn1.setOnAction(new EventHandler<ActionEvent>() { // 56~84줄까지 버튼기능

			@Override
			public void handle(ActionEvent event) { // 자바표현식
				handleBtn1Action(event);

			}
		});

		btn2.setOnAction(event -> handleBtn2Action(event)); // 람다표현식
		btn3.setOnAction(event -> {
			try {
				handleBtn3Action(event);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		btn4.setOnAction(event -> handleBtn4Action(event));
	}
	
	private void showPersonDetails(PersonBean personbean) {
	    if (personbean != null) {
	        // person 객체로 label에 정보를 채운다.
	    	lstudentId.setText(personbean.getStudentId());
	    	lstudentName.setText(personbean.getStudentName());
	    	lstudentAddr.setText(personbean.getStudentAddr());
	    	lstudentTel.setText(personbean.getStudentTel());

	        // TODO: 생일을 String으로 변환해야 한다!
	        // birthdayLabel.setText(...);
	    } else {
	        // person이 null이면 모든 텍스트를 지운다.
	    	lstudentId.setText("");
	    	lstudentName.setText("");
	    	lstudentAddr.setText("");
	    	lstudentTel.setText("");
	    }
	}
	
	public void setDialogstage(Stage dialogStage) {
		this.dialogStage = dialogStage;
	}

	public void setPerson(PersonBean PersonBean) {
		this.PersonBean = PersonBean;
		
		lstudentId.setText(PersonBean.getStudentId());
		lstudentId.setText(PersonBean.getStudentName());
		lstudentId.setText(PersonBean.getStudentAddr());
		lstudentId.setText(PersonBean.getStudentTel());
		
	}
	
	public boolean isOkClicked() {
		return okClicked;
	}
	
	private void handleOK() {
		if(isInputValid()) {
			PersonBean.setStudentId(lstudentId.getText());
			PersonBean.setStudentName(lstudentName.getText());
			PersonBean.setStudentAddr(lstudentAddr.getText());
			PersonBean.setStudentTel(lstudentTel.getText());
		}
	}
	
    private boolean isInputValid() {
        String errorMessage = "";

        if (lstudentId.getText() == null || lstudentId.getText().length() == 0) {
            errorMessage += "No valid ID!\n";
        }
        if (lstudentName.getText() == null || lstudentName.getText().length() == 0) {
            errorMessage += "No valid Name!\n";
        }
        if (lstudentAddr.getText() == null || lstudentAddr.getText().length() == 0) {
            errorMessage += "No valid Addr!\n";
        }
        if (lstudentTel.getText() == null || lstudentTel.getText().length() == 0) {
            errorMessage += "No valid Tel!\n";
        }
		return okClicked;
    }
	@FXML
    private void handleNewPerson() {
    	PersonBean tempPerson = new PersonBean();
    	boolean okClicked = mainApp.showPersonEditDialog(tempPerson);
    	if(okClicked) {
    		mainApp.getPersonData().add(tempPerson);
    	}
    }
	
	@FXML
	private void handleEditPerson() {
		PersonBean selectedPerson = tableView.getSelectionModel().getSelectedItem();
		if(selectedPerson != null) {
			boolean okClicked = mainApp.showPersonEditDialog(selectedPerson);
			if(okClicked) {
				showPersonDetails(selectedPerson);
			}
		} else {
			Alert alert = new Alert(AlertType.WARNING);
			alert.initOwner(mainApp.getPrimaryStage());
			alert.setTitle("No Selection");
			alert.setHeaderText("No Person Selected");
			alert.setContentText("Please select a person in the table.");
			
			alert.showAndWait();
		}
	}
    
	public void handleBtn1Action(ActionEvent event) {
		System.out.println("등록 누름");
	}

	public void handleBtn2Action(ActionEvent event) {
		System.out.println("수정 누름");
	}

	public void handleBtn3Action(ActionEvent event) throws SQLException {
		MainApp printSelect = new MainApp();
		PersonBean student = tableView.getSelectionModel().getSelectedItem();
		String sql = "delete from student where studentname = '"+student.getStudentName()+"'";
		System.out.println("삭제 누름");
		
		Dao dao = new Dao();
		if(dao.delete(sql)!= 0) {
			System.out.println("정상 삭제");
		}
		else {
			try {
				System.out.println("");
			}catch(NullPointerException e) {
			System.out.println("실패 삭제");
			}
		}
		int selectedIndex = tableView.getSelectionModel().getSelectedIndex();
		if(selectedIndex >= 0) {
			tableView.getItems().remove(selectedIndex);
		}
	}

	public void handleBtn4Action(ActionEvent event) {
		System.out.println("종료 누름");
		Platform.exit();
	}
}
