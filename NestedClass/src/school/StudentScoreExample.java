package school;

public class StudentScoreExample {

	public static void main(String[] args) {
		Student student = new Student("����","010",21);
		Student.Score score = student.new Score(100, 100, 100);
		
		int total = score.total();
		float average = score.avaerage();
		
		student.information();
		System.out.println("total : "+ total);
		System.out.println("average : "+ average);

	}

}
