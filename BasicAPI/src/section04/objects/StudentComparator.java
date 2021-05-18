package section04.objects;

import section04.objects.ComparatorExample.Student;

//학생 번호 비교자
public class StudentComparator implements Comparable<Student>{
	@Override
	public int compare(Student a,Student b) {
		if(a.sno<b.sno)return -1;
		else if(a.sno == b.sno)return ;
		else return 1;
	}
}
