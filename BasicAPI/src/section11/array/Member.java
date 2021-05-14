package section11.array;

public class Member implements Comparable<Member> {
	String name;
	Member(String name){
		this.name = name;
	}
	
	/*
	@Override
	public int compareTo(Member member ) { // *-1 추가시 내림차순 정렬
		return name.compareTo(member.name)*-1;
	}
	*/
	
	@Override
	public int compareTo(Member member ) { // 오름차순 정렬
		return name.compareTo(member.name);
	}
}
