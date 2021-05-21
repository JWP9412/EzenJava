package section05;
/*
 * [Predicate �Լ��� �������̽�]
 * - Predicate<T> 		: boolean tset(T t)
 * - Bipredicate<T,U> 	: boolean test(T t,U u)
 * - DoublePredicate 	: boolean test(doube value)
 * - IntPredicate 		: boolean test(int value)
 * - LongPredicate	 	: boolean test(long value)
 */
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class PredicateExample {
	private static List<Student> list = Arrays.asList(
			new Student("Hong", "Male", 90),
			new Student("Kim", "Fe", 90),
			new Student("Kam", "Male", 95),
			new Student("Park", "Fe", 92),
			new Student("Dog", "Ani", 10),
			new Student("Cat", "Ani", 10));


public static double avg(Predicate<Student> predicate) {
	int count = 0, sum =0;
	for(Student student : list) {
		if(predicate.test(student)) {
			count++;
			sum += student.getScore();
		}
	}
	
	return (double) sum/count;

}
	public static void main(String[] args) {
		double maleAvg = avg((Student t) -> {
			return t.getSex().equals("Male");	
		});
		System.out.println("���� ��� ���� : "+maleAvg);
		
		double femaleAvg = avg(new Predicate<Student>() {
			@Override
			public boolean test(Student t) {
				return t.getSex().equals("Fe");
			}
		});
				
		System.out.println("���� ��� ���� : "+femaleAvg);
		
		double aniAvg = avg(t -> t.getSex().equals("Ani"));
		System.out.println("���� ��� ���� : "+aniAvg);
	
	}
}
