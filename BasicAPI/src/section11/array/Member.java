package section11.array;

public class Member implements Comparable<Member> {
	String name;
	Member(String name){
		this.name = name;
	}
	
	/*
	@Override
	public int compareTo(Member member ) { // *-1 �߰��� �������� ����
		return name.compareTo(member.name)*-1;
	}
	*/
	
	@Override
	public int compareTo(Member member ) { // �������� ����
		return name.compareTo(member.name);
	}
}
