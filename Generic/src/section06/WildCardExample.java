package section06;

import java.util.Arrays;

public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " ������ : " 
	+ Arrays.toString(course.getStudents()));
	}

	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("�Ϲ��ΰ���", 5);
		personCourse.add(new Person("�Ϲ���"));
		personCourse.add(new Worker("������"));
		personCourse.add(new Student("�л�"));
		personCourse.add(new HighStudent("����л�"));
		System.out.println();
		
		Course<Worker> workerCourse = new Course<Worker>("�����ΰ���", 5);
		//workerCourse.add("������");

		Course<Student> studentCourse = new Course<Student>("�л�����", 5);
		//studentCourse.add("�л�");
		studentCourse.add(new HighStudent("����л�"));

		Course<HighStudent> highStudentCourse = new Course<HighStudent>("����л�����", 5);
		highStudentCourse.add(new HighStudent("����л�"));

		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();
		
		//registerCourseStudents(personCourse);
		//registerCourseStudents(workerCourse);
		registerCourseStudents(studentCourse);
		registerCourseStudents(highStudentCourse);
		System.out.println();
		
		registerCourseWorker(workerCourse);
		registerCourseWorker(workerCourse);
		//registerCourseWorker(studentCourse);
		//registerCourseWorker(highStudentCourse);
		System.out.println();
		
	}

}
