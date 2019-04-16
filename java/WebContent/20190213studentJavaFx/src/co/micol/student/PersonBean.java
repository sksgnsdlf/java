package co.micol.student;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PersonBean {
	   private StringProperty studentId;
	    private StringProperty studentName;
	    private StringProperty studentAddr;
	    private StringProperty studentTel;

	    public PersonBean() {
	    	
	    }
		
		public PersonBean(String sId, String sName, String sAddr, String sTel) {
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
		
		public StringProperty StudentId() {
			return studentId;
		}

		public StringProperty StudentName() {
			return studentName;
		}

		public StringProperty StudentAddr() {
			return studentAddr;
		}

		public StringProperty StudentTel() {
			return studentTel;
		}

		public String getStudentId() {
			return studentId.get();
		}
		
		public String getStudentName() {
			return studentName.get();
		}
		
		public String getStudentAddr() {
			return studentAddr.get();
		}
		
		public String getStudentTel() {
			return studentTel.get();
		}

		public void setStudentTel(String text) {
			// TODO Auto-generated method stub
			
		}

		public void setStudentId(String text) {
			// TODO Auto-generated method stub
			
		}

		public void setStudentName(String text) {
			// TODO Auto-generated method stub
			
		}

		public void setStudentAddr(String text) {
			// TODO Auto-generated method stub
			
		}

	}