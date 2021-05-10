package localMemberClass;

/*
 * [���� ��� Ŭ���� ����]
 * �ν��Ͻ� �޼ҵ� �ȿ� ���ǵ� Ŭ����
 * - ����������(public, private)�� ���� �� ����.
 * - ���� �ʵ�� �޼ҵ带 ������ �� ����.(static�� ���� �� ����.)
 */

public class A {
	private int x = 10;

	A() {
		System.out.println("A(�ܺ�) Ŭ���� ����");
	}

	void methodA() {
		class D {
			// static int staticfield = 99;
			private int x= 10;
			public D() {
				System.out.println("D(���� Ŭ����) Ŭ���� ������");
			}

			void methodD() {
				System.out.println("D(���� Ŭ����) methodD() �޼ҵ� ������");
			}

			private void printX() {
				System.out.println("D(���� Ŭ����) printX() : " + this.x);
			}
			// static void staticMethod() {}
		}
		D d = new D();
		d.methodD();
		d.printX();
		// private member field(���� ����)
		// System.out.println("D(���� Ŭ����) x= : " + this.x);
	}

	public static void main(String[] args) {
		A a = new A();
		a.x = 99;
		a.methodA();
	}
}
