package instaneMemberClass;
/*
 * A�� ���� Ŭ���� B�� ����ϱ� ���ؼ���
 * A�� �ν��Ͻ�ȭ �Ǿ� ��ü�� �Ǿ��� �� ����� �� �ִ�.
 */
public class AExample {

	public static void main(String[] args) {
		A a = new A();
		/*
		 * ���� Ŭ���� ���� �� �޼ҵ� ����
		 */
		A.B b = a.new B();
		b.methodB();

	}

}
