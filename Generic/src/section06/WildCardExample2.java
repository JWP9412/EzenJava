package section06;

import java.util.Arrays;

public class WildCardExample2 {
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " 수강생 : " 
	+ Arrays.toString(course.getStudents()));
	}


	public static void main(String[] args) {
		Course<Student> studentCourse = new Course<Student>("학생과정", 5);
		// personCourse.add(new Person("일반인"));
		// personCourse.add(new Worker("직장인"));
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));
		System.out.println();

		registerCourse(studentCourse);
		System.out.println();
		
		
	}

}
