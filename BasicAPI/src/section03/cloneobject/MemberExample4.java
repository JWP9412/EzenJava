package section03.cloneobject;

//복제 객체를 변경하더라도 원본 객체는 변함 없음
public class MemberExample4 {

	public static void main(String[] args) {
		hello2();
	}
	public static void hello2() {
		String s1 = new String("hello");
		String s2 = s1;

		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);

		s2 = "world";

		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
	}
	public static void hello1() {
		String s1 = "hello";
		String s2 = s1;

		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);

		s2 = "world";

		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
	}
	
}
