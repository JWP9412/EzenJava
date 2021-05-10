package anonymous.parents;

/*
 * ÀÍ¸í °´Ã¼
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
