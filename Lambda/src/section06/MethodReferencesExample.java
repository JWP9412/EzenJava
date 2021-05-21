package section06;
/*
 * [메소드 참조]
 * - 람다식에서 메소드 참조
 */
import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {
	public static void main(String[] args) {
		referenceStaticMethod();
		referenceInstanceMethod();
	}
	/*
	 * 클래스의 이름으로 정적 메소드 참조
	 */
	public static void referenceStaticMethod() {
		// 정적 메소드 참조
		IntBinaryOperator oper = (x, y) -> Calculator.staticMethod(x, y);
		System.out.println("정적메소드1 : " + oper.applyAsInt(10, 20));

		oper = Calculator::staticMethod;
		System.out.println("정적메소드2 : " + oper.applyAsInt(30, 40));

		System.out.println("정적멤버 변수 : " + Calculator.staticVal);
	}
	/*
	 * 클래스의 인스턴스 객체 참조변수로 메소드 참조
	 */
	public static void referenceInstanceMethod() {
		// 인스턴스 메소드 참조
		Calculator obj = new Calculator();
		IntBinaryOperator oper = (x, y) -> obj.instanceMethod(x, y);
		System.out.println("인스턴스 메소드 3 : " + oper.applyAsInt(5, 6));

		oper = obj::instanceMethod;
		System.out.println("인스턴스 메소드 4 : " + oper.applyAsInt(7, 8));
	}
}
