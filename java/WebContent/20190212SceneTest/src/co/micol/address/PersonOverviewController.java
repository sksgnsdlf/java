package co.micol.address;

import java.net.URL;
import java.util.ResourceBundle;

import co.micol.address.model.Person;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class PersonOverviewController implements Initializable {

	
	@FXML private TableView<Person> personTable;
	@FXML private TableColumn<Person, String> cstudentId;
	@FXML private TableColumn<Person, String> cstudentName;
	@FXML private Label lstudentId;
	@FXML private Label lstudentName;
	@FXML private Label lstudentAddr;
	@FXML private Label lstudentTel;
	
	private MainApp mainApp;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// 이벤트핸들연결하는 부분
		// fxml onAction 이용해서 연결하면 이부분 필요 업음
		cstudentId.setCellValueFactory(cellData -> cellData.getValue().getStudentId());
		cstudentName.setCellValueFactory(cellData -> cellData.getValue().getStudentName());
		
	}
	//이벤트 메소드 구현
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;

        // 테이블에 observable 리스트 데이터를 추가한다.
        personTable.setItems(mainApp.getPersonData());
    }
}
