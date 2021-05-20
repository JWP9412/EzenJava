package section03;

//���ٽ� // �������̽��� �͸� ���� ��ü ����
public class MyFunctionalInterfaceExampleX {
	
	public static void main(String[] args) {
		step1();
		step2();
		step3();
		step4();
	}
	
	static void step1() {
		MyFunctionalInterfaceX myfunc = (int x) -> {
			System.out.println("MyFunctionalInterfaceX: x= " +x);
		};
		myfunc.method(99);
	}
	
	static void step2() {
		MyFunctionalInterfaceX myfunc = (x) -> {
			System.out.println("MyFunctionalInterfaceX: x= " +x);
		};
		myfunc.method(88);
	}
	
	static void step3() {
		MyFunctionalInterfaceX myfunc = x -> {
			System.out.println("MyFunctionalInterfaceX: x= " +x);
		};
		myfunc.method(77);
	}
	
	static void step4() {
		MyFunctionalInterfaceX myfunc = x -> 
			System.out.println("MyFunctionalInterfaceX: x= " +x);
		myfunc.method(66);
	}
}
