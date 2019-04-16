package co.micol.mvcTestBean; //4번

import javafx.beans.property.FloatProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleSetProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class GradeBean4 {
	private StringProperty id;
	private StringProperty name; 
	private IntegerProperty kor;
	private IntegerProperty eng;
	private IntegerProperty math;
	private IntegerProperty sum;
	private FloatProperty avg;
	
	public GradeBean4(String id, String name, int kor, int eng, int math, int sum, float avg) {
		this.id = new SimpleStringProperty(id);
		this.name = new SimpleStringProperty(name);
		this.kor = new SimpleIntegerProperty(kor);
		this.eng = new SimpleIntegerProperty(eng);
		this.math = new SimpleIntegerProperty(math);
		this.sum = new SimpleIntegerProperty(sum);
		this.avg = new SimpleFloatProperty(avg);
	}
	
	public StringProperty getId() {
		return id;
	}
	public void setId(StringProperty id) {
		this.id = id;
	}
	public StringProperty getName() {
		return name;
	}
	public void setName(StringProperty name) {
		this.name = name;
	}
	public IntegerProperty getKor() {
		return kor;
	}
	public void setKor(IntegerProperty kor) {
		this.kor = kor;
	}
	public IntegerProperty getEng() {
		return eng;
	}
	public void setEng(IntegerProperty eng) {
		this.eng = eng;
	}
	public IntegerProperty getMath() {
		return math;
	}
	public void setMath(IntegerProperty math) {
		this.math = math;
	}
	public IntegerProperty getSum() {
		return sum;
	}
	public void setSum(IntegerProperty sum) {
		this.sum = sum;
	}
	public FloatProperty getAvg() {
		return avg;
	}
	public void setAvg(FloatProperty avg) {
		this.avg = avg;
	}
	//여기까진 get,set소스
	
	//밑으로는 적어서 추가한내용
	public String getid() {
		return this.id.get();
	}
	public String getname() {
		return this.name.get();
	}
	public int getkor() {
		return this.kor.get();
	}
	public int geteng() {
		return this.eng.get();
	}
	public int getmath() {
		return this.math.get();
	}
	public int getsum() {
		return this.sum.get();
	}
	public float getavg() {
		return this.avg.get();
	}
}
