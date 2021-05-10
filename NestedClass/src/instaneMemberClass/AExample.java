package instaneMemberClass;
/*
 * A의 내부 클래스 B를 사용하기 위해서는
 * A가 인스턴스화 되어 객체가 되었을 때 사용할 수 있다.
 */
public class AExample {

	public static void main(String[] args) {
		A a = new A();
		/*
		 * 내부 클래스 생성 및 메소드 접근
		 */
		A.B b = a.new B();
		b.methodB();

	}

}
