package co.micol.address;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import co.micol.address.model.Dao;
import co.micol.address.model.Person;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {

	private Stage primaryStage;
	private BorderPane rootLayout;
	private ObservableList<Person> personData = FXCollections.observableArrayList(); //추가
//	private VBox vbox;
	
	public MainApp() throws SQLException {
		selectPerson();
	}
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("AddressApp");
		
		initRootLayout();
		showPersonOverview();
	}

	/**
	 * 상위 레이아웃을 초기화한다.
	 */
	public void initRootLayout() {
		try {
			// fxml 파일에서 상위 레이아웃을 가져온다.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
			// loader.setLocation(MainApp.class.getResource("view/rootView.fxml"));
			rootLayout = (BorderPane) loader.load();
//           vbox=loader.load();

			// 상위 레이아웃을 포함하는 scene을 보여준다.
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 상위 레이아웃 안에 연락처 요약(person overview)을 보여준다.
	 */
	public void showPersonOverview() {
		try {
			// 연락처 요약을 가져온다.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/PersonOverview.fxml"));
			// loader.setLocation(MainApp.class.getResource("view/login.fxml"));

			AnchorPane personOverview = (AnchorPane) loader.load();

			// 연락처 요약을 상위 레이아웃 가운데로 설정한다.
			rootLayout.setCenter(personOverview);
			
			PersonOverviewController controller = loader.getController();
	        controller.setMainApp(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ObservableList<Person> getPersonData(){  //추가
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
			
			Person person = new Person(id,name,addr,tel);
			personData.add(person);
		}
	}
	
	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public static void main(String[] args) {
		launch(args);
	}
}