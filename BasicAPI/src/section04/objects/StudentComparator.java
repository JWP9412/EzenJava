package section04.objects;

import section04.objects.ComparatorExample.Student;

//�л� ��ȣ ����
public class StudentComparator implements Comparable<Student>{
	@Override
	public int compare(Student a,Student b) {
		if(a.sno<b.sno)return -1;
		else if(a.sno == b.sno)return ;
		else return 1;
	}
}
