package staticMemberClass;

/*
 * [���� ���� Ŭ���� ����]
 *  - ��� ������ �ʵ�� �޼ҵ带 ������ �� �ִ�.
 *  - �ʵ�� �޼ҵ��� ���ǰ� �ܺ�Ŭ������ �����ϰ� ������ �� �ִ�.
 */
public class A {
	A() {
		System.out.println("A(�ܺ�) Ŭ���� ����");
	}

	static class C {
		
		static class D{
			D(){
				System.out.println("D");
			}
		}
		static String staticfieldC = "staticfieldC"; 
		C() {
			System.out.println("C(���� ����)Ŭ����");
		}
		void methodC () {
			System.out.println("C(���� ����) Ŭ������ �ν��Ͻ� ��� �޼ҵ� : methodC()");
		}
		static void staticMethodC()	{
			System.out.println("C(���� ����) Ŭ������ ���� ��� �޼ҵ� : staticMethodC()");	
		}
	}
}
