package accessfieldmethod;

public class AExample {

	public static void main(String[] args) {
		A a = new A();
		A.staticFieldC.methodC();
		
		A.staticMethod();
		a.staticMethod();
		//a.instanceMethod();

	}

}
