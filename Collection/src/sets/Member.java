package sets;

public class Member {
	String name;
	int age;
	
	public Member(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public int hashCode() {
		System.out.printf("[%s][%d][%d]\n",this.name,this.name.hashCode(),this.age);
		return this.name.hashCode() + this.age;
	}
	
	
	
	public boolean equals(Object obj) {
		System.out.println("equal : "+(this==obj));
		
		return this == obj;
		}
	
	public String hi() {
		return "hi";
	}
	
	
	/*
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return member.equals(name)&& (member.age==age);
		}else {
			return false;
		}
	}
	*/
}
