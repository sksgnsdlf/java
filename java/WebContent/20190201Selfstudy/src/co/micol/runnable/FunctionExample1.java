package co.micol.runnable;

import java.util.List;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {
	 
	 
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 90, 96), 
			new Student("신용권", 95, 93)
			);

	public static void printString(Function<Student, String> function) {
		for (Student student : list) {
			System.out.println(function.apply(student) + " ");
		}
		System.out.println();
	}

	public static double avg(Function<Student, Double> function) {
		double sum = 0;
		double avg = 0;
		for (Student student : list) {
			sum += function.apply(student);
//			System.out.println(function.applyAsInt(student) + " ");
		}
		avg = (double)sum / list.size();
		return avg;
	}

	public static void main(String[] args) {
		double englishAvg = avg( s -> s.getEnglishScore());
		System.out.println("영어 평균은" + englishAvg);
		double mathAvg = avg ( s -> s.getMathScore());
		System.out.println("수학 평균은" + mathAvg);
//		System.out.println("[학생 이름]");
//		printString(t -> t.getName());

//		System.out.println("[영어 점수]");
//		printInt(t -> t.getEnglishScore());

//		System.out.println("[수학 점수]");
//		printInt(t -> t.getMathScore());
	}
}
