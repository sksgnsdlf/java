package co.micol.mvcTestController; //5번

import java.net.URL;
import java.util.ResourceBundle;

import co.micol.mvcTest.GradeModel6;
import co.micol.mvcTestBean.GradeBean4;
import javafx.beans.Observable;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class GradeViewController5 implements Initializable {
	@FXML private TableView<GradeBean4> tableView;
	@FXML private TableColumn<GradeBean4, String> colId;
	@FXML private TableColumn<GradeBean4, String> colName;
	@FXML private Label lKor;
	@FXML private Label lEng;
	@FXML private Label lMath;
	@FXML private Label lSum;
	@FXML private Label lAvg;
	
	private GradeModel6 Model;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
			colId.setCellValueFactory(cellData -> cellData.getValue().getId()); //property을 가져와야함
			colName.setCellValueFactory(cellData -> cellData.getValue().getName());
			
			//grade pane detail date method call
			showView(null);
			
			//listener call
			tableView.getSelectionModel().selectedItemProperty().addListener((observable,oldValue,newValue)->showView(newValue));
	}
	
	private void showView(GradeBean4 bean) {
		if(bean != null) {
			lKor.setText(Integer.toString(bean.getkor()));
			lEng.setText(Integer.toString(bean.geteng()));
			lMath.setText(Integer.toString(bean.getmath()));
			lSum.setText(Integer.toString(bean.getsum()));
			lAvg.setText(Float.toString(bean.getavg()));
		}else {
			lKor.setText(" ");
			lEng.setText(" ");
			lMath.setText(" ");
			lSum.setText(" ");
			lAvg.setText(" ");
		}	
		
		}//controller와 연결 되어야함
		public void setGradeView(GradeModel6 model) {
			tableView.setItems(model.gradegetData());
	}
}
