package staticMemberClass;

/*
 * ���� ���� Ŭ���� ��� ����
 * 
 */
public class AExample {

	public static void main(String[] args) {
		/*
		 * �ܺ� Ŭ������ A�� �������� �ʾƵ� A�� ���� Ŭ������ C�� ��ü�� ������ �� �ִ�.
		 */
		// A a = new A();
		A.C.staticMethodC();
		A.C.D d = new A.C.D();
		A.C c = new A.C();
		c.methodC();

		// A.C.methodC(); //�ν��Ͻ� �޼ҵ�� ��ü�� ���ؼ��� ����(ȣ��) �� �� �ִ�.

		System.out.println("A.C.staticfieldC(�����ʵ�) : " + A.C.staticfieldC);

	}

}
