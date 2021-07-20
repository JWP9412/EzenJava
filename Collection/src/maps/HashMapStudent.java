
package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapStudent {

	public static void main(String[] args) {
		Map<Student, Integer> students = new HashMap<Student, Integer>();
		
		students.put(new Student(1010, "Ro"), 99);
		students.put(new Student(1020, "Moon"), 99);
		students.put(new Student(1030, "Park"), 99);
		
		 // 중복을 허용하지 않음 : Student에서 hashCode(),equals() 을 재정의
		students.put(new Student(1030, "Park"), 99);
		
		printMap(students);
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
