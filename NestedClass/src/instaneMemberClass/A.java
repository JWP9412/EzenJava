package instaneMemberClass;

/*
 * [�ν��Ͻ� ��� Ŭ���� ����]
 *  - �ܺ� Ŭ������ ��ü�� ���� �ؾ߸� ���� Ŭ������ ����� �� �ִ�.
 *  - ���� Ŭ������ ���� �ʵ�� �޼ҵ带 ������ �� ����.
 */

public class A {
	A() {
		System.out.println("A(�ܺ�) Ŭ���� ����");
	}

	// ���� Ŭ����(�ν��Ͻ� ��� Ŭ����)
	// B�� A�� �ν��Ͻ�ȭ �Ǿü�� �Ǿ��� �� ����� �� �ִ�.
	class B {
		// static int staticfieldx = 0; //���� �ʵ带 ���� �� �� ����
		B() {
			System.out.println("B(����) Ŭ���� ����");
		}
		void methodB() {
			System.out.println("B(����) methodB() �޼ҵ� ����");
			
		}
		//���� �޼ҵ带 ������ �� ����.
		/*
		 static void staticmethodx() {
			
		}
		*/
	}
}
