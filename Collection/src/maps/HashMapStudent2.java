
package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapStudent2 {

	public static void main(String[] args) {
		Map<Student, Integer> students = new HashMap<Student, Integer>();
		
		Student ro   = new Student(1010, "Ro");
		Student moon = new Student(1020, "Moon");
		Student park = new Student(1030, "Park");
		
		students.put(ro,90);
		students.put(moon,95);
		students.put(park, 100);
		
		 // �ߺ��� ������� ���� : Student���� hashCode(),equals() �� ������
		students.put(new Student(1030, "Park"), 99);
		
		printMap(students);
		searchMap(students, park);
		searchMap(students, moon);
		searchMap(students, ro);
	}
	
	static void searchMap(Map<Student, Integer> students, Student student) {
		Integer value = students.get(student);
		System.out.printf("> student: sno(%d), name(%s), value(%d) %n", 
				student.sno, student.name, value);
	}
	
	static void printMap(Map<Student, Integer> maps) {
		System.out.println("maps.size() : " + maps.size());

		Set<Map.Entry<Student, Integer>> entrySet = maps.entrySet();
		Iterator<Map.Entry<Student, Integer>> entryIterator = entrySet.iterator();
		
		while (entryIterator.hasNext()) {
			Map.Entry<Student, Integer> entry = entryIterator.next();
			Student student= entry.getKey();
			Integer value = entry.getValue();
			System.out.printf("key: sno(%d), name(%s), value(%d) %n", 
					student.sno, student.name, value);
		}
		System.out.println();
	}

}
