package co.micol.student;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import co.micol.student.MainApp;
import co.micol.student.controller.PersonOverviewController;
import co.micol.student.dao.Dao;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainApp extends Application {

	private Stage primaryStage;
	private BorderPane rootLayout;
	private ObservableList<PersonBean> personData = FXCollections.observableArrayList(); 
	//해당 Bean클래스를 적어주면됨	이건 PersonBean을 사용
	
	public MainApp() throws SQLException {
		selectPerson();
	}
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("AddressApp");
		
		initLayout();
//		showPersonOverview();
		showPersonEditDialog(null);
	}

	public void initLayout() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(MainApp.class.getResource("view/formLayout.fxml"));
		try {
			rootLayout = loader.load();
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void showPersonOverview() {
		try {
			// 연락처 요약을 가져온다.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/form.fxml"));

			AnchorPane personOverview = (AnchorPane) loader.load();

			// 연락처 요약을 상위 레이아웃 가운데로 설정한다.
			rootLayout.setCenter(personOverview);
			
			PersonOverviewController controller = loader.getController();
	        controller.setMainApp(this);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public boolean showPersonEditDialog(PersonBean personBean) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/form.fxml"));
			AnchorPane personOverview;
			personOverview = (AnchorPane) loader.load();
			//다이얼로그 스테이지
	        Stage dialogStage = new Stage();
			dialogStage.setTitle("Edit Person");
			dialogStage.initModality(Modality.WINDOW_MODAL);
			dialogStage.initOwner(primaryStage);
			Scene scene = new Scene(personOverview);
			dialogStage.setScene(scene);
			
			PersonOverviewController controller = loader.getController();       
	        controller.setDialogstage(dialogStage);
	        controller.setPerson(personBean);
	        
	        dialogStage.showAndWait();
	        
	        return controller.isOkClicked();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}		
	}

	public ObservableList<PersonBean> getPersonData(){  //추가
		return personData;
	}
	
	private void selectPerson() throws SQLException {  //추가
		Dao dao = new Dao();
		String sql = "select * from student";
		ResultSet rs = dao.select(sql);
		while(rs.next()) {
			String id = rs.getString("studentid");
			String name = rs.getString("studentname");
			String addr = rs.getString("studentaddr");
			String tel = rs.getString("studenttel");
			
			PersonBean person = new PersonBean(id,name,addr,tel);
			personData.add(person);
		}
	}
	
	public Stage getPrimaryStage() {
		return primaryStage;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
