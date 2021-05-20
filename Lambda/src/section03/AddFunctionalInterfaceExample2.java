package section03;

public class AddFunctionalInterfaceExample2 {

	public static void main(String[] args) {
		AddFunctionalInterface addFunc = (int a, int b) -> {
			int result = a + b;
			return result;
		};
		int result = addFunc.add((int)99.9, (int)1.9);
		System.out.println("result : " + result);

	}

}
