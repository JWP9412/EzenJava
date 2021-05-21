package section06;
/*
 * [�޼ҵ� ����]
 * - ���ٽĿ��� �޼ҵ� ����
 */
import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {
	public static void main(String[] args) {
		referenceStaticMethod();
		referenceInstanceMethod();
	}
	/*
	 * Ŭ������ �̸����� ���� �޼ҵ� ����
	 */
	public static void referenceStaticMethod() {
		// ���� �޼ҵ� ����
		IntBinaryOperator oper = (x, y) -> Calculator.staticMethod(x, y);
		System.out.println("�����޼ҵ�1 : " + oper.applyAsInt(10, 20));

		oper = Calculator::staticMethod;
		System.out.println("�����޼ҵ�2 : " + oper.applyAsInt(30, 40));

		System.out.println("������� ���� : " + Calculator.staticVal);
	}
	/*
	 * Ŭ������ �ν��Ͻ� ��ü ���������� �޼ҵ� ����
	 */
	public static void referenceInstanceMethod() {
		// �ν��Ͻ� �޼ҵ� ����
		Calculator obj = new Calculator();
		IntBinaryOperator oper = (x, y) -> obj.instanceMethod(x, y);
		System.out.println("�ν��Ͻ� �޼ҵ� 3 : " + oper.applyAsInt(5, 6));

		oper = obj::instanceMethod;
		System.out.println("�ν��Ͻ� �޼ҵ� 4 : " + oper.applyAsInt(7, 8));
	}
}
