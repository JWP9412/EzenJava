package section04.objects;

//비교자 사용
import java.util.Comparator;
import java.util.Objects;

public class ComparatorExample {

	public static void main(String[] args) {
		Student s1 = new Student(10,1);
		Student s2 = new Student(10,2);
		Student s3 = new Student(30,3);

		int result = Objects.compare(s1, s2, new StudentComparator());
		System.out.println("(s1==s2) : " + result);
		System.out.println("(s1==s2) : " + ((result == 0) ? "같다" : (result > 0) ? "크다" : "작다"));
		result = Objects.compare(s1, s3, new StudentComparator());
		System.out.println("(s1==s3) : " + result);
		System.out.println("(s1==s3) : " + ((result == 0) ? "같다" : (result > 0) ? "크다" : "작다")); // : 아니면

		boolean tf = (result == -1) ? true : false;
		System.out.println("tf : " +tf);
	}

	
	
	static class Student {
		int sno;
		int ssn;
		Student(int sno, int ssn) {
			this.sno = sno;
			this.ssn = ssn;
		}
	}

	static class StudentComparator implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
			// if(o1.sno<o2.sno) return 0;
			// else if(o1.sno==02.sno return 0;
			// else return 1;
			return Integer.compare(o1.sno, o2.sno);
		}
	}

}
