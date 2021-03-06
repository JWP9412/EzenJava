/*
 * [set]
 * 1. 중복해서 들어 가지 않음
 * 2. 순서가 무작위
 * 3. 저장된 순서가 보장되지 않는다.
 */
package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMember {

	public static void main(String[] args) {
		Set<Member> members = new HashSet<Member>();
		
		
		members.add(new Member("자바",20));
		members.add(new Member("파이썬",15));
		members.add(new Member("자바스크립트",25));
		
		
		printMember(members);
		
		
	}

	static void printMember(Set<Member> members) {
		System.out.println("members.size() : "+members.size());
		
		Iterator<Member> it = members.iterator();
		while(it.hasNext()) {
			Member member = it.next();
			System.out.printf("member : name(%s), age(%d) %n",member.name,member.age);
		}
			
		
		System.out.println();
	}
}
