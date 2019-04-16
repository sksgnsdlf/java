//package co.micol.student.controller;
//
//import co.micol.student.MainApp;
//import co.micol.student.StudentBean;
//import javafx.fxml.FXML;
//import javafx.scene.control.Label;
//import javafx.scene.control.TableColumn;
//import javafx.scene.control.TableView;
//
//public class StudentViewControl {
//	@FXML private TableView<StudentBean> tableView; //studentBean(bto)사용
//	@FXML private TableColumn<StudentBean, String> tStudentId; //학번에 넣을거 + 학번에 들어올 타입
//	@FXML private TableColumn<StudentBean, String> tStudentName; //이름에 넣을꺼 + 이름에 들어갈 타입
//	
//	@FXML private Label lStudentId;
//	@FXML private Label lStudentName;
//	@FXML private Label lStudentAddr;
//	@FXML private Label lStudentTel;
//	
//	private MainApp mainApp;
//	
//	public StudentViewControl() {
//		
//	}
//	@FXML private void init() {
//		tStudentId.setCellValueFactory(cellData -> cellData.getValue().getsId()); //StudentBean에서 getsId값을 사용
//		tStudentName.setCellValueFactory(cellData -> cellData.getValue().getsName()); //StudentBean에서 getsName값을 사용
//	}
//	
//	public void setMainApp(MainApp mainApp) { //mainApp와 연결
//		this.mainApp = mainApp;
//		tableView.setItems(mainApp.getPersonData());
//	}
//}
