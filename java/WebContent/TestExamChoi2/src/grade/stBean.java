package grade;

public class stBean {
	public int id;
	public String name;
	public int kor;
	public int eng;
	public int math;
	public int his;

	public String toString() {
		int sum = kor + eng + math + his;
		float avg = (float)(kor + eng + math + his) / 4;
		System.out.println(id + " " + name + " " + kor + " " + eng + " " + math + " " + his + " " + sum + " " + avg);

		return null;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getHis() {
		return his;
	}

	public void setHis(int his) {
		this.his = his;
	}
	
}