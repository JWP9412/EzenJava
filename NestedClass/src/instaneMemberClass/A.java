package instaneMemberClass;

/*
 * [인스턴스 멤버 클래스 예제]
 *  - 외부 클래스의 객체를 생성 해야만 내부 클래스를 사용할 수 있다.
 *  - 내부 클래스는 정적 필드와 메소드를 정의할 수 없다.
 */

public class A {
	A() {
		System.out.println("A(외부) 클래스 생성");
	}

	// 내부 클래스(인스턴스 멤버 클래서)
	// B는 A가 인스턴스화 되어객체가 되었을 때 사용할 수 있다.
	class B {
		// static int staticfieldx = 0; //정적 필드를 정의 할 수 없다
		B() {
			System.out.println("B(내부) 클래스 생성");
		}
		void methodB() {
			System.out.println("B(내부) methodB() 메소드 생성");
			
		}
		//정적 메소드를 정의할 수 없다.
		/*
		 static void staticmethodx() {
			
		}
		*/
	}
}
