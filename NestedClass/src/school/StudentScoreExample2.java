package school;

public class StudentScoreExample2 {

	public static void main(String[] args) {
		//Student student = new Student("����","010",21);
		//Student.Score score = student.new Score(100, 100, 100);
		
		Student2.Score score = new Student2.Score(90,90,90);
		
		int total = score.total();
		float average = score.avaerage();
		
		System.out.println("total : "+ total);
		System.out.println("average : "+ average);

	}

}
