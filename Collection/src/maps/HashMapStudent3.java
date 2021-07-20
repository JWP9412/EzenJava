
package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapStudent3 {

	public static void main(String[] args) {
		Map<Integer, Student> students = new HashMap<Integer, Student>();

		Student ro = new Student(1010, "Ro", 100);
		Student moon = new Student(1020, "Moon", 99);
		Student park = new Student(1030, "Park", 98);

		students.put(ro.sno, ro);
		students.put(moon.sno, moon);
		students.put(park.sno, park);

		printMap(students);

		searchMap(students, 1020);
		searchMap(students, 1030);
		searchMap(students, 1010);
		searchMapException(students, 2000);
	}

	static void searchMap(Map<Integer, Student> students, Integer key) {
		Student student = students.get(key);
		if (student != null) {
			System.out.printf("> student: key(%d), sno(%s), name(%s), value(%d) %n", key, student.sno, student.name,
					student.score);
		}else {
			System.out.printf("> student: key(%d) not found %n", key);
		}
	}
	
	static void searchMapException(Map<Integer, Student> students, Integer key) {
		try {
			Student student = students.get(key);
			System.out.printf("> student: key(%d), sno(%s), name(%s), value(%d) %n", key, student.sno, student.name,
						student.score);
		} catch (NullPointerException e) {
			System.out.printf("> student exception: key(%d) not found %n", key);
		}
		
	}

	static void printMap(Map<Integer, Student> maps) {
		System.out.println("maps.size() : " + maps.size());

		Set<Map.Entry<Integer, Student>> entrySet = maps.entrySet();
		Iterator<Map.Entry<Integer, Student>> entryIterator = entrySet.iterator();

		while (entryIterator.hasNext()) {
			Map.Entry<Integer, Student> entry = entryIterator.next();
			Integer key = entry.getKey();
			Student student = entry.getValue();
			System.out.printf("key(%d): sno(%d), name(%s), score(%d) %n", key, student.sno, student.name,
					student.score);
		}
		System.out.println();
	}

}
