package section05;

import java.util.function.Predicate;

public class PredicateIsEqualExample {
	public static void main(String[] args) {
		predicateNull();
		predicateNullString();
		prediicateStringNull();
		prediicateStringString();
	}

	public static void predicateNull() {
		Predicate<String> pdc = Predicate.isEqual(null);
		System.out.println("null , null : " + pdc.test(null));
	}

	public static void predicateNullString() {
		Predicate<String> pdc = Predicate.isEqual("A");
		System.out.println("null , A : " + pdc.test(null));
	}
	
	public static void prediicateStringNull() {
		Predicate<String> pdc = Predicate.isEqual(null);
		System.out.println("A , null : " + pdc.test("A"));
	}
	
	public static void prediicateStringString() {
		Predicate<String> pdc = Predicate.isEqual("A");
		System.out.println("A , A : " + pdc.test("A"));
		
		Predicate<String> pdc2 = Predicate.isEqual("A");
		System.out.println("A , B : " + pdc2.test("B"));
	}
}