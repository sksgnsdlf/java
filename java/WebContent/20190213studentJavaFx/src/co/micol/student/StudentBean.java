package co.micol.student;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class StudentBean {
	private final StringProperty sId;
	private final StringProperty sName;
	private final StringProperty sAddr;
	private final StringProperty sTel;
	
	public StudentBean(String sId, String sName, String sAddr, String sTel) {
		this.sId = new SimpleStringProperty(sId);
		this.sName = new SimpleStringProperty(sName);
		this.sAddr = new SimpleStringProperty(sAddr);
		this.sTel = new SimpleStringProperty(sTel);
	}
	
	public StudentBean() {
		this(null,null,null,null);
	}

	public StringProperty getsId() {
		return sId;
	}

	public StringProperty getsName() {
		return sName;
	}

	public StringProperty getsAddr() {
		return sAddr;
	}

	public StringProperty getsTel() {
		return sTel;
	}
	
	public void setSId(String sId) {
		this.sId.set(sId);
	}
	
	public void setSName(String sName) {
		this.sName.set(sName);
	}
	
	public void setSAddr(String sAddr) {
		this.sAddr.set(sAddr);
	}
	
	public void setSTel(String sTel) {
		this.sTel.set(sTel);
	}
	
	public String getSId() {
		return sId.get();
	}
	
	public String getSName() {
		return sName.get();
	}
	
	public String getSAddr() {
		return sAddr.get();  //sId.get()
	}
	
	public String getSTel() {
		return sTel.get();  //sId.get()
	}
}
