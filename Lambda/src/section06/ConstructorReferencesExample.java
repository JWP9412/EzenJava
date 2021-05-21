package section06;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {
	public static void main(String[] args) {
		Function<String, Member>function1 = Member :: new;
		Member member1 =function1.apply("angel");
		System.out.println("member1 : "+ member1.getID());
		
		BiFunction<String, String, Member> function2 = Member :: new;
		Member member2 = function2.apply("TwoSome", "angel");
		System.out.println("member2 : "+ member2.getID());
		System.out.println("member2 : "+ member2.getName());
		
		BiFunction<String, String, Member> function3 = (name, id) ->
		new Member(name, id);
		Member member3 = function3.apply("Star", "bucks");
		System.out.println("member3 Id : "+ member3.getID());
		System.out.println("member3 Name : "+ member3.getName());
	}
}
