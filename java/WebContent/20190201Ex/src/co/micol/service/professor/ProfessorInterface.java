package co.micol.service.professor;

public interface ProfessorInterface { //3.인터페이스로 먼저 만들어야 4에서 편하게 상속가능
	String inputData();
	void excuteQuery(String sql);
	void serviceRun();
}
