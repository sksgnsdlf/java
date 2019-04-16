package co.micol.runnable;

public class Student {
	private String name;
	private double englishScore;
	private double mathScore;
	
	public Student(String name, double englishScore, double mathScore) {
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}
	
	public String getName() { return name;}
	public double getEnglishScore() { return englishScore; }
	public double getMathScore() { return mathScore; }
}
