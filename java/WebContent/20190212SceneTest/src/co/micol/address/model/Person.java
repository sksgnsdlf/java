package co.micol.address.model;

import java.time.LocalDate;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
    private StringProperty studentId;
    private StringProperty studentName;
    private StringProperty studentAddr;
    private StringProperty studentTel;

    public Person() {
    	
    }

//	public Person(Dto dto) {
//        this.studentId = new SimpleStringProperty(dto.studentId);
//        this.studentName = new SimpleStringProperty(dto.studentName);
//        this.studentAddr = new SimpleStringProperty(dto.studentAddr);
//        this.studentTel = new SimpleStringProperty(dto.studentTel);
//    }
	
	public Person(String sId, String sName, String sAddr, String sTel) {
        this.studentId = new SimpleStringProperty(sId);
        this.studentName = new SimpleStringProperty(sName);
        this.studentAddr = new SimpleStringProperty(sAddr);
        this.studentTel = new SimpleStringProperty(sTel);
    }
	
    public void setStudentId(StringProperty studentId) {
		this.studentId = studentId;
	}

	public void setStudentName(StringProperty studentName) {
		this.studentName = studentName;
	}

	public void setStudentAddr(StringProperty studentAddr) {
		this.studentAddr = studentAddr;
	}

	public void setStudentTel(StringProperty studentTel) {
		this.studentTel = studentTel;
	}

	public StringProperty getStudentId() {
		return studentId;
	}

	public StringProperty getStudentName() {
		return studentName;
	}

	public StringProperty getStudentAddr() {
		return studentAddr;
	}

	public StringProperty getStudentTel() {
		return studentTel;
	}
}