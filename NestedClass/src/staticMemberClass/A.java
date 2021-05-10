package staticMemberClass;

/*
 * [정적 내부 클래스 예제]
 *  - 모든 종류의 필드와 메소드를 정의할 수 있다.
 *  - 필드와 메소드의 정의가 외부클래스와 동일하게 정의할 수 있다.
 */
public class A {
	A() {
		System.out.println("A(외부) 클래스 생성");
	}

	static class C {
		
		static class D{
			D(){
				System.out.println("D");
			}
		}
		static String staticfieldC = "staticfieldC"; 
		C() {
			System.out.println("C(정적 내부)클래스");
		}
		void methodC () {
			System.out.println("C(정적 내부) 클래스의 인스턴스 멤버 메소드 : methodC()");
		}
		static void staticMethodC()	{
			System.out.println("C(정적 내부) 클래스의 정적 멤버 메소드 : staticMethodC()");	
		}
	}
}
