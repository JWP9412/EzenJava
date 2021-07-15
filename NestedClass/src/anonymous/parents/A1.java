package anonymous.parents;

/*
 * 익명 객체
 */
public class A1 {
	Parent field = new Parent() {
		int childField = 99;

		@Override
		void parentMethod(String loc) {
			System.out.println("A1.parentMethod() -> " + loc);
			fieldMethod();
		}

		void fieldMethod() {
			System.out.println("A1.fieldMethod() -> " + childField);
		}
	};

	void accessField() {
		field.parentMethod("accessField");
		field.parentMethodX("accessField");
		
		// 부모 클래스나 인터페이스에 선언된 플드와 메소드 외에
		// 새로운 필드나 메소드를 선언할 수 있지만,
		// 익명 객체 내부에서만 사용이 가능하다.
		
		//field.fieldMethod();
		//field.chiladField;
	}

	void method() {
		Parent localVar = new Parent() {
			@Override
			void parentMethod(String loc) {
				System.out.println("A1.parentMethod() -> " + loc);
			}
		};
	}

	public static void main(String[] args) {
		A1 a = new A1();
		a.field.parentMethod("A.main");
		a.method();
		a.accessField();
	}
}
