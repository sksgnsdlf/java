package co.micol.mvcTest;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import co.micol.mvcTestBean.GradeBean4;
import co.micol.mvcTestController.GradeViewController5;
import co.micol.mvcTestDAO.MvcDao3;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class GradeModel6 {
	private MvcDao3 dao ;
	private ResultSet rs;
	private GradeBean4 bean;
	private BorderPane root;
	
	private ObservableList<GradeBean4> gradeList = FXCollections.observableArrayList();
	
	public ObservableList<GradeBean4> gradegetData(){
		dao = new MvcDao3();
		String sql = "SELECT S.STUDENTID, STUDENTNAME,KOR,ENG,MATH " + 
				"FROM STUDENT S,LECTURE L " + 
				"WHERE S.studentid=l.studentid";
		try {
			rs = dao.select(sql);
			while(rs.next()) {
				String id = rs.getString("studentid");
				String name = rs.getString("studentname");
				int kor = rs.getInt("kor");
				int eng = rs.getInt("eng");
				int math = rs.getInt("math");
				int sum = kor + eng + math;
				float avg = (float) sum / 3;
				//avg = Math.round((avg*10)/10.0);
				bean = new GradeBean4(id, name, kor, eng, math, sum, avg);
				gradeList.add(bean);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		dao.close();
		return gradeList;
	}
	
	//여기에 폼 로드가 포함되어야 함
	public void subFormLoad() {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(MainApp7.class.getResource("../mvcTestView/gradeView2.fxml"));
		AnchorPane anch;		
		try {
			anch = loader.load();
			root.setCenter(anch);
			
			//controller 필요 setGradeView();
			GradeViewController5 gv = loader.getController();
			gv.setGradeView(this);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public Scene initLayout() {
		Scene scene = null;
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(MainApp7.class.getResource("../mvcTestView/layout1.fxml"));
		try {
			root = loader.load();
			subFormLoad();
			scene = new Scene(root);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return scene;
	}
}
