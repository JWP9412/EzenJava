package section06;

import java.util.Arrays;

public class WildCardExample2 {
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " ������ : " 
	+ Arrays.toString(course.getStudents()));
	}


	public static void main(String[] args) {
		Course<Student> studentCourse = new Course<Student>("�л�����", 5);
		// personCourse.add(new Person("�Ϲ���"));
		// personCourse.add(new Worker("������"));
		studentCourse.add(new Student("�л�"));
		studentCourse.add(new HighStudent("����л�"));
		System.out.println();

		registerCourse(studentCourse);
		System.out.println();
		
		
	}

}
