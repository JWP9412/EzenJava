package section05;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample {
	private static List<Student>list = Arrays.asList(
			new Student("kim",90,96),
			new Student("shin",95,93),
			new Student("Ahn", 1, 1)
			);
	
	public static void printString(Function<Student, String> function) {
		for(Student student : list) {// list에 저장된 항목 수만큼 루핑
			System.out.print(function.apply(student)+" ");
		}
		System.out.println();
	}
	
	public static void printInt(ToIntFunction<Student> function) {
		for(Student student : list) {// list에 저장된 항목 수만큼 루핑
			System.out.print(function.applyAsInt(student)+" ");

		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		//studentName();
		studentScore();
		/*
		System.out.println("[학생 이름]");
		printString(t -> t.getName());
		
		System.out.println("[영어 점수]");
		printInt(t -> t.getEngScore());
		
		System.out.println("[수학 점수]");
		printInt(t -> t.getMathScore());
		*/
	}
	
	
	//printString(Function<Student, String> function)
	public static void studentName() {
		/*
		System.out.println("[학생 이름]");
		printString(t -> t.getName());
		※ 아래와 같다
		*/
		System.out.println("[학생 이름]");
		Function<Student, String> function =  (t) ->{
			return t.getName()+" ";
		};
		
		for(Student student : list) {// list에 저장된 항목 수만큼 루핑
			System.out.print(function.apply(student)+" \n");
		}
	}
	
	
	//printInt(ToIntFunction<Student> function)
	public static void studentScore() {
		System.out.println("[영어 점수]");
		ToIntFunction<Student> eng = t -> t.getEngScore();
		for(Student student : list) {// list에 저장된 항목 수만큼 루핑
			System.out.print(eng.applyAsInt(student)+"  ");
		}
		System.out.println();
		
		System.out.println("[수학 점수]");
		ToIntFunction<Student> math = t -> t.getMathScore();
		for(Student student : list) {// list에 저장된 항목 수만큼 루핑
			System.out.print(math.applyAsInt(student)+"  ");
		}
	}
}
